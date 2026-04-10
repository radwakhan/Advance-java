package polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
	private int pid;
	private String productName;
	private double price;
	private int quantity;

	public Product(int pid, String productName, double price, int quantity) {
		super();
		this.pid = pid;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPid() {
		return pid;
	}

	public String getProductName() {
		return productName;
	}

}

public class MainEnc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Product p1 = new Product(1, "Mobile phone", 20000, 10);
//		String result = String.format("Pid=%d, Product name=%s, price=%f and quantity=%d", p1.getPid(),
//				p1.getProductName(), p1.getPrice(), p1.getQuantity());
//		System.err.println(result);
		Scanner sc = new Scanner(System.in);
		List<Product> obj = new ArrayList<>();
		Product list;
		for (int i = 1; i <= 5; i++) {
			int pid = i;
			System.out.println("enter product information " + pid);
			System.out.println("enter product name " + i);
			String pname = sc.next();
			System.out.println("enter price: " + i);
			double price = sc.nextDouble();
			System.out.println("enter quantity");
			int qty = sc.nextInt();
			list = new Product(pid, pname, price, qty);
			obj.add(list);
		}
		System.out.println("Product ID\tProduct Name\tProduct Price\tProduct Qty");
		for (Product p : obj) {
			String result = String.format("  %d \t%s \t%f \t%d", p.getPid(), p.getProductName(), p.getPrice(),
					p.getQuantity());
			System.out.println(result);
		}
		sc.close();

	}

}
