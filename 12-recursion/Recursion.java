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

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int fn = n * factorial(n - 1);
        return fn;
    }

    public static int printSumOfNo(int n) {
        if (n == 1) {
            return 1;
        }
        int sum = n + printSumOfNo(n - 1);
        return sum;
    }

    public static int fibonaccinNo(int n) {
        int prev = 0, current = 1, next = 0;
        for (int i = 1; i < n; i++) {
            next = current + prev;
            prev = current;
            current = next;
        }
        return next;
    }

    public static int fibonaccinNoRecursive(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fibonaccinNoRecursive(n - 1);
        int fnm2 = fibonaccinNoRecursive(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    public static int firstOccurence(int arr[], int i, int key) {
        if (arr[i] == key) {
            System.out.println("Key found on " + i);
            return i;
        }
        if (i == arr.length - 1) {
            return -1;
        }
        return firstOccurence(arr, i + 1, key);
    }

    public static int lastOccurenceKuldeep(int arr[], int i, int key) {
        if (arr[i] == key) {
            return i;
        }
        if (i == 0) {
            return -1;
        }
        return lastOccurenceKuldeep(arr, i - 1, key);
    }

    public static int lastOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {

        // --------------Print-numbers-from-n-to-1-(Decresing-order)--------------
        // printDecresing(5);

        // --------------Print-numbers-from-1-to-n-(Increasing-order)--------------
        // printIncreasing(5);

        // --------------Print-factorial-of-a-no--------------
        // System.out.println(factorial(4));

        // --------------Print-sum-of-first-n-natural-no--------------
        // System.out.println(printSumOfNo(6));

        // --------------Print-n-fibonaccin-No--------------
        // System.out.println(fibonaccinNo(5));
        // System.out.println(fibonaccinNoRecursive(8));

        // --------------Check-if-array-is-sorted-or-not--------------
        // int arr[] = { 1, 2, 3, 4, 5 };
        // System.out.println(isSorted(arr, 0));
        // System.out.println(arr.length);
        // System.out.println(arr.length - 1);

        // --------------WAF-to-find-the-first-occurence-of-an-element-in-an-array--------------
        // int arr[] = { 8, 3, 6, 9, 5, 2, 1, 5, 0, 4, 3, 5, 7, 8 };
        // System.out.println(firstOccurence(arr, 0, 5));

        // --------------WAF-to-find-the-last-occurence-of-an-element-in-an-array--------------
        int arr[] = { 8, 3, 6, 9, 5, 2, 1, 5, 0, 4, 3, 5, 7, 8 };
        System.out.println(lastOccurenceKuldeep(arr, arr.length - 1, 5));
        System.out.println(lastOccurence(arr, 5, 0));
    }
}