package MultilevelInheritance;

public class MainMultiLevel {
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        kucing.bernafas(); // dari Hewan
        kucing.menyusui(); // dari Mamalia
        kucing.mengeong(); // dari Kucing
    }
}