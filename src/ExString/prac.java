package ExString;

import java.util.ArrayList;
import java.util.Scanner;

public class prac {
	public static void main(String[] args) {
		// Ex1
		Scanner in = new Scanner(System.in);

//		System.out.println("Nhập username: ");
//		String name = in.nextLine();
//		System.out.println("Nhập password: ");
//		String pass = in.nextLine();
//
//		if (name.equals("hoidanit") && pass.length() > 6) {
//			System.out.println("Tài khoản hợp lệ");
//		} else {
//			System.out.println("Tài khoản không hợp lệ");
//		}

		// Ex2
		ArrayList<Student> arr = new ArrayList<>();

		Student p1 = new Student("Lê Ngọc Bảo", 1405);
		arr.add(p1);
		Student p2 = new Student("Nguyễn Ân", 2206);
		arr.add(p2);
		Student p3 = new Student("Lê Vượng", 0707);
		arr.add(p3);
		Student p4 = new Student("Lê Nguyễn Bích", 2911);
		arr.add(p4);
		Student p5 = new Student("Nguyễn Ái Quốc", 1905);
		arr.add(p5);

		for (int i = 0; i < arr.size(); i++) {
			String firstName = arr.get(i).getName().substring(0, 6);
			if (firstName.equals("Nguyễn")) {
				System.out.println("Name: " + arr.get(i).getName() + " - Id: " + arr.get(i).getId());
			}
		}

		in.close();
	}
}
