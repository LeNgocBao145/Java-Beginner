package chapter04;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

//		String name = in.nextLine();
//		int age = in.nextInt();
		ArrayList<Student> newbie = new ArrayList<Student>();

		for (int i = 0; i < 5; i++) {
			Student tmp = new Student();
			String name = in.nextLine();
			int age = in.nextInt();
			in.nextLine();

			tmp.name = name;
			tmp.age = age;

			newbie.add(tmp);
		}

		for (int i = 0; i < 5; i++) {
//			System.out.println("Name: " + newbie[i].name);
//			System.out.println("Age: " + newbie[i].age);
			System.out.println(newbie.get(i).name + " " + newbie.get(i).age);
		}

		in.close();
	}
}
