package com.radwa;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String url = "jdbc:mysql://localhost:3306/college_db";
        String username = "root";
        String password = "8695";
        Connection con=null;
        Savepoint sp1=null,sp2=null;
        try {
            con = DriverManager.getConnection(url, username, password);
            Statement smt=con.createStatement();
            con.setAutoCommit(false);  //until commit function call all statement will not execute

            smt.executeUpdate("""
                    insert into student(name,course,marks) values ('student1','btech',89),
                    ('student2','bsc',88),('student3','bca',78);
                    """);
           sp1=con.setSavepoint("insert");
            smt.executeUpdate("""
                    update student set course='mca' where name='student2';
                    """);
            sp2=con.setSavepoint("update");
           smt.executeUpdate("""
                   delete from student where name=="student3";
                   """);
//            con.setAutoCommit(true);
//            Statement st = con.createStatement();
//            st.execute("create database College_db");
//            System.out.println("database created");
//            st.execute("use college_db");
//            String query = """
//                    create table student( id int primary key auto_increment,
//                    name varchar(50),
//                    course varchar(50),
//                    marks double);
//                    """;
//            st.execute(query);
//            System.out.println("table created");
//
//            CallableStatement cst = con.prepareCall("{call getStudents()}");
//            ResultSet rs = cst.executeQuery();
//
//            while (rs.next()) {
//                int id = rs.getInt("id");
//                String name = rs.getString("name");
//                String course = rs.getString("course");
//                double marks = rs.getDouble("marks");
//                System.out.println(String.format("%d\t%s\t%s\t\t%f", id, name, course, marks));
//            }
//          con.commit();
        } catch (SQLException e) {
            try{
                con.rollback(sp1);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }finally {
             
        }
    }
}