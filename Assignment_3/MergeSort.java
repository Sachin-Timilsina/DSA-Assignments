class MergeSort{
    

    public static void mergeSort(int[] arr) {
        if (arr.length <= 1) return; // Already sorted.

        int mid = arr.length / 2;

        // Two halves arrays declaration.
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];
        
        // copy array values to left and right sub arrays.
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }

        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }

        // recursive call on left and right
        mergeSort(left);
        mergeSort(right);

        // Merge both halves
        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0; // left, right and main array tracking indexes
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }


    public static void main(String[] args) {
        int[] numbers = {1,11,2,7,0};

        mergeSort(numbers);

        printArray(numbers);
    }

    public static void printArray(int[] numbers) {
        for (int number: numbers) {
            System.out.println(number);
        }
    }
}

/*
        Divide and conquer algorithm
        - merge() for merging two halves
        - mergeSort() for recursively calling itself to divide array
        till size is one.

        Time Complexity:
        Worst Case: O(n log n) same (in best, average and worst.)
        -> array keeps splitting in half
        -> at each level, merge n elements.

        
        Space Complexity:
        Worst Case: O(n) 
        -> it is not in place sorting
        -> left sub array and right sub array (total n)
    */