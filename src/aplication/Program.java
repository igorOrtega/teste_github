package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N, M;
		M = sc.nextInt();
		N = sc.nextInt();

		int matrix[][] = new int[M][N];

		for (int linha = 0; linha < M; linha++) {
			for (int coluna = 0; coluna < N; coluna++) {
				matrix[linha][coluna] = sc.nextInt();
			}
		}

		int X = sc.nextInt();

		for (int linha = 0; linha < M; linha++) {
			for (int coluna = 0; coluna < N; coluna++) {
				if (matrix[linha][coluna] == X) {
					System.out.println("Position " + linha + "," + coluna + ":");
					// Left
					if (coluna - 1 >= 0) {
						int left = matrix[linha][coluna - 1];
						System.out.println("Left: " + left);
					}
					// Up
					if (linha - 1 >= 0) {
						int up = matrix[linha - 1][coluna];
						System.out.println("Up: " + up);
					}
					// Right
					if (coluna + 1 <= N - 1) {
						int right = matrix[linha][coluna + 1];
						System.out.println("Right: " + right);
					}
					// Down
					if (linha + 1 <= M - 1) {
						int down = matrix[linha + 1][coluna];
						System.out.println("Down: " + down);
					}
				}

			}
		}

		sc.close();

	}

}
