package HierarchicalInheritance;

public class MainHierarchical {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        Motor motor = new Motor();

        mobil.berjalan();
        mobil.klakson();

        motor.berjalan();
        motor.ngebut();
    }
}