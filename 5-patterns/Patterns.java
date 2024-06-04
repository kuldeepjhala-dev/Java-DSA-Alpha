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

        // int n = 5;
        // for (int row = 1; row <= 5; row++) {
        // for (int col = 1; col <= 5; col++) {
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
        // for (int space = 1; space <= n - row; space++) {
        // System.out.print(" ");
        // }
        // for (int star = 1; star <= row; star++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // int n = 5;
        // for (int row = 0; row < n; row++) {
        // for (int col = 1; col <= n - row; col++) {
        // System.out.print(col);
        // }
        // System.out.println();
        // }

        // int n = 5;
        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n; col++) {
        // if ((row + col) <= (n + 1)) {
        // System.out.print(col);
        // }
        // }
        // System.out.println();
        // }

        // int n = 5, counter = 1;
        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n; col++) {
        // if ((row - col) >= 0) {
        // System.out.print(counter++);
        // }
        // }
        // System.out.println();
        // }

        // int n = 5, counter = 1;
        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= row; col++) {
        // System.out.print(counter++);
        // }
        // System.out.println();
        // }

        // int n = 5, flipFlop = 1;
        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n; col++) {
        // if ((row - col) >= 0) {
        // System.out.print(flipFlop);
        // flipFlop = flipFlop == 1 ? 0 : 1;
        // }
        // }
        // System.out.println();
        // }

        // int n = 5;
        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= row; col++) {
        // if ((row + col) % 2 == 0) {
        // System.out.print("0");
        // } else {
        // System.out.print("1");
        // }
        // }
        // System.out.println();
        // }

        // int n = 5;
        // int total_number_of_line = n * 2 - 1;
        // int stars = 1;
        // int spaces = 2 * n - 2;
        // int current_no_of_lines = 1;
        // while (current_no_of_lines <= total_number_of_line) {
        // for (int i = 1; i <= stars; i++) {
        // System.out.print("*");
        // }
        // for (int i = 1; i <= spaces; i++) {
        // System.out.print(" ");
        // }
        // for (int i = 1; i <= stars; i++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // if (current_no_of_lines < n) {
        // stars++;
        // spaces = spaces - 2;
        // } else {
        // stars--;
        // spaces = spaces + 2;
        // }
        // current_no_of_lines++;
        // }

        // int n = 5;
        // int total_number_of_line = n;
        // int stars = 1;
        // int spaces = n - 1;
        // int current_no_of_lines = 1;
        // while (current_no_of_lines <= total_number_of_line) {
        // for (int i = 1; i <= spaces; i++) {
        // System.out.print(" ");
        // }
        // for (int i = 1; i <= stars; i++) {
        // System.out.print("*" + " ");
        // }
        // System.out.println();
        // stars++;
        // spaces--;
        // current_no_of_lines++;
        // }

        // int n = 5;
        // int total_number_of_line = n;
        // int stars = 1;
        // int spaces = n - 1;
        // int current_no_of_lines = 1;
        // while (current_no_of_lines <= total_number_of_line) {
        // for (int i = 1; i <= spaces; i++) {
        // System.out.print(" ");
        // }
        // for (int i = 1; i <= stars; i++) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // stars++;
        // spaces--;
        // current_no_of_lines++;
        // }

        // int n = 4;
        // int total_number_of_line = n * 2 - 1;
        // int stars = 1;
        // int spaces = n - 1;
        // int current_no_of_lines = 1;
        // while (current_no_of_lines <= total_number_of_line) {
        // for (int i = 1; i <= spaces; i++) {
        // System.out.print(" ");
        // }
        // int number_to_print = 1;
        // for (int i = 1; i <= stars; i++) {
        // System.out.print(number_to_print + " ");
        // if (i <= stars / 2) {
        // number_to_print++;
        // } else {
        // number_to_print--;
        // }
        // }
        // if (current_no_of_lines < n) {
        // spaces--;
        // stars++;
        // } else {
        // spaces++;
        // stars--;
        // }
        // current_no_of_lines++;
        // System.out.println();
        // }

        // int n = 4;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // for (int k = 1; k <= 2 * (n - i); k++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // for (int k = 1; k <= 2 * (n - i); k++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // int total_number_of_line = 5;
        // int current_no_of_lines = 1;
        // while (current_no_of_lines <= total_number_of_line) {
        // for (int space = 1; space <= total_number_of_line - current_no_of_lines;
        // space++) {
        // System.out.print(" ");
        // }
        // for (int star = 1; star <= 5; star++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // current_no_of_lines++;
        // }

        // int n = 4;
        // for (int row = 1; row <= n; row++) {
        // for (int space = 1; space <= n - row; space++) {
        // System.out.print(" ");
        // }
        // for (int star = 1; star <= (row * 2 - 1); star++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // for (int row = n - 1; row >= 1; row--) {
        // for (int space = 1; space <= n - row; space++) {
        // System.out.print(" ");
        // }
        // for (int star = 1; star <= (row * 2 - 1); star++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // int n = 4;
        // for (int row = 1; row <= n; row++) {
        // for (int space = 1; space <= n - row; space++) {
        // System.out.print(" ");
        // }
        // for (int star = 1; star <= (row * 2 - 1); star++) {
        // if ((star == 1) || (star == (row * 2 - 1))) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }
        // for (int row = n - 1; row >= 1; row--) {
        // for (int space = 1; space <= n - row; space++) {
        // System.out.print(" ");
        // }
        // for (int star = 1; star <= (row * 2 - 1); star++) {
        // if ((star == 1) || (star == (row * 2 - 1))) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

    }
}
