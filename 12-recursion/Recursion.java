import java.util.*;

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

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    public static int optimizedPower(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = optimizedPower(a, n / 2);
        int halfPowerSq = halfPower * halfPower;

        // n is odd
        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static int tilingProblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        // vertical choice
        int fnm1 = tilingProblem(n - 1);
        // horizontal choice
        int fnm2 = tilingProblem(n - 2);
        int twoWays = fnm1 + fnm2;
        return twoWays;
    }

    public static void removeDuplicate(String str, StringBuilder newStr, int index, boolean[] map) {
        if (index == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currentChar = str.charAt(index);
        if (map[currentChar - 'a'] == true) {
            removeDuplicate(str, newStr, index + 1, map);
        } else {
            map[currentChar - 'a'] = true;
            removeDuplicate(str, newStr.append(currentChar), index + 1, map);
        }
    }

    public static int friendsParing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int fnm1 = friendsParing(n - 1);
        int fnm2 = friendsParing(n - 2);
        int pairWays = (n - 1) * fnm2;
        int totalWays = fnm1 + pairWays;
        return totalWays;
    }

    public static int friendsParingShortSyntax(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        return friendsParing(n - 1) + (n - 1) * friendsParing(n - 2);
    }

    public static void printBinaryString(int n, int lastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        printBinaryString(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            printBinaryString(n - 1, 1, str + "1");
        }
    }

    public static void printBinaryStringLongMethod(int n, int lastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        if (lastPlace == 0) {
            printBinaryString(n - 1, 0, str + "0");
            printBinaryString(n - 1, 1, str + "1");

        } else {
            printBinaryString(n - 1, 0, str + "0");
        }
    }

    public static void printIndexOfKeyElement(int arr[], int key, int i) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == key) {
            System.out.print(i + " ");
        }
        printIndexOfKeyElement(arr, key, i + 1);
    }

    public static String convertNumberToString(int i, String nos, StringBuilder words) {
        if (i == nos.length()) {
            return words.toString();
        }
        int no = nos.charAt(i) - '0';
        switch (no) {
            case 0:
                words.append("zero ");

                break;
            case 1:
                words.append("one ");

                break;
            case 2:
                words.append("two ");

                break;
            case 3:
                words.append("three ");

                break;
            case 4:
                words.append("four ");

                break;
            case 5:
                words.append("five ");

                break;
            case 6:
                words.append("six ");

                break;
            case 7:
                words.append("seven ");

                break;
            case 8:
                words.append("eight ");

                break;
            case 9:
                words.append("nine ");

                break;

            default:
                return "String nos must contain 0-9, and lastDigit cannot be zero";
        }
        return convertNumberToString(i + 1, nos, words);
    }

    static String digits[] = { "zero", "one", "two", "three", "four", "five", "six",
            "seven", "eight", "nine" };

    public static void printDigits(int number) {
        if (number == 0) {
            return;
        }
        int lastDigit = number % 10;
        printDigits(number / 10);
        System.out.print(digits[lastDigit] + " ");
    }

    public static int stringLength(int i, String str) {
        if (i == str.length()) {
            return i;
        }
        return stringLength(i + 1, str);
    }

    public static int stringLength2(String str) {
        if (str.length() == 0) {
            return 0;
        }
        return stringLength2(str.substring(1)) + 1;
    }

    public static int countSubstrs(String str, int i, int j, int n) {
        if (n == 1) {
            return 1;
        }
        if (n <= 0) {
            return 0;
        }
        int res = countSubstrs(str, i + 1, j, n - 1) +
                countSubstrs(str, i, j - 1, n - 1) -
                countSubstrs(str, i + 1, j - 1, n - 2);
        if (str.charAt(i) == str.charAt(j)) {
            res++;
        }
        return res;
    }

    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        // transfer top n-1 from src to helper using dest as 'helper'
        towerOfHanoi(n - 1, src, dest, helper);
        // transfer nth from src to dest
        System.out.println("transfer disk " + n + " from " + src + " to " + helper);
        // transfer n-1 from helper to dest using src as 'helper'
        towerOfHanoi(n - 1, helper, src, dest);
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
        // int arr[] = { 8, 3, 6, 9, 5, 2, 1, 5, 0, 4, 3, 5, 7, 8 };
        // int arr[] = { 5, 5, 5, 5, 5 };
        // System.out.println(lastOccurenceKuldeep(arr, arr.length - 1, 5));
        // System.out.println(lastOccurence(arr, 5, 0));

        // --------------Print-x-to-the-power-n--------------
        // System.out.println(power(2, 5));
        // System.out.println(optimizedPower(2, 5));

        // --------------Tiling-problem--------------
        // --------------WAF-to-find-no-of-ways-to-fit-(2*1)-size-tile-in-(2xn)-size-area.Where-n-is-input--------------
        // System.out.println(tilingProblem(2));

        // --------------Remove-duplicates-in-a-string--------------
        // String str = "apnacollege";
        // removeDuplicate(str, new StringBuilder(""), 0, new boolean[26]);

        // --------------Friends-paring-problem--------------
        // System.out.println(friendsParing(3));
        // System.out.println(friendsParingShortSyntax(3));

        // --------------Binary-String-problem--------------
        // printBinaryString(1, 0, "");
        // printBinaryStringLongMethod(3, 0, "");

        // --------------Print-the-index-when-key-comes-in-array-as-element--------------
        // int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        // int key = 2;
        // printIndexOfKeyElement(arr, key, 0);

        // --------------Convert-number-to-words-and-last-number-cannot-be-0-zero-------------
        // String nos = "123";
        // System.out.println(convertNumberToString(0, nos, new StringBuilder("")));
        // printDigits(1234);

        // --------------Find-length-of-string-------------
        // System.out.println(stringLength(0, "kuldeep"));
        // System.out.println(stringLength2("kuldeep"));

        // --------------Find-count-of-contiguous-substring-start-&-ends-with-same-char-------------
        // ITERATIVE-APPROACH
        // String s = "abcab";
        // int count = 0;
        // for (int i = 0; i < s.length(); i++) {
        // for (int j = i; j < s.length(); j++) {
        // if (s.charAt(i) == s.charAt(j)) {
        // count++;
        // }
        // }
        // }
        // System.out.println(count);
        // Recursive-Approach
        // String str = "abcab";
        // int n = str.length();
        // System.out.print(countSubstrs(str, 0, n - 1, n));

        // --------------Tower-of-hanoi-------------
        int n = 3;
        towerOfHanoi(n, "A", "B", "C");
    }
}