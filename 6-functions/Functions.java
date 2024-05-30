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

    public static int binaryToDecimal(int binaryNo) {
        int decimalNo = 0;
        int exp = 0;
        while (binaryNo > 0) {
            int lastDigit = binaryNo % 10;
            decimalNo = decimalNo + (lastDigit * (int) Math.pow(2, exp++));
            binaryNo = binaryNo / 10;
        }
        return decimalNo;
    }

    public static int decimalToBinary(int decimalNo) {
        int binaryNo = 0;
        int exp = 0;
        while (decimalNo > 0) {
            int reminder = (int) (decimalNo % 2);
            binaryNo = binaryNo + (int) (reminder * Math.pow(10, exp++));
            decimalNo = (int) (decimalNo / 2);
        }
        return binaryNo;
    }

    // Write a Java method to compute the average of three numbers
    public static int avgOfThree(int a, int b, int c) {
        return ((a + b + c) / 3);
    }

    public static boolean isEven(int no) {
        return no % 2 == 0 ? true : false;
    }

    public static boolean isPalindrome(int no) {
        int reverseNo = 0;
        int userInput = no;
        int exp = 0;
        while (no > 0) {
            System.out.println("no before :" + no);
            int lastDigit = no % 10;
            System.out.println("last digit :" + lastDigit);
            System.out.println("exp++ : " + exp);
            System.out.println("reverseNo before :" + reverseNo);
            System.out.println("(int) Math.pow(10, exp++) = " + (int) Math.pow(10, exp));
            reverseNo = lastDigit + (reverseNo * 10);
            System.out.println("reverseNo after :" + reverseNo);
            no = no / 10;
            System.out.println("no after :" + no);
            System.out.println("----------------------------");
        }
        System.out.println("userInput = " + userInput);
        System.out.println("reverseNo after = " + reverseNo);
        if (reverseNo == userInput) {
            return true;
        } else {
            return false;
        }
    }

    public static void javaMath(double a, double b, double c) {
        System.out.println("Math.min() : " + Math.min(a, b));
        System.out.println("Math.max() : " + Math.max(b, c));
        System.out.println("Math.sqrt() : " + Math.sqrt(a));
        System.out.println("Math.pow() : " + Math.pow(a, b));
        System.out.println("Math.abs() : " + Math.abs(c));
    }

    public static int sumOfDigits(int no) {
        int sum = 0;
        while (no > 0) {
            sum = sum + (no % 10);
            no /= 10;
        }
        return sum;
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

        // printPrimeInRange(40);

        // System.out.println("Binary to decimal : " + binaryToDecimal(1000101010));

        // System.out.println("Decimal to binary : " + decimalToBinary(15));

        // System.out.println("Average of three no : " + avgOfThree(10, 20, 30));

        // System.out.println("Is number Even : " + isEven(11));

        // System.out.println("Is Palindrome : " + isPalindrome(1234));

        // javaMath(10, 20, -12);

        // System.out.println("Sum of digits : " + sumOfDigits(12345678));

    }
}

// make notes of
// 1. callstack
// 2. callby value and call by reference
// 3. types of functions
// 4. funciton overloading(using - Parameters & datatypes)(Note : changed
// returnType)
// 5. Binary no to decimal logic
// 6. decimal to binary no
// 7. scope and block scope