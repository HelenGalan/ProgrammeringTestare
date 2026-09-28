package vecka392026;

public class SummanOchMedelv {

    static void main() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 30, 40, 50};

        // Beräkna och skriv ut summan och medelvärdet av de 50 talen.

        //33 + 1 + 2...+39 (1+2+3+4+5 = 15)

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];


        }

        System.out.println("Summan: " + sum);

        //summan/(antal tal) 15/5 = 3

        int medeltalet = sum / numbers.length;
        System.out.println("Medeltalet: " + medeltalet);
    }

}
