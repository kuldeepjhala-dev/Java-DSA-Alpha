public class Recursion {
    public static void printDecresing(int n) {
        if (n == 1) {
            System.out.print(1);
            return;
        }
        System.out.print(n + " ");
        printDecresing(n - 1);
    }

    public static void printIncreasing(int n) {
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }
        printIncreasing(n - 1);
        System.out.print(n + " ");
    }

    public static void factorial(int n) {

    }

    public static void main(String[] args) {

        // --------------Print-numbers-from-n-to-1-(Decresing-order)--------------
        // printDecresing(5);

        // --------------Print-numbers-from-1-to-n-(Increasing-order)--------------
        // printIncreasing(5);

        // --------------Print-factorial-of-a-no--------------

    }
}