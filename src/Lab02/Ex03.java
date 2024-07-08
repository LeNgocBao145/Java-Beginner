package Lab02;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
//		Bài 3: Viết chương trình tính số tiền điện (in kết quả ra console)
//		Yêu cầu: nhập vào số điện, sau đấy tính số tiền dựa vào quy luật sau:
//		- Nếu số điện sử dụng từ 0 tới 100, giá mỗi số điện là 1000
//		- Từ số điện 101 (tức là > 100), giá mỗi số điện là 1500
//
//		Gợi ý:
//		- Nếu số điện <= 100 => số tiền = số điện x 1000
//		- Nếu số điện > 100
//		=> số tiền = 100 * 1000 + (số điện - 100) * 1500

		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số điện: ");
		int quantity = scanner.nextInt();

		while (quantity < 0) {
			System.out.println("Nhập số điện: ");
			quantity = scanner.nextInt();
		}

		int price;

		if (quantity > 0 && quantity <= 100) {
			price = 1000 * quantity;
		} else {
			price = 1000 * 100 + 1500 * (quantity - 100);
		}

		System.out.println("Số tiền điện là " + price);

		scanner.close();
	}
}
