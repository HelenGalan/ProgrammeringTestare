package ovning;

public class gjordaOvning {
    static void main() {

        //uppgift1

        //Skapa ett program som skriver ut kvadraten på ett tal
        //som är definierat i en variabel.
        //Kvadraten är talet multiplicerat med sig själv.

        // spara heltalet 4 i en variabel
        // datatyp variabelNamn = värde;
        int number = 4;


        // skriv ut variabel * variabel (som blir 4*4=16)
        System.out.println(number * number);
        System.out.println("______");

        //uppgift 3
        int secondMinute = 60;
        int hour = 78;

        System.out.println(hour * secondMinute + " minutes");
        System.out.println((hour * secondMinute) * secondMinute + " seconds");
        System.out.println("______");

        //uppgift 7
        int gas = 30;
        int price = 15;
        int discountPercent = 5;
        int totalPrice = gas * price;
        int discountPrice = totalPrice - totalPrice * discountPercent / 100;

        System.out.println(discountPrice);
        System.out.println("______");

        //uppgift 12
        int tal1 = 20;
        int tal2 = 10;

        if (tal1 > tal2 * 2) {
            System.out.println("För stort");
        } else {
            System.out.println(tal1 + " är inte mer än dubbel så stort än " + tal2);
        }
        System.out.println("______");

        //uppgift 16
        int pris = 1230;
        int antalVaror = 9;

        int grans = 1000;
        double rabatt = 0.9;

        double totalPris = pris * antalVaror * rabatt;

        if (totalPris > grans) {
            System.out.println(totalPris);
        }

        //Staffans lösning
        int price16 = 120;
        int nbrArticles = 9;
        int limit = 1000;
        double discount = 0.9;

        //totalpris = pris*antalVaror
        double total = price * nbrArticles;

        //OM totalpris > gräns
        if (total >= limit) {
            total = price * nbrArticles * discount;
        }
        //totalpris = pris*antalVaror*rabatt
        //

        //skriva ut totalpriset
        System.out.println(total);
        System.out.println("______");

        //uppgift 20

        //20 Skapa ett program som har sparat ett tal.

        int number20 = 10;

        // Om talet är mellan 0 och 9

        if (number20 >= 0 && number20 <= 9) {
            // ska kvadraten påtalet skrivas ut.
            System.out.println(number20 * number20);
        } else {
            // Annars ska lämpligt felmeddelande ges
            System.out.println("Talet är inte mellan 0 och 9");
        }
        System.out.println("______");

        //uppgift 25

        //Skapa ett program där ett tal sparas
        int number25 = 0;

        // och det skrivs ut om talet är positivt
        if (number25 < 0) {
            System.out.println(number25 + " är ett negativt tal");
        } else {
            // eller negativt.
            System.out.println(number25 + " är ett positivt tal");

        }
        System.out.println("______");

        //uppgift 29

        //Skapa ett program som beräknar ankomsttiden för ett tåg. I inmatningsrutan finns
        //följande: tidpunkt i timma och minut för avgången (t ex 12:41) körtid i timma och minut (t
        //ex 3:47)
        //I utmatningsrutan ska klockslaget för ankomsttiden skrivas. Om midnatt
        //passeras ska det även skrivas “NÄSTA DAG“ i utmatningsrutan.

        int depH = 14;
        int depM = 37;
        int driveH = 12;
        int driveM = 12;

        int arrH = depH + driveH;
        int arrM = depM + driveM;

        if (arrM >= 60) {
            arrM -= 60;
            arrH++;
        }

        if (arrH >= 24) {
            arrH -= 24;
            System.out.println("NÄSTA DAG!");
        }

        System.out.println("Arrival at: " + arrH + ":" + arrM);
        System.out.println("______");

        // uppgift 31

        //Skapa ett program där talen 1 till 10 skrivs ut.

        int limit31 = 10;
        for (int  i = 1; i <= limit31 ; i++) {
            System.out.println(i);
        }
        System.out.println("______");

        //uppgift 33
        //Skriv ut talen 100 till 0, dvs 100, 99, 98, …, 0.

        for (int i = 100; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("______");

        //Uppgift 34
        //Skapa ett program som skriver ut ett tal i taget med start ifrån 0.
        // När summan av alla tidigare tal är mer än 50 ska programmet avsluta.

        int number34 = 0;

        while (number34 <= 50) {
            System.out.print(number34 + " ");
            number34++;
        }
        System.out.println("______");



        //Uppgift 35
        //Skapa ett program som beräknar och skriver ut kvadraterna för talen 1 till 9.
        // Dvs 1 multiplicerat med 1, 2 multiplicerat med 2 osv.

        int number35 = 1;

        while (number35 <= 9) {
            System.out.print(number35 * number35 + " ");
            number35++;
        }
        System.out.println("______");

        //Uppgift 42
        //En man erbjuds ett ovanligt riskfyllt arbete. Lönesättningen är också ovanlig. För
        //första dagen erbjuds han 1 öre, för andra dagen 2 öre, för tredje dagen 4 öre osv. Lönen
        //fördubblas alltså varje dag. Skapa ett program som beräknar hur många dagar mannen
        //måste arbeta för att tjäna en miljon kronor.

        int totalSalary = 1;
        int salary = 1;
        int days = 1;

        while(totalSalary < 1000000) {
            salary *= 2;
            days++;
            totalSalary += salary;

            System.out.println("Salary: " + salary);
            System.out.println("Total: " + totalSalary);
        }

        System.out.println("Days: " + days);






    }
}
