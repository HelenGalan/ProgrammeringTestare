package vecka392026;

public class SmalestBiggest {
    static void main() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 30, 40, 50};

        int smallest = numbers[0], biggest = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }

            if (numbers[i] > biggest) {
                biggest = numbers[i];
            }
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Biggest: " + biggest);
    }
}
