package vecka392026;

public class NegativPositiv {
    static void main() {
        int[] numbers = {1, 2, 3, 4, -10, -17, 20, -30, 40, 50};

        int negative = 0,
                positive = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                positive += numbers[i];
            } else {
                negative += numbers[i];
            }
        }

        System.out.println("Negative soma: " + negative);
        System.out.println("Positive soma: " + positive);
    }
}
