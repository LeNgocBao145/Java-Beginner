package Lab02;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
//		Bài 1: Cho phương trình ax + b = 0
//		Viết chương trình nhập vào 2 số nguyên a và b. Tính toán nghiệm của phương trình
//		trên
//		Gợi ý:
//		- Nếu a = 0, b = 0 => thông báo "phương trình có vô số nghiệm"
//		- Nếu a = 0, b # 0 => thông báo "phương trình vô nghiệm"
//		- Còn lại: x = -b/a => thông báo x = ?

		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập a: ");
		double a = scanner.nextInt();

		System.out.println("Nhập b: ");
		double b = scanner.nextInt();

		if (a == 0 && b == 0) {
			System.out.println("Phương trình có vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("Phương trình vô nghiệm");
		} else {
			double x = (-b) / a;
			System.out.println("Phương trình có nghiệm x = " + x);
		}

		scanner.close();
	}
}
