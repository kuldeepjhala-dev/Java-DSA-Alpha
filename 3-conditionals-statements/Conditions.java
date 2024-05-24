import java.util.*;

class Conditions {
    public static void main(String[] args) {

        // ------------------------------check-the-age------------------------------
        // int age = 10;
        // if (age >= 18) {
        // System.out.println("Adult");
        // } else if (age > 13 && age < 18) {
        // System.out.println("teenager");
        // } else {
        // System.out.println("Not adult");
        // }

        // ------------------------------Print-the-largest-of-2-numbers------------------------------
        // int a = 2, b = 3;
        // if (a > b) {
        // System.out.println("'a' is greater");
        // } else {
        // System.out.println("'b' is greater");
        // }

        // ------------------------------print-if-a-no-is-odd-or-even------------------------------
        // int no = 23;
        // if (no % 2 == 0) {
        // System.out.println("Even no");
        // } else {
        // System.out.println("Odd no");
        // }

        // ------------------------------income-tax-calculator------------------------------
        // int income = 80;
        // if (income < 5) {
        // System.out.println("You have to pay 0% tax");
        // } else if (income >= 5 && income <= 10) {
        // System.out.println("You have to pay 20% tax which is " + (int) (income *
        // (0.2)));
        // } else {
        // System.out.println("You have to pay 30% tax which is " + (int) (income *
        // (0.3)));
        // }

        // ------------------------------print-the-largest-of-3-numbers------------------------------
        // int a = 3, b = 10, c = 1;
        // // ------------------------------Method-1------------------------------
        // if (a > b) {
        // if (a > c) {
        // System.out.println("a is largest");
        // } else {
        // System.out.println("c is largest");
        // }
        // } else {
        // if (b > c) {
        // System.out.println("b is largest");
        // } else {
        // System.out.println("c is largest");
        // }
        // }
        // // ------------------------------Method-2------------------------------
        // int a = 13, b = 10, c = 121;
        // if (a >= b && a >= c) {
        // System.out.println("a is max");
        // } else if (b >= c) {
        // System.err.println("b is max");
        // } else {
        // System.err.println("c is max");
        // }

        // ------------------------------ternery-operator------------------------------
        // int no = 4;
        // System.out.println(((no%2==0)?"even":"odd"));

        // ------------------------------pass-or-fail-using-ternery-operator------------------------------
        // int marks = 99;
        // String status = (marks >= 33) ? "Pass" : "Fail";
        // System.out.println("Student is " + status);

        // ------------------------------switch-statements------------------------------
        // int number = 2;
        // switch (number) {
        // case 1:
        // System.out.println("Sasosa");
        // break;
        // case 2:
        // System.out.println("Burger");
        // break;
        // case 3:
        // System.out.println("Bun-samosa");
        // break;
        // default:
        // System.out.println("Please select from menu");
        // }

        // ------------------------------calculator------------------------------
        // Scanner sc = new Scanner(System.in);
        // int no1 = sc.nextInt();
        // int no2 = sc.nextInt();
        // char operator = sc.next().charAt(0);
        // switch (operator) {
        // case '+':
        // System.out.println(no1 + no2);
        // break;
        // case '*':
        // System.out.println(no1 * no2);
        // break;
        // case '/':
        // System.out.println(no1 / no2);
        // break;
        // case '-':
        // System.out.println(no1 - no2);
        // break;
        // case '%':
        // System.out.println(no1 % no2);
        // break;
        // default:
        // System.out.println("Use correct operator");
        // }

        // ------------------------------Write-a-Java-program-to-get-a-number-from-the-user-and-print-whether-it-is-positive-or-negative------------------------------
        // Scanner sc = new Scanner(System.in);
        // int no = sc.nextInt();
        // if (no < 0) {
        // System.out.println("No is negative");
        // } else {
        // System.out.println("No is positive");
        // }

        // ------------------------------Check-fever-based-on-temperature-------------------------------
        // double temp = 103.5;
        // if (temp > 100) {
        // System.out.println("You have fever");
        // } else {
        // System.out.println("You dont have fever");
        // }

        // ------------------------------Write-a-Java-program-to-input-week-number(1-7)-and-print-day-of-week-name-using-switch-case------------------------------
        // Scanner sc = new Scanner(System.in);
        // int day = sc.nextInt();
        // switch (day) {
        // case 1:
        // System.out.println("Monday");
        // break;
        // case 2:
        // System.out.println("Tuesday");
        // break;
        // case 3:
        // System.out.println("Wednesday");
        // break;
        // case 4:
        // System.out.println("Thursday");
        // break;
        // case 5:
        // System.out.println("Friday");
        // break;
        // case 6:
        // System.out.println("Saturday");
        // break;
        // case 7:
        // System.out.println("Sunday");
        // break;
        // default:
        // System.out.println("Enter valid day");

        // ------------------------------Write-a-Java-program-that-takes-a-year-from-the-user-and-print-whether-that-year-is-a-leap-year-or-not------------------------------
        // Scanner sc = new Scanner(System.in);
        // int year = sc.nextInt();
        // if ((year % 4 == 0)) {
        // if ((year % 100) == 0) {
        // if ((year % 400) == 0) {
        // System.out.println("Leap year");
        // } else {
        // System.err.println("not a leap year");
        // }
        // } else {
        // System.out.println("Leap year");
        // }
        // } else {
        // System.out.println("not a leap year");
        // }
    }
}
