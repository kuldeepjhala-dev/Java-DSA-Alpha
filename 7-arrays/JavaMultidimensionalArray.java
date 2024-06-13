import java.util.*;

public class JavaMultidimensionalArray {

    public static void printMatrix(int arr[][]) {
        int row = arr.length;
        int col = arr[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void searchElement(int matrix[][], int key) {
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (key == matrix[i][j]) {
                    System.out.println("Key found");
                    return;
                }
            }
        }
        System.out.println("Key not found");
        return;
    }

    public static void largestElement(int matrix[][]) {
        int n = matrix.length;
        int m = matrix[0].length;
        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (maxElement < matrix[i][j]) {
                    maxElement = matrix[i][j];
                }
            }
        }
        System.out.println("Max element is : " + maxElement);
    }

    public static void smallestElement(int matrix[][]) {
        int n = matrix.length;
        int m = matrix[0].length;
        int minElement = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (minElement > matrix[i][j]) {
                    minElement = matrix[i][j];
                }
            }
        }
        System.out.println("Min element is : " + minElement);
    }

    public static void printSpiralMatrixKuldeep(int arr[][]) {
        int row = arr.length;
        int col = arr[0].length;
        System.out.println("row = " + row);
        System.out.println("col = " + col);
        System.out.println("---------------------------------------");
        int i = 0;
        int j = 0;
        int c = 0;
        int v = (((row + col) / 2) - 2);
        while (c < v) {
            while (j < col) {
                System.out.print(arr[i][j] + " ");
                j++;
            }
            j--;
            i++;
            while (i < row) {
                System.out.print(arr[i][j] + " ");
                i++;
            }
            i--;
            j--;
            while (j >= c) {
                System.out.print(arr[i][j] + " ");
                j--;
            }
            j++;
            i--;
            while (i > c) {
                System.out.print(arr[i][j] + " ");
                i--;
            }
            j++;
            i++;
            row--;
            col--;
            c++;
        }

    }

    public static void printSpiralMatrixAlpha(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {

            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            // left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
    }

    public static void main(String[] args) {

        // ---------------------------Method-1-declare-2d-array---------------------------
        // int[][] arr = new int[4][3];

        // ---------------------------Method-2-for-declare-and-initilize-2d-array---------------------------
        // int[][] arr = {
        // { 1, 2, 3 },
        // { 4, 5, 6 },
        // { 7, 8, 9 },
        // { 10, 11, 12 }
        // };
        // int n = arr.length; // n : Number of rows
        // int m = arr[0].length;// m : Number of columns
        // for (int i = 0; i < n; i++) {
        // // System.out.print("Print " + i + " row -----> ");
        // for (int j = 0; j < m; j++) {
        // System.out.print(arr[i][j] + " ");
        // }
        // System.out.println();
        // }

        // ---------------------------Method-3-to-declare-and-initilize-2d-array----------------------------
        // int[][] arr = new int[4][3];
        // Scanner sc = new Scanner(System.in);
        // int n = arr.length; // rows length
        // int m = arr[0].length; // cols length
        // // Taking input from user
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // System.out.print("Input " + i + ", " + j + " cell: ");
        // arr[i][j] = sc.nextInt();
        // }
        // }
        // // printing output
        // for (int i = 0; i < n; i++) {
        // // System.out.print("Print " + i + " row -----> ");
        // for (int j = 0; j < m; j++) {
        // System.out.print(arr[i][j] + " ");
        // }
        // System.out.println();
        // }

        // ---------------------------search-key-in-2d-array---------------------------
        // int[][] arr = {
        // { 1, 2, 3 },
        // { 4, 5, 6 },
        // { 7, 8, 9 },
        // { 10, 11, 12 }
        // };
        // searchElement(arr, 4);

        // ---------------------------search-max-element-in-2d-array---------------------------
        // int[][] arr = {
        // { 1, 2, 3, 5 },
        // { 4, 5, 6, 6 },
        // { 7, 89, 9, 32 },
        // { 10, 11, 12, 22 }
        // };
        // largestElement(arr);

        // ---------------------------search-min-element-in-2d-array---------------------------
        // int[][] arr = {
        // { 1, 2, 3, 5 },
        // { 4, 5, 6, 6 },
        // { 7, 89, 9, -12 },
        // { 10, 11, 12, 22 }
        // };
        // smallestElement(arr);

        // ---------------------------spiral-matrix-in-2d-array-kuldeep---------------------------
        // int[][] arr = {
        // { 1, 2, 3, 4, 5 },
        // { 6, 7, 8, 9, 10 },
        // { 11, 12, 13, 14, 15 },
        // { 16, 17, 18, 19, 20 },
        // { 21, 22, 23, 24, 25 },
        // { 26, 27, 28, 29, 30 }
        // };
        // System.out.println("--------Printing Array--------");
        // printMatrix(arr);
        // System.out.println("---------------------------------------");
        // printSpiralMatrixKuldeep(arr);

        // ---------------------------spiral-matrix-in-2d-array-alpha---------------------------
        int[][] arr = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 },
                { 26, 27, 28, 29, 30 }
        };
        System.out.println("--------Printing Array--------");
        printMatrix(arr);
        System.out.println("---------------------------------------");
        printSpiralMatrixAlpha(arr);
    }
}
