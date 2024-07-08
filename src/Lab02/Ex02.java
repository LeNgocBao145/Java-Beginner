package Lab02;

import java.util.Scanner;

public class Ex02 {
	public static void phuongTrinhBacNhat(double a, double b) {
		if (a == 0 && b == 0) {
			System.out.println("Phương trình có vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("Phương trình vô nghiệm");
		} else {
			double x = (-b) / a;
			System.out.println("Phương trình có nghiệm x = " + x);
		}
	}

	public static void main(String[] args) {
//		Bài 2: Cho phương trình: ax^2 + bx + c = 0
//		Viết chương trình nhập vào 3 số nguyên a, b, c. Tính toán nghiệm của phương trình
//		trên
//		Gợi ý:
//		- Nếu a = 0 => làm tương tự ví dụ bài 1
//		- Nếu a # 0:
//		- Tính delta = b^2 - 4ac.
//		- Nếu delta < 0 => thông báo "phương trình vô nghiệm"
//		- Nếu delta = 0 => thông báo "nghiệm kép x = -b/(2*a)
//		- Nếu delta > 0 => thông báo có 2 nghiệm riêng biệt
//		x1 = (-b + căn(delta))/(2*a)
//		x2 = (-b - căn(delta))/(2*a)

		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập a: ");
		double a = scanner.nextDouble();

		System.out.println("Nhập b: ");
		double b = scanner.nextDouble();

		System.out.println("Nhập c: ");
		double c = scanner.nextDouble();

		if (a == 0) {
			phuongTrinhBacNhat(b, c);

		} else {
			double delta = Math.pow(b, 2) - 4 * a * c;

			if (delta < 0) {
				System.out.println("Phương trình vô nghiệm");
			} else if (delta == 0) {
				double x = (-b) / (2 * a);
				System.out.println("Phương trình có nghiệm kép x = " + x);
			} else {
				double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
				double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
				System.out.println("Phương trình có 2 nghiệm phân biệt " + x1 + " và " + x2);

			}

		}
		scanner.close();
	}
}
