package array_.matrix;

import java.util.Scanner;

public class toptodown {

    public static void toptodownn(int[][] matrix) {
        for (int col = 0; col < matrix[0].length; col++) {
            // Top to down for even columns
            if (col % 2 == 0) {
                for (int row = 0; row < matrix.length; row++) {
                    System.out.print(matrix[row][col] + " ");
                }
            } // Bottom to top for odd columns
            else {
                for (int row = matrix.length - 1; row >= 0; row--) {
                    System.out.print(matrix[row][col] + " ");
                }
            }
            System.out.println();  // Move to the next line after each column
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the matrix
        System.out.println("Enter the number of rows:");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int col = sc.nextInt();

        // Declare and initialize the matrix
        int[][] matrix = new int[row][col];

        // Input the matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print the matrix elements in top-to-bottom and bottom-to-top column-wise
        System.out.println("Matrix traversal top-to-down and down-to-top column-wise:");
        toptodownn(matrix);

        sc.close(); // Close the scanner
    }
}
