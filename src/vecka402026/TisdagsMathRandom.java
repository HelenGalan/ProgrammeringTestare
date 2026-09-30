package vecka402026;

import java.util.Scanner;

public class TisdagsMathRandom {
    static void main() {

        Scanner scan = new Scanner(System.in);

        // define the range
        int min = 1,
                max = Integer.parseInt(scan.nextLine()),
                    range = max - min + 1;

        // generate random numbers from min to max
        int random = (int) (Math.random() * range) + min;

        System.out.println(random);
    }
}
