package vecka392026;

import java.util.Scanner;

public class monday1array {

    static void main() {

        String[] namn = {"Per", "Helen", "Melissa", "Kashmir", "Trixie", "Ciara"};

        System.out.println(namn[0]);
        System.out.println(namn[4]);

        for (int i = 0; i < 6; i++) {
            System.out.println(namn[i]);
        }

        System.out.println("------");

        String[] andraNamn = new String[5];

        andraNamn[0] = "Sheldon";
        andraNamn[1] = "Amy";
        andraNamn[2] = "Lenard";
        andraNamn[3] = "Penny";
        andraNamn[4] = "Raj";

        for (int i = 0; i < andraNamn.length; i++) {
            System.out.println(andraNamn[i]);
        }

        System.out.println("------");

        String modernFamily = "Haley Gloria Cam Michel Clair";

        String[] modernFamilyArray = modernFamily.split(" ");

        for (int i = 0; i < modernFamilyArray.length; i++) {
            System.out.println(modernFamilyArray[i]);
        }

        System.out.println("------");

        Scanner scan = new Scanner(System.in);

        System.out.print("Skriver 5 stycken namn på Big Bang Theory serie: ");
        String bigBangTheory = scan.nextLine();

        String[] bigBangTheoryArray = bigBangTheory.split(", ");

        System.out.println(bigBangTheoryArray[0]);
        System.out.println(bigBangTheoryArray[4]);

        System.out.println("------");

        System.out.print("Skriver 5 olika band namn: ");

        String[] bands = new String[5];

        for (int i = 0; i < bands.length; i++) {
            bands[i] = scan.nextLine();
        }

        System.out.println(bands[0]);
        System.out.println(bands[bands.length - 1]);
    }
}
