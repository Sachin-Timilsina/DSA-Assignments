class BubbleSort{
    // Swap adjacent, it becomes sorted starting from last in each iteration.
    public static void sorting(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {

                if (numbers[j] > numbers[j+1]) {
                    int temp = numbers[j+1];
                    numbers[j+1] = numbers[j];
                    numbers[j] = temp;
                }
                
            }
        }

        printArray(numbers);
    }

    public static void printArray(int[] numbers) {
        for (int number: numbers) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {3, 2, 1, 5};
        sorting(numbers);
    }
}