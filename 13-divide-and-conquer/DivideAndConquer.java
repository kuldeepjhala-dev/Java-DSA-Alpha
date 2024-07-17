public class DivideAndConquer {

    public static void mergeSort(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + (high - low) / 2);
        mergeSort(arr, low, mid); // left half
        mergeSort(arr, mid + 1, high); // right half
        merge(arr, low, mid, high); // merging sorted half
    }

    public static void merge(int arr[], int low, int mid, int high) {
        int temp[] = new int[high - low + 1]; // temporary array
        int left = low; // starting index of left half of the array
        int right = mid + 1; // starting index of right half of the array
        int k = 0;
        // storing element in temporary array in a sorted array
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[k] = arr[left];
                left++;
            } else {
                temp[k] = arr[right];
                right++;
            }
            k++;
        }
        // if elements on the left half are still left
        while (left <= mid) {
            temp[k] = arr[left];
            left++;
            k++;
        }

        // if elements on the right half are still left
        while (right <= high) {
            temp[k] = arr[right];
            right++;
            k++;
        }

        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        System.out.print("Before: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        mergeSort(arr, 0, arr.length - 1);
        System.out.println();
        System.out.print("After : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}