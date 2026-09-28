package lektionTisdag;

public class FruitSalad {
    static void main() {
        //KlassNamn eller datatyper variabelNamn = new konstruktorNamn();
        Fruit orange = new Fruit("orange");
        Fruit pomegranade = new Fruit();
        Fruit melon = new Fruit("green");

        orange.printColor();
        pomegranade.printColor();
        melon.printColor();
    }
}
