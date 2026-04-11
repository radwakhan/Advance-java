package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) {

String url="jdbc:mysql://localhost:3306/studentdb2";
String username="root";
String password="8695";

try{
    Connection con= DriverManager.getConnection(url,username,password);
    System.out.println("connected successfully");

    Statement st=con.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
            ResultSet.CONCUR_UPDATABLE
    );

    ResultSet rs=st.executeQuery("Select * from student");
    System.out.println("ID\tname\tcourse\tmarks");

//    print reverse
//    while(rs.next()){}
//    rs.last();
//    while (rs.previous()){
    while(rs.next()){
        double marks=rs.getDouble("marks");
        if(marks<=70){
            rs.updateDouble("marks",marks+5);
            rs.updateRow();
        }
        int id=rs.getInt("id");
        String name=rs.getString("name");
        String course=rs.getString("course");
        marks=rs.getDouble("marks");
        System.out.println(String.format("%d\t%s\t%s\t\t%f",id,name,course,marks));
    }
//    int rows=st.executeUpdate("insert into student (name,course,marks) values ('khushi','mca',85.5),('mahi','mca',67)");
//    if(rows>0){
//        System.out.println("data inserted");
//    }
} catch (SQLException e) {
    throw new RuntimeException(e);
}
    }
}

//database running
//portnumber
//jarfile
//add jarfile to classpath
//write code
//load class
//connection establish
//make statement 3 types of statement
// create execute, insert value executeupdate,
// as i have done using mavenrepo i need to remember driver
// settings of createstatement