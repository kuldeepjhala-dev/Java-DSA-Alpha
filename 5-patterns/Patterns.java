import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {

        // int n = 5;
        // for (int i = 0; i < n; i++) {
        // System.out.println("* * * * *");
        // }

        // int n = 5;
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // System.err.print("* ");
        // }
        // System.out.println();
        // }

        // int n = 4;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // int n = 5;
        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n; col++) {
        // if (row >= col) {
        // System.out.print("* ");
        // }
        // }
        // System.out.println();
        // }

        // int n = 4;
        // for (int i = 0; i < n; i++) {
        // for (int j = n - i; j > 0; j--) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // int n = 4;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 0; j < n - i + 1; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // int n = 5;
        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n; col++) {
        // if ((row + col) <= (n + 1)) {
        // System.out.print("* ");
        // }
        // }
        // System.out.println();
        // }

        // int n = 4;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // int n = 4;
        // int value = 65;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print((char) value++);
        // }
        // System.out.println();
        // }

        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // int no = 1;
        // int n = 5;
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print(no++ + " ");
        // }
        // System.out.println();
        // }

        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= (n - i); j++) {
        // }
        // }

        // int n = 5;
        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n; col++) {
        // if ((row + col) >= (n+1)) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // int n = 5;
        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n; col++) {
        // if (col - row >= 0) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // int n = 5;
        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n; col++) {
        // if (((row - col) == 0) || ((col + row == (n + 1)))) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // int n = 5;
        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n; col++) {
        // if (row >= col) {
        // System.out.print(col);
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // int n = 5;
        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n; col++) {
        // if (row >= col) {
        // System.out.print(row);
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // int n = 5;
        // int count = 1;
        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n; col++) {
        // if (row >= col) {
        // System.out.print(count++ + " ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // int n = 5;
        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n; col++) {
        // if (row == 1 || col == 1 || row == n || col == n) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // int n = 5;
        // for (int row = 1; row <= 5; row++) {
        // for (int col = 1; col <= 5; col++) {
        // if ((row + col) >= (n + 1)) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // int n = 5;
        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n; col++) {
        // if ((col + row) <= (n + 1)) {
        // System.out.print(col);
        // }
        // }
        // System.out.println();
        // }

        // int n = 5;
        // int counter = 1;
        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n; col++) {
        // if ((row - col) >= 0) {
        // System.out.print(counter++);
        // }
        // }
        // System.out.println();
        // }

        // int n = 5;
        // int flag = 1;
        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n; col++) {
        // if ((row - col) >= 0) {
        // System.out.print(flag);
        // }
        // flag = flag == 0 ? 1 : 0;
        // }
        // System.out.println();
        // }

    }
}

// fira code font file
// preetier
