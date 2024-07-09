package chapter09;

import java.util.Scanner;

public class chap9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("Nhập giá trị: ");
				int x = in.nextInt();

				try {
					System.out.println("Giá trị " + (10 / x));
					break;
				} catch (Exception e) {
					System.out.println("Lỗi nhập số 0 ở mẫu");
				}
			} catch (Exception e) {
				in.next();
				System.out.println("Lỗi nhập chữ");
			}
		}

		in.close();
	}
}
