package Lab03;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
//		Bài 3: Viết chương trình nhập vào 1 mảng số nguyên bất kỳ:
//			- Sắp xếp và xuất mảng vừa nhập ra màn hình
//			- Xuất phần tử có giá trị nhỏ nhất
//			- Xuất phần tử có giá trị lớn nhất

		Scanner in = new Scanner(System.in);

		int size = in.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}

		Arrays.sort(arr);

		System.out.println(Arrays.toString(arr));

		System.out.println("Min: " + arr[0]);
		System.out.println("Max: " + arr[size - 1]);

		in.close();
	}
}
