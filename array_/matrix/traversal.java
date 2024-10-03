package array_.matrix;

import java.util.Scanner;

public class traversal {

    public static void traversall(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            if (row % 2 == 0) {
                for (int col = 0; col < matrix[row].length; col++) {
                    System.out.print(matrix[row][col] + " ");
                }
                System.out.println();
            } else {
                for (int col = matrix[row].length - 1; col >= 0; col--) {
                    System.out.print(matrix[row][col] + " ");
                }
                System.out.println();

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row size");
        int row = sc.nextInt();
        System.out.println("enter the column size");
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("traversal matrix");
        traversall(matrix);

    }
}
