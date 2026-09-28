package vecka382026;

import java.util.Scanner;

public class WebShop {
    static void main() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Skriv användare och lösenord: ");

        String userName = scan.nextLine();
        String password = scan.nextLine();
        User user = new User(userName, password);

        System.out.print("Skriv nya användare och lösenord: ");
        String newUserName = scan.nextLine();
        user.setUserName(newUserName);

        System.out.println("Ditt nya användarnamn är: " +user.getUserName());





    }
}
