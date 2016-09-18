package chap1;

public class Chap1_35 {
	
	static public void main(String[] args) {
		int[][] a = new int[10][10];
		for (int i = 0; i < 10; i++)
			for (int j = 0; j < 10; j++) {
				if (j < i) {
					a[i][j] = 1;
					if (j == 0) {
						a[i][j] = 1;
					} else {
						a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
					}
				} else {
					a[i][j] = 1;
				}
			}
		for (int i = 0; i < 7; i++) {
			for (int k = 1; k <= 7- i; k++)
				System.out.printf(" ");

			for (int j = 0; j <= i; j++) {
				System.out.printf("%3d ", a[i][j]);
			}
			System.out.printf("\n");
		}
	}
}