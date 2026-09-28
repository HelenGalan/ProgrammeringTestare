package lektionTorsdag;

public class Calculator {
    private int number1;
    private int number2;

    public Calculator(int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
    }
/*
    public void add() {
        System.out.println(number1 + number2);
    }
*/
    public int add() {
        return number1 + number2;
    }

    public void sub() {
        System.out.println(number1 - number2);
    }

    public void mul() {
        System.out.println(number1 * number2);
    }

    public void div() {
        System.out.println(number1 / number2);
    }
}
