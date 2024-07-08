package chapter04;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String name = in.nextLine();
		int age = in.nextInt();
		Student newbie = new Student(name, age);

//		for (int i = 0; i < 5; i++) {
//			newbie[i].name = in.nextLine();
//			newbie[i].age = in.nextInt();
//		}

//		for (int i = 0; i < 5; i++) {
		System.out.println("Name: " + newbie.getName());
		System.out.println("Age: " + newbie.getAge());
		System.out.println("\n");
		// }

		newbie.setName("Niggar");
		newbie.setAge(100);

		System.out.println("Name: " + newbie.getName());
		System.out.println("Age: " + newbie.getAge());
		System.out.println("\n");

		in.close();
	}
}
