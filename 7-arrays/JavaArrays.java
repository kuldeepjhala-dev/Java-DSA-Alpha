import java.util.*;

public class JavaArrays {

    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
        System.out.print("update function marks => ");
        printArray(marks);
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int linearSearch(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int linearSearchMenu(String menu[], String foodItem) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == foodItem) {
                return i;
            }
        }
        return -1;
    }

    public static int findLargestElement(int arr[]) {
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int binarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) { // right
                start = mid + 1;
            } else { // left
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void reverseArray(int arr[]) {
        int end = arr.length - 1;
        int start = 0;
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void pairsInAnArray(int arr[]) {
        int n = arr.length;
        int pairsCounter = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
                pairsCounter++;
            }
            System.out.println();
        }
        System.out.println("Total pairs : " + pairsCounter);
    }

    public static void printAllSubArray(int arr[]) {
        int n = arr.length;
        int subArrayCounter = 0;
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + ",");
                }
                subArrayCounter++;
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("Total subarrays : " + subArrayCounter);
    }

    public static void printSumOfSubArrays(int arr[]) {
        int n = arr.length;
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                int sum = 0;
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + ", ");
                    sum = sum + arr[i];
                }
                System.out.print("==> sum is " + sum + ",     ");
            }
            System.out.println();
        }
    }

    public static void printMaxAndMinSumOfSubArrays(int arr[]) {
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                }
                if (sum < min) {
                    min = sum;
                }
                if (sum > max) {
                    max = sum;
                }
            }
        }
        System.out.println("Min subarray sum value is : " + min);
        System.out.println("Max subarray sum value is : " + max);
    }

    public static void printMaxSumOfSubArrayUsingPrefixMethod(int arr[]) {
        int prefixArr[] = new int[arr.length];
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        prefixArr[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixArr[i] = prefixArr[i - 1] + arr[i];
        }
        // printArray(prefixArr); // 1 -1 5 4 7
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                sum = start == 0 ? prefixArr[end] : prefixArr[end] - prefixArr[start - 1];
                if (maxSum < sum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println("Max subarray sum value is : " + maxSum);
    }

    public static void printMaxSumOfSubArrayUsingKadensAlgorithm(int arr[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            currentSum = currentSum + arr[i];
            if (currentSum < 0) {
                currentSum = 0;
            }
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println("Max subarray sum value is : " + maxSum);
    }

    public static void main(String[] args) {

        // -------------------------------------Array-basics-------------------------------------
        // int marks[] = new int[100];
        // Scanner sc = new Scanner(System.in);
        // int phy, chem, math;
        // phy = sc.nextInt();
        // chem = sc.nextInt();
        // math = sc.nextInt();
        // marks[0] = phy;
        // marks[1] = chem;
        // marks[2] = math;
        // System.out.println("Physics " + phy);
        // System.out.println("Chemistry " + chem);
        // System.out.println("Maths " + math);
        // int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        // System.out.println("Percentage " + percentage + "%");

        // -------------------------------------Array-length-method-------------------------------------
        // int subject[] = new int[100];
        // System.out.println(subject.length); // op: 100

        // -------------------------------------Array-passed-as-argument-------------------------------------
        // By default array are "call by reference". So array which is passed as
        // argument
        // to funciton, if modification is done
        // in the function then it will be changed in main function.
        // By defautl variables are not call by reference.
        // int marks[] = { 97, 98, 99 };
        // System.out.print("main function marks => ");
        // printArray(marks);// op: 97 98 99
        // update(marks); // op: 98 99 100
        // System.out.print("Updated main function marks => ");
        // printArray(marks);// op: 98 99 100

        // -------------------------------------Array-Linear-search-------------------------------------
        // int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        // int key = 20;
        // int index = linearSearch(numbers, key);
        // if (index == -1) {
        // System.out.println("key not found");
        // } else {
        // System.out.println("Key found at index: " + key);
        // }
        // String menu[] = { "dosa", "chole bhature", "samosa" };
        // String foodItem = "chole bhature";
        // int foodItemIndex = linearSearchMenu(menu, foodItem);
        // if (foodItemIndex == -1) {
        // System.out.println(foodItem + " is not found");
        // } else {
        // System.out.println(foodItem + " is available at menu no " + (foodItemIndex +
        // 1));
        // }

        // -------------------------------------Array-Find-largest-element--------------------------------------
        // int arr[] = { 1, 2, 63, 3, 5 };
        // int result = findLargestElement(arr);
        // System.out.println("Largest value is " + result);

        // -------------------------------------Array-binary-search--------------------------------------
        // int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80 };
        // int key = 5;
        // int result = binarySearch(arr, key);
        // if (result == -1) {
        // System.out.println("index not found");
        // } else {
        // System.out.println("index found " + result + " value is " + arr[result]);
        // }

        // -------------------------------------Array-Reverse-------------------------------------
        // int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11 };
        // printArray(arr); // op: 1 2 3 4 5 6 7 8 9 10
        // reverseArray(arr);
        // printArray(arr); // op: 10 9 8 7 6 5 4 3 2 1

        // -------------------------------------Array-all-pairs---------------------------------------
        // int arr[] = { 2, 4, 6, 8, 10 };
        // pairsInAnArray(arr);

        // -------------------------------------Array-print-all-subarray-------------------------------------
        // int arr[] = { 2, 4, 6, 8, 10 };
        // printAllSubArray(arr);

        // -------------------------------------Array-sum-of-subarray-------------------------------------
        // int arr[] = { 2, 4, 6, 8, 10 };
        // printSumOfSubArrays(arr);

        // -------------------------------------Array-print-max-and-min-sum-of-subarray-------------------------------------
        // int arr[] = { 1, -2, 6, -1, 3 };
        // printMaxAndMinSumOfSubArrays(arr);

        // -------------------------------------Array-print-max-and-min-sum-of-subarray-using-prefix-array-------------------------------------
        // int arr[] = { 1, -2, 6, -1, 3 };
        // printMaxSumOfSubArrayUsingPrefixMethod(arr);

        // -------------------------------------Array-print-max-and-min-sum-of-subarray-using-Kaden's-algorithm-------------------------------------
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        printMaxSumOfSubArrayUsingKadensAlgorithm(arr);
    }

}