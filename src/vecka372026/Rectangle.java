package vecka372026;

public class Rectangle {

    //Skapa klassen Rectangle
    //Spara bredd och höjd via konstruktor

    private int width;
    private int height;

    public Rectangle(int width, int height) {

        this.width = width;
        this.height = height;

    }

    //Metod som returnera area (bredd*höjden)

    public int area() {
        return width * height;
    }

    //Metod som returnera omkrets (bredd+höjd)*2

    public int circumference() {
        return (width + height) * 2;
    }

    public boolean isSquare() {
        return width == height;
    }
}
