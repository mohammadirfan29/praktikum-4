package SingleInheritance;

public class MainSingle {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makan();         // diwarisi dari Animal
        dog.menggonggong();  // method milik Dog
    }
}