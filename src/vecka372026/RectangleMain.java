package vecka372026;

public class RectangleMain {
    static void main() {
        //Skapa klass för mainmetod
        //Skapa objekt av rektangeln
        Rectangle rectangleObject = new Rectangle(7, 8);

        //Använda metoderna för att hämta omkrets och area + skriva ut dem

        System.out.println(rectangleObject.area());
        System.out.println(rectangleObject.circumference());

        if (rectangleObject.isSquare()) {
            System.out.println("Det är en kvadrat");
        } else {
            System.out.println("Det är inte en kvadrat");
        }
    }
}
