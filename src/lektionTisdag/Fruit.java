package lektionTisdag;

public class Fruit {
    //definition av attribute
    //private datatyp variabelNamn
    private String color;

    //definition av konstruktor utan parameter
    //public klassnamn() {}
    public Fruit () {
        //ge color ett värde
        color = "röd";
    }

    //definition av konstruktor med parameter
    //public klassnamn(datatyp parameterNamn) {attibuteNamn = parameterNamn;}
    public Fruit (String myColor) {
        color = myColor;
    }

    //metod sim inte ge tillbaka någonting, bara gör saker
    //public void metodNamn() {}
    public void printColor() {
        System.out.println("Fruktens färg är: " + color);
    }


}
