package Lab04;

import java.util.Scanner;

public class Product {
	Scanner in = new Scanner(System.in);

	private String name;
	private double price;
	private double tax;

	public Product() {

	}

	public Product(String name, double price, double tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public void nhapThongTin() {
		this.name = in.nextLine();
		this.price = in.nextDouble();
		this.tax = in.nextDouble();
	}

	public void xuatThongTin() {
		System.out.println("Name: " + name + " - Price: " + price + " - Tax: " + tax);
	}

	public double getTaxPrice() {
		return tax * price;
	}

	public void setName(String name1) {
		this.name = name1;
	}

	public void setPrice(double price1) {
		this.price = price1;
	}

	public void setTax(double tax1) {
		this.tax = tax1;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public double getTax() {
		return tax;
	}
}
