package vecka372026;

public class MerOmString {
    static void main() {

        String myString = "some text";
        if (myString.equals("some text")) {
            System.out.println("I got the job!");
        }

        if (myString.length() == 9) {
            System.out.println("Lika med 9!");
        }

        System.out.println(myString.charAt(3));
        System.out.println(myString.charAt(myString.length() - 1));
    }
}
