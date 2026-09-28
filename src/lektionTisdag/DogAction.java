package lektionTisdag;

public class DogAction {
    static void main() {
        Dog dog1 = new Dog("Ciara", "Border Collie", 10);

        dog1.bark();
        dog1.getHumanAge();
        dog1.oneYearOlder();
        dog1.getHumanAge();
        dog1.setAge(20);
        dog1.getHumanAge();
        dog1.oneYearOlder();
        dog1.getHumanAge();
        int human = dog1.getHumanAgeNew();
        System.out.println(human);
        human = dog1.getHumanAgeNew();
        dog1.getHumanAge();
    }
}
