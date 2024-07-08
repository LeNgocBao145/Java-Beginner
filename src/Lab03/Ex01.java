package Lab03;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
//		Bài 1: Viết chương trình nhập vào 1 số nguyên từ bàn phím. Hiển thị kết quả số đấy là số
//		nguyên tố hay không ?

		Scanner in = new Scanner(System.in);

		System.out.println("Nhập số nguyên: ");
		int num = in.nextInt();
		boolean check = true;

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				check = false;
			}
		}

		if (check == true) {
			System.out.println("Là số nguyên tố");
		} else {
			System.out.println("Không phải số nguyên tố");
		}

		in.close();
	}
}
