package lektionTisdag;

public class Dog {
    private String dogName;
    private String dogBreed;
    private int dogAge;

    public Dog(String namn, String ras, int aldre) {
        dogName = namn;
        dogBreed = ras;
        dogAge = aldre;
    }

    public void bark() {
        System.out.println(dogName + " has the breed " + dogBreed + " and she says: Voff!!");
    }

    public void oneYearOlder(){
        dogAge++;
    }

    public void setAge(int newAge) {
        dogAge = newAge;
    }

    public void getHumanAge() {
        System.out.println("Dog age: " + dogAge + ", Human age: " + dogAge * 7);
    }

    public int getHumanAgeNew() {
        return dogAge * 7;
    }
}
