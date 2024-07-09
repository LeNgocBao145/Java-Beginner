package Lab05;

import java.util.ArrayList;
import java.util.Scanner;

public class lab5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		ArrayList<Double> nums = new ArrayList<Double>();
		while (true) {
			double tmp = in.nextDouble();
			nums.add(tmp);
			in.nextLine();

			System.out.println("Bạn có muốn nhập tiếp không? (Y/N)");
			// String input = in.nextLine();

			if (in.nextLine().equals("N") == true) {
				break;
			}
		}

		System.out.println(nums.toString());
		double sum = 0;
		for (int i = 0; i < nums.size(); i++) {
			sum += nums.get(i);
		}
		System.out.println(sum);

		in.close();
	}
}
