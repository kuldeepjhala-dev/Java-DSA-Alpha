import java.util.Scanner;

public class JavaBasics {
    public static void main(String args[]) {
        // -------------------------print, println, and \n-------------------------
        // System.out.print("Hello world\n"); // Hello world
        // System.out.print("\n"); // empty space
        // System.out.println("****\n***\n**\n*");
        // // ****
        // // ***
        // // **
        // // *

        // -------------------------variables-------------------------
        // int a = 10;
        // int b = 20;
        // System.out.println(a); // 10
        // System.out.println(b); // 20
        // a = 50;
        // b = 90;
        // System.out.println(a); // 50
        // System.out.println(b); // 90

        // -------------------------data-types-------------------------
        // byte c = 8; // range 256
        // System.out.println(c); // 8
        // char d = 'a'; // single characters
        // System.out.println(d); // a
        // boolean e = true; // only two values can be stored
        // System.out.println(e); // true
        // float f = 10.5f;
        // System.out.println(f); // 10.5
        // int g = 25;
        // System.out.println(g); // 25
        // long h = 2000;
        // System.out.println(h); // 2000
        // double i = 10.44;
        // System.out.println(i); // 10.44
        // short j = 25;
        // System.out.println(j); // 25

        // -------------------------sum-of-a-and-b-------------------------
        // int k = 10;
        // int l = 5;
        // int sum = k + l;
        // System.out.println(sum); // 15

        // -------------------------sum-of-a-and-b(input-from-user)-------------------------
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // System.out.println(a);

        // -------------------------Product-of-a-and-b-------------------------
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int product = a * b;
        // System.out.println(product);

        // -------------------------Are-of-circle-------------------------
        // Scanner sc = new Scanner(System.in);
        // int radius = sc.nextInt();
        // float pie = 3.14f;
        // float area = pie * (radius * radius);
        // System.out.println(area);

        // -------------------------char-to-number-------------------------
        // char ch = 'a';
        // int number = ch;
        // System.out.println(number); //97

        // -------------------------number-to-char-------------------------
        // int no = 97;
        // char ch = (char) no;
        // System.out.println(ch); // a

        // -------------------------Type-promotion-in-Expression-------------------------
        // char x = 'a';
        // char y = 'b';
        // System.out.println(y - x); // 1
        // short a = 5;
        // byte b = 25;
        // char c = 'c';
        // byte bt = (byte) (a + b + c);
        // System.out.println(bt); // -127
        // int p = 10;
        // float q = 20.25f;
        // long r = 25;
        // double s = 30;
        // double ans = p + q + r + s;
        // System.out.println(ans); // op: 85.25
    }
}