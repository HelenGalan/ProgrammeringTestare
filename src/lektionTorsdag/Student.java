package lektionTorsdag;

public class Student {
    private String name;
    private int year;

    public Student(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public void printStadie() {
        if(year == 1) {
            System.out.println("Lågstadiet");
        } else if (year == 2) {
            System.out.println("Mellanstadiet");
        } else if (year == 3) {
            System.out.println("Högstadiet");
        }
    }
}
