package chap1;

import java.util.Scanner;

public class Chap1_29 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();

		if (year % 4 != 0) {
			System.out.println(year + "不是闰年");
		} else if (year % 100 != 0) {
			System.out.println(year + "是闰年");
		} else if (year % 400 != 0) {
			System.out.println(year + "不是闰年");
		} else {
			System.out.println(year + "是闰年");
		}
	}
}
