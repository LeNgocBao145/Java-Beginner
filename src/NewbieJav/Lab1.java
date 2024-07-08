package NewbieJav;

import java.util.Scanner;

public class Lab1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Exercise 1
		System.out.println("Type name: ");
		String name = scanner.nextLine();
		System.out.println("Type score: ");
		int score = scanner.nextInt();

		System.out.println(name + " có điểm = " + score);

		// Exercise 2
		System.out.println("Chiều dài của hình chữ nhật là ");
		double length = scanner.nextInt();

		System.out.println("Chiều rộng của hình chữ nhật là ");
		double width = scanner.nextInt();

		double perimeter = (length + width) * 2;
		double acreage = length * width;
		double min = Math.min(length, width);

		System.out.println("Chu vi hình chữ nhật là " + perimeter);
		System.out.println("Diện tích hình chữ nhật là " + acreage);
		System.out.println("Cạnh nhỏ nhất của hình chữ nhật là " + min);

		// Exercise 3
		System.out.println("Cạnh của khồi lập phương là ");
		double edge = scanner.nextInt();

		// double volume = edge * edge * edge;
		double volume = Math.pow(edge, 3);

		System.out.println("Thể tích hình lập phương là " + volume);

		scanner.close();
	}
}
