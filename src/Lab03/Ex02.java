package Lab03;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
//		Bài 2: Viết bảng cửu chương của 1 số nguyên bất kỳ

		Scanner in = new Scanner(System.in);

		int num = in.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}

		in.close();
	}
}
