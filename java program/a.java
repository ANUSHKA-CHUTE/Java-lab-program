
import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        // Input the matrix
        System.out.println("Enter a 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Set diagonal elements to 0
        for (int i = 0; i < 3; i++) {
            matrix[i][i] = 0;
        }

        // Print the modified matrix
        System.out.println("Matrix after setting diagonal elements to 0:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}