package vecka402026;

import java.util.Scanner;

public class TisdagsSwitch3 {
    static void main() {
        //Skapa en enkel kalkylator som tar emot två tal
        //Använd Scanner och spara två tal från konsolen i var sin variabel
        Scanner scan = new Scanner(System.in);

        // och en operation (addition, subtraktion, multiplikation, division)
        int number1 = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();
        int number2 = Integer.parseInt(scan.nextLine());

        switch(operator) {
            // Läs in + - * / (add, sub, mul, div)
            case "+":
                int sum = number1 + number2;
                System.out.println(sum);
                break;
            case "-":
                int min = number1 - number2;
                System.out.println(min);
                break;
            case "*":
                int mult = number1 * number2;
                System.out.println(mult);
                break;
            case "/":
                int divi = number1 / number2;
                System.out.println(divi);
                break;
        }


        // från användaren. Använd en switch-sats för att bestämma vilken operation som ska utföras baserat på användarens input.
        //Switchsats där operation bestämmer vilken kod som ska köras
        //För varje operation skriv ut resultatet av uträkningen

    }
}
