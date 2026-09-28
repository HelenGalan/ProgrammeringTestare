package vecka362026;

public class PetZoo {
    static void main() {
        Pet pet1 = new Pet("Melissa");
        Pet pet2 = new Pet("Kashmir");
        Pet pet3 = new Pet("Trixie");

        //pet1.petSkrivare();
        //pet2.petSkrivare();
        //pet3.petSkrivare();

        String petName1 = pet1.getName();
        String petName2 = pet2.getName();
        String petName3 = pet3.getName();

        for (int i = 0; i < 2; i++) {
            System.out.println(petName1);
            System.out.println(petName2);
            System.out.println(petName3);
        }

    }
}
