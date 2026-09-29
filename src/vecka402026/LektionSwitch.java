package vecka402026;

import java.util.Scanner;

public class LektionSwitch {
    static void main() {

        Scanner scan = new Scanner(System.in);

        String letter = scan.nextLine();

        switch (letter) {
            case "B":
                System.out.println("Brasilien");
                break;
            case "S":
                System.out.println("Sverige");
                break;
            case "F":
                System.out.println("Finland");
                break;
            case "N":
                System.out.println("Norge");
                break;
            case "I":
                System.out.println("Island");
                break;
            default:
                System.out.println("It does not matter");
        }
    }
}
