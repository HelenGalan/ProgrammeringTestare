package vecka372026;

import java.util.Scanner;

public class ExerciseString {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Skriv ett ord: ");
        String ord = sc.nextLine();

        for (int i = 0; i < ord.length(); i++) {
            System.out.println(ord.charAt(i));
        }

        if (ord.equals("ägg")) {
            System.out.println("Ägg är knasigt!");
        }
    }
}
