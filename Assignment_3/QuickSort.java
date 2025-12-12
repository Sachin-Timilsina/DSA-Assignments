public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];           // pivot is first element
        int i = low - 1;                // left pointer starts before low
        int j = high + 1;               // right pointer starts after high

        while (true) {
            // Move i right until we find element >= pivot
            do {
                i++;
            } while (arr[i] < pivot);

            // Move j left until we find element <= pivot
            do {
                j--;
            } while (arr[j] > pivot);

            if (i >= j) {
                return j;
            }

            // Swap elements
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array:");
        printArray(arr);
    }
}