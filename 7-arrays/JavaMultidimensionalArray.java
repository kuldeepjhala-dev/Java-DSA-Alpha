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

    public static void printMatrix(String arr[][]) {
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

    public static void diagonalSumBruteForce(int matrix[][]) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                } else if (i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }
        }

        System.out.println("sum of diagonal is : " + sum);
    }

    public static void diagonalSumOptimised(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - i - 1];
            }
        }
        System.out.println("sum of diagonal is : " + sum);
    }

    public static void searchInSortedMatrixBruteforce(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (key == matrix[i][j]) {
                    System.out.println("Key found!");
                    return;
                }
            }
        }
        System.out.println("Key not found!");
    }

    public static void searchInSortedMatrixOptimised(int matrix[][], int key) {
        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Key found!");
                return;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Key not found!");
    }

    public static void countSpecificNoInArray(int matrix[][], int specificNo) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == specificNo) {
                    count++;
                }
            }
        }
        System.out.println(specificNo + " came " + count + " times int 2d-array");
    }

    public static void sumOfNumbersInSecondRow(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            sum += matrix[1][i];
        }
        System.out.println("Sum of elements in second row is " + sum);
    }

    public static String[][] traposedMatrix(String matrix[][]) {
        int n = matrix.length;
        int m = matrix[0].length;
        String traposedMatrix[][] = new String[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                traposedMatrix[j][i] = matrix[i][j];
            }
        }
        return traposedMatrix;
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

        // ---------------------------spiral-matrix-in-2d-array---------------------------
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
        // printSpiralMatrixAlpha(arr);

        // ---------------------------Diagonal-sum-in-2d-array---------------------------
        // int[][] arr = {
        // { 1, 2, 3, 4 },
        // { 5, 6, 7, 8 },
        // { 9, 10, 11, 12 },
        // { 13, 14, 15, 16 }
        // };
        // diagonalSumBruteForce(arr);
        // diagonalSumOptimised(arr);

        // ---------------------------Search-in-sorted-matrix-in-2d-array---------------------------
        // int arr[][] = {
        // { 10, 20, 30, 40 },
        // { 15, 25, 35, 45 },
        // { 27, 29, 37, 48 },
        // { 32, 33, 39, 50 }
        // };
        // searchInSortedMatrixBruteforce(arr, 32);
        // searchInSortedMatrixOptimised(arr, 32);

        // ---------------------------Print-the-number-of-7’s-that-are-in-the-2d-array---------------------------
        // int arr[][] = {
        // { 4, 7, 8 },
        // { 8, 8, 7 },
        // { 7, 2, 1 }
        // };
        // int specificNo = 7;
        // countSpecificNoInArray(arr, specificNo);

        // ---------------------------Print-out-the-sum-of-the-numbers-in-the-second-row-of-the-“nums”-array---------------------------
        // int[][] nums = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        // sumOfNumbersInSecondRow(nums);

        // ---------------------------Find-Transpose-of-a-Matrix---------------------------
        // String arr[][] = {
        // { "a11", "a12", "a13" },
        // { "a21", "a22", "a23" }
        // };
        // System.out.println("-----Before-Trapose-----");
        // printMatrix(arr);
        // arr = traposedMatrix(arr);
        // System.out.println("-----After-Trapose-----");
        // printMatrix(arr);
    }
}