package vecka402026;

import java.util.Scanner;

public class TisdagsSwitch2 {

    static void main() {

        Scanner scan = new Scanner(System.in);

        //Januari, februari, osv
        String month = scan.nextLine();

        switch(month) {
            case "januari", "februari", "december":
                System.out.println("Vinter");
                break;
            case "mars", "april", "maj":
                System.out.println("Vår");
                break;
            case "juni", "juli", "augusti":
                System.out.println("Sommar");
                break;
            case "september", "oktober", "november":
                System.out.println("Höst");
                break;
            default:
                System.out.println("Ordet motsvarar ingen månaden");
        }

    }
}
