import java.util.Scanner;
import java.util.*;

class Loops {
    public static void main(String[] args) {

        // ----------------------------while-loops----------------------------

        // ----------------------------print-hello-world-100-times----------------------------
        // int counter = 0;
        // while (counter <= 100) {
        // System.err.println("Hello world");
        // counter++;
        // }

        // ----------------------------print-no-from-1-to-10----------------------------
        // int counter = 1;
        // while (counter <= 10) {
        // System.err.println(counter);
        // counter++;
        // }

        // ----------------------------print-no-from-1-to-n----------------------------
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int counter = 1;
        // while (counter <= n) {
        // System.err.println(counter);
        // counter++;
        // }

        // ----------------------------print-sum-of-first-n-natural-numbers----------------------------
        // int n = 5;
        // int counter = 1;
        // int sum = 0;
        // while (counter <= n) {
        // sum += counter;
        // counter++;
        // }
        // System.out.println(sum);

        // ----------------------------for-loops----------------------------

        // ----------------------------print-hello-world-100-times----------------------------
        // for (int i = 1; i <= 100; i++) {
        // System.out.println("Hello world");
        // }

        // ----------------------------print-no-from-1-to-10----------------------------
        // for (int i = 1; i <= 10; i++) {
        // System.err.println(i);
        // }

        // ----------------------------print-square-pattern----------------------------
        // for (int i = 0; i < 4; i++) {
        // for (int j = 0; j < 4; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // ----------------------------print-reverse-of-a-number----------------------------
        // int number = 10899;
        // for (int i = 0; i < 5; i++) {
        // System.out.print(number % 10);
        // number /= 10;
        // }

        // ----------------------------reverse-of-a-number----------------------------
        // Method-1
        // int n = 19212;
        // int reverseNo = 0;
        // for (int i = 0; i < 5; i++) {
        // reverseNo += n % 10; // Extract last digit and assign it to reverseNo
        // n /= 10; // remove the last digit from the no
        // if (n == 0) {
        // break;
        // } else {
        // reverseNo *= 10; //
        // }
        // }
        // System.out.println("reverse no : " + reverseNo);
        // Method-2
        // int n = 19212;
        // int reverseNo = 0;
        // while (n > 0) {
        // int lastDigit = n % 10; // Fetch last digit
        // reverseNo = (reverseNo * 10) + lastDigit; // add last digit
        // n = n / 10; // remove last digit
        // }
        // System.err.println(reverseNo);

        // ----------------------------do-while-loops----------------------------
        // int counter = 1;
        // do {
        // System.out.println("hello world");
        // counter++;
        // } while (counter <= 10);

        // ----------------------------break-statement----------------------------
        // for (int i = 1; i <= 5; i++) {
        // if (i == 3) {
        // break;
        // }
        // System.out.println(i);
        // }

        // ----------------------------keep-entering-till-user-enters-a-multiple-of-10----------------------------
        // Scanner sc = new Scanner(System.in);
        // while (true) {
        // System.out.println("enter the no: ");
        // int no = sc.nextInt();
        // if (no % 10 == 0) {
        // System.out.println(no + " is multipe of 10");
        // break;
        // }
        // System.out.println(no);
        // }

        // ----------------------------Check-if-no-is-prime-or-not----------------------------
        // Scanner sc = new Scanner(System.in);
        // int no = sc.nextInt();
        // if (no == 2) {
        // System.out.println("Prime no");
        // } else {
        // boolean isPrime = true;
        // for (int i = 2; i <= Math.sqrt(no); i++) {
        // if (no % i == 0) {
        // System.out.println("Not a prime no");
        // isPrime = false;
        // break;
        // }
        // }
        // if (isPrime) {
        // System.out.println("Prime no");
        // }
        // }

        // ----------------------------Write-a-program-that-reads-a-set-of-integers,-and-then-prints-the-sum-of-the-even-and-odd-integers----------------------------
        // Scanner sc = new Scanner(System.in);
        // int odd = 0, even = 0, choice = 1, sum = 0;
        // do {
        // System.out.print("Enter no:");
        // int no = sc.nextInt();
        // if ((no % 2) == 0) {
        // odd += no;
        // } else {
        // even += no;
        // }
        // System.out.println("Enter choice : 1 => Continue, 0 => Quit");
        // choice = sc.nextInt();
        // } while (choice == 1);
        // System.out.println("ODD: " + odd);
        // System.out.println("EVEN: " + even);

        // ----------------------------factorial-of-a-number-n-=-n-*-(n-1)-*-(n-2)-*-(n-3)-*-......-*-1-and-exists-for-positive-numbers-only.----------------------------
        // Scanner sc = new Scanner(System.in);
        // int no = sc.nextInt();
        // int fact = 1;
        // for (int i = 1; i <= no; i++) {
        // fact *= i;
        // }
        // System.out.println("Factorial of " + no + " is " + fact);

        // ----------------------------Write-a-program-to-print-the-multiplication-table-of-a-number-N,-entered-by-the-user.----------------------------
        // Scanner sc = new Scanner(System.in);
        // int no = sc.nextInt();
        // for (int i = 1; i <= 10; i++) {
        //     System.out.println(no + " * " + i + " = " + no * i);
        // }
    }
}