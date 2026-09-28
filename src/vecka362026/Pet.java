package vecka362026;

public class Pet {
    private String name;   //attribute

    public Pet(String petName) {     //konstruktor
        name = petName;
    }

    public void petSkrivare() {

        System.out.println(name);
    }

    public String getName () {
        return name;
    }
}
