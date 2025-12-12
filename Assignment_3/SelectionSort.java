class SelectionSort{

    /*
    select the smallest element form the unpartitioned list
    and replace with the current ith element.
    */

   // Time Complexity: O(n^2) and space complexity: O(1)
    public static void sorting(int[] numbers) {
        for(int i = 0; i < numbers.length - 1; i++){
            int currentMinimum = i; // index of smallest elem

            for(int j = i+1; j < numbers.length; j++){
                if (numbers[j] < numbers[currentMinimum]){
                    currentMinimum = j;
                }
            }

            int temp = numbers[i];
            numbers[i] = numbers[currentMinimum];
            numbers[currentMinimum] = temp;
        }
        // print the sorted array
        printArray(numbers);
    }

    public static void printArray(int[] numbers) {
        for (int number: numbers) {
            System.out.println(number);
        }
    }

    public static void main(String[] args){
        int[] numbers = {1,11,2,7,0};

        sorting(numbers);
    }
}