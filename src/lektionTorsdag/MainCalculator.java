package lektionTorsdag;

import java.util.Scanner;

public class MainCalculator {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv första talet: ");
        int num1 = scan.nextInt();
        System.out.println("Skriv andra talet: ");
        int num2 = scan.nextInt();

        Calculator calc = new Calculator(num1, num2);

        System.out.println("Soma: ");
        int sum = calc.add();
        System.out.println(sum);
        System.out.println(calc.add());

        System.out.println("Diferenca: ");
        calc.sub();
        System.out.println("Multiplicacao: ");
        calc.mul();
        System.out.println("Divisao: ");
        calc.div();
    }
}
