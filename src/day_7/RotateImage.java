package src.day_7;

import java.util.Scanner;

public class RotateImage {
    public void rotate(int[][] matrix) {
        int length = matrix.length;
        for (int i = 0; i < length; i ++) {
            for (int j = i; j < length; j ++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < length; i ++) {
            for (int j = 0; j < length / 2; j ++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        new RotateImage().rotate(matrix);
        new RotateImage_2().rotateMatrix(matrix.length, matrix.length, matrix);
        System.out.println("========== Result ============");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
