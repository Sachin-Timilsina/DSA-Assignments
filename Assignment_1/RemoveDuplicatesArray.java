public class RemoveDuplicatesArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5, 3};
        int n = arr.length;

        int[] temp = new int[n];
        int uniqueCount = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            // Check if arr[i] already exists in temp
            for (int j = 0; j < uniqueCount; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not duplicate, add it to temp
            if (!isDuplicate) {
                temp[uniqueCount] = arr[i];
                uniqueCount++;
            }
        }

        // Print array without duplicates
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(temp[i] + " ");
        }
    }

}
