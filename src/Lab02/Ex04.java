package Lab02;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
//		Bài 4: Viết chương trình tổ chức menu:
//
//		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
//		System.out.println("++ ----------------------------------------- ++");
//		System.out.println("| 1. Giải phương trình bậc nhất |");
//		System.out.println("| 2. Giải phương trình bậc hai |");
//		System.out.println("| 3. Tính số tiền điện |");
//		System.out.println("| 4. Kết thúc |");
//		System.out.println("++ ------------------ ++");
//
//		Yêu cầu:
//		- Khi nhập vào "tính năng", sẽ thực hiện theo 3 bài tập đã làm ở trên

		Scanner scanner = new Scanner(System.in);
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất |");
		System.out.println("| 2. Giải phương trình bậc hai |");
		System.out.println("| 3. Tính số tiền điện |");
		System.out.println("| 4. Kết thúc |");
		System.out.println("++ ------------------ ++");

		System.out.println("Nhập lựa chọn: ");
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:

		case 2:

		case 3:

		default:
			System.exit(0);
		}

		scanner.close();
	}
}
