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

    public static int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int count = climbStairs(n - 1) + climbStairs(n - 2);
        return count;
    }

    public static int printMaxInArray(int arr[], int n, int max) {
        if (arr.length == n) {
            return max;
        }
        if (max < arr[n]) {
            max = arr[n];
        }
        return printMaxInArray(arr, n + 1, max);
    }

    public static boolean isKeyPresent(String str, int n, String key) {
        if (str.length() == n) {
            return false;
        }
        if (key.equals(str.charAt(n) + "")) {
            return true;
        }
        return isKeyPresent(str, n + 1, key);
    }

    public static boolean isSorted(int n, int arr[], int min) {
        if (n == arr.length) {
            return true;
        }
        if (arr[n] < min) {
            return false;
        }
        min = arr[n];
        return isSorted(n + 1, arr, min);
    }

    public static boolean binarySearch(int arr[], int key, int s, int e, int mid) {

        if (s > e) {
            return false;
        }

        if (arr[mid] == key) {
            System.out.println("Found at index: " + mid + ", value is " + arr[mid]);
            return true;
        }

        if (arr[mid] > key) {
            e = mid;
        } else {
            s = mid + 1;
        }

        return binarySearch(arr, key, s, e, ((s + e) / 2));
    }

    public static void printSubsequences(String str, String output, int i) {
        if (i >= str.length()) {
            System.out.print(output + " ");
            return;
        }
        // Exclude-string
        printSubsequences(str, output, i + 1);

        // Include-string
        output = output + str.charAt(i);
        printSubsequences(str, output, i + 1);
    }

    public static void printSubsequencesWithSameEndingChar(String str, String output, int i) {
        if (i >= str.length()) {

            if (!output.equals("")) {
                int im1 = output.length() - 1;
                String start = String.valueOf(output.charAt(0));
                String end = String.valueOf(output.charAt(im1));

                if (start.equals(end)) {
                    System.out.print(output + " ");
                }
            } else {
                System.out.print("_" + " ");
            }

            return;
        }
        // Exclude-string
        printSubsequencesWithSameEndingChar(str, output, i + 1);

        // Include-string
        output = output + str.charAt(i);
        printSubsequencesWithSameEndingChar(str, output, i + 1);
    }

    public static int countAndPrintSubsequencesWithSameEndingChar(String str, String output, int i) {
        int count = 0;
        if (i >= str.length()) {
            if (!output.equals("")) {
                int im1 = output.length() - 1;
                String start = String.valueOf(output.charAt(0));
                String end = String.valueOf(output.charAt(im1));

                if (start.equals(end)) {
                    System.out.print(output + " ");
                    count++;
                }
            } else {
                System.out.print("_" + " ");
            }
            return count;
        }

        // Exclude current character
        count += countAndPrintSubsequencesWithSameEndingChar(str, output, i + 1);

        // Include current character
        output = output + str.charAt(i);
        count += countAndPrintSubsequencesWithSameEndingChar(str, output, i + 1);

        return count;
    }

    public static int minimum(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static int returnMinimumNoCountRequiredToReachTarget(int arr[], int target) {
        if (target == 0) {
            return 0;
        }
        if (target < 0) {
            return Integer.MAX_VALUE;
        }
        int minimumCount = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int counts = returnMinimumNoCountRequiredToReachTarget(arr, target - arr[i]);
            if (counts != Integer.MAX_VALUE) {
                // Below ternery operator will return the miminumCount
                counts = counts + 1;
                minimumCount = minimum(minimumCount, counts);
            }
        }
        return minimumCount;
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int cutIntoSegments(int n, int x, int y, int z) {
        if (n == 0) {
            return 0;
        }
        if (n < 0) {
            return Integer.MIN_VALUE;
        }
        int ans1 = cutIntoSegments(n - x, x, y, z) + 1;
        int ans2 = cutIntoSegments(n - y, x, y, z) + 1;
        int ans3 = cutIntoSegments(n - z, x, y, z) + 1;
        // Below funcion will return the max value
        int ans = max(ans1, max(ans2, ans3));
        return ans;
    }

    public static void maxSumOfNonAdjacentElements(int arr[], int i, int sum) {
        int maxSum = Integer.MIN_VALUE;
        if (i >= arr.length) {
            maxSum = max(sum, maxSum);
            System.out.println(maxSum);
            return;
        }
        // include
        maxSumOfNonAdjacentElements(arr, i + 2, sum + arr[i]);
        // exclude
        maxSumOfNonAdjacentElements(arr, i + 1, sum);
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
        // String str1 = "abcab";
        // int n = str1.length();
        // System.out.print(countSubstrs(str1, 0, n - 1, n));

        // --------------Tower-of-hanoi-------------
        // int n = 3;
        // towerOfHanoi(n, "A", "B", "C");

        // --------------Climb-stairs-------------
        // You are climbing a staircase. It takes n steps to reach the top. Each time
        // you can either climb 1 or 2 steps. In how many distinct ways can you climb to
        // the top?
        // int n = 5;
        // System.out.print(climbStairs(n));

        // --------------Print-Maximum-In-array-------------
        // int arr[] = { 1, 22, 3, 4, 5 };
        // int max = Integer.MIN_VALUE;
        // System.out.println(printMaxInArray(arr, 0, max));

        // --------------Check-if-key-is-present-in-string-------------
        // System.out.println(isKeyPresent("kuldeep", 0, "d"));
        // System.out.println(key.equals(str.charAt(3) + "")); // By concatinating the
        // char with empty string "", that char
        // is converted to string
        // System.out.println(key.equals(String.valueOf(str.charAt(3)))); //Here also
        // char is converted into string

        // --------------IS-Sorted-------------
        // int arr[] = { 1, 2, 3, 4, 5 };
        // int arr2[] = { 2, 7, 3, 8, 0, 1 };
        // System.out.println(isSorted(0, arr, Integer.MIN_VALUE));

        // --------------Binary-search--------------
        // int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // System.out.println(binarySearch(arr, 10, 0, arr.length - 1, ((0 + arr.length)
        // / 2)));

        // --------------Print-all-possible-subsequence--------------
        // String str = "abc";
        // String outputStr = "";
        // int i = 0;
        // printSubsequences(str, outputStr, i);

        // --------------Print-all-possible-subsequence-start-and-end-with-same-character--------------
        // Note, here string is not continuously subsequence.
        // String str = "abcab";
        // String outputStr = "";
        // int i = 0;
        // printSubsequencesWithSameEndingChar(str, outputStr, i);

        // --------------Print-count-of-all-possible-subsequence-start-and-end-with-same-character---------------
        // Note, here string is not continuously subsequence.
        // String str = "abcab";
        // String output = "";
        // int totalCount = countAndPrintSubsequencesWithSameEndingChar(str, output, 0);
        // System.out.println("\nTotal count: " + totalCount);

        // --------------Print-minimum-no-of-element's-sum-required-to-reach-target-sum---------------
        // You are given an integer array coins representing coins of different
        // denominations and an integer amount representing a total amount of money.
        // Return the fewest number of coins that you need to make up that amount. If
        // that amount of money cannot be made up by any combination of the coins,
        // return -1.
        // You may assume that you have an infinite number of each kind of coin.
        // int arr[] = { 1, 2 }; // arr or coins
        // int target = 5;
        // System.out.println(returnMinimumNoCountRequiredToReachTarget(arr, target));

        // --------------cut-into-segments---------------
        // Determine max no(max-count) of segments you can make of rod whose length is
        // 'n' provided, that each segment should be of length x,y,z.
        // int n = 7;
        // int x = 5;
        // int y = 2;
        // int z = 2;
        // int ans = cutIntoSegments(n, x, y, z);
        // if (ans < 0) {
        // System.out.println("Not possible");
        // } else {
        // System.out.println(ans);
        // }

        // --------------Max-sum-of-non-adjacent-elements---------------
        // we have to return the max sum of subsequence in which no two elements are
        // adjacent.
        // int arr[] = { 2, 1, 4, 9 };
        // int sum = 0;
        // int i = 0;
        // int maxSum = Integer.MIN_VALUE;
        // maxSumOfNonAdjacentElements(arr, i, sum); //In op we have 11 which is the ans

        // --------------last-occurance-of-char---------------
        String str = "abcddedg";
        char x = 'd';
        
    }
}