import java.util.Scanner;

public class Functions {

    public static void printHelloWorld() {
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
    }

    public static int calculateSum(int num1, int num2) { // parameters or formal parameters(function definition)
        return (num1 + num2);
    }

    public static int multiply(int num1, int num2) {
        return (num1 * num2);
    }

    public static int factorial(int num) {
        if (num < 0) {
            return 0;
        }
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int binomialCoefficient(int n, int r) {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nr_fact = factorial(n - r);
        int bc = (n_fact) / ((r_fact) * (nr_fact));
        return bc;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static float sum(float a, float b) {
        return a + b;
    }

    public static boolean isPrime(int no) {
        if (no == 2) {
            return true;
        }
        for (int i = 2; i <= no - 1; i++) {
            if (no % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeOptimised(int no) {
        if (no == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(no); i++) {
            if (no % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimeInRange(int range) {
        for (int i = 2; i <= range; i++) {
            if (isPrimeOptimised(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {

        // printHelloWorld();

        // System.out.println("sum is :" + calculateSum(10, 20)); // arguments or actual
        // parameters(funciton calling)

        // System.out.println("Product is : " + multiply(5, 4));

        // System.out.println("Factorial is : " + factorial(7));

        // System.out.println("Binomial Coefficient is : " + binomialCoefficient(5, 2));

        // System.out.println("Sum is : " + sum(10, 20));

        // System.out.println("Sum is : " + sum(9f, 20.5f));

        // System.out.println("Sum is : " + sum(5, 20, 5));

        // System.out.println("Is Prime : " + isPrime(2));

        // System.out.println("Is Prime : " + isPrimeOptimised(40));

        printPrimeInRange(40);

    }
}

// make notes of
// 1. callstack
// 2. callby value and call by reference
// 3. types of functions
// 4. funciton overloading(using - Parameters & datatypes)(Note : changed
// returnType)