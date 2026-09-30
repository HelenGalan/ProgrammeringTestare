package vecka402026;

import java.util.Scanner;

public class TisdagsSwitch1 {

    static void main() {
        //Skapa ett program där användaren matar in en siffra (1-7)
        //Scanner
        Scanner scan = new Scanner(System.in);

        //Spara ett tal i en variabel som kommer ifrån Scanner
        int day = scan.nextInt();

        // och programmet använder en switch-sats för att skriva ut
        // motsvarande dag i veckan (1 är Måndag, 2 är Tisdag, etc.).
        //beroende på det sparade värdet

        switch (day) {
            //Vid värdet 1 - Måndag
            //2 - Tisdag
            //..
            //7 - Söndag
            //default - Talet motsvarar ingen dag i veckan
            case 1:
                System.out.println("Måndag");
                break;
            case 2:
                System.out.println("Tisdag");
                break;
            case 3:
                System.out.println("Onsdag");
                break;
            case 4:
                System.out.println("Torsdag");
                break;
            case 5:
                System.out.println("Fredag");
                break;
            case 6:
                System.out.println("Lördag");
                break;
            case 7:
                System.out.println("Söndag");
                break;
            default:
                System.out.println("Talet motsvarar ingen dag i veckan.");
        }

    }


}
