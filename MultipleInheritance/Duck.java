package MultipleInheritance;

public class Duck implements Flyable, Swimmable {
    public void terbang() {
        System.out.println("Bebek bisa terbang jarak dekat!");
    }

    public void berenang() {
        System.out.println("Bebek berenang di danau!");
    }
}