public class InsertionSort {

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Shift elements greater than key to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert key in the correct position
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 6, 1, 3};

        insertionSort(arr);

        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
