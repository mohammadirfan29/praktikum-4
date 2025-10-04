public class MainEncapsulation {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Irfan", 20);

        // akses data lewat getter
        System.out.println("Nama: " + mhs.getNama());
        System.out.println("Umur: " + mhs.getUmur());

        // ubah data lewat setter
        mhs.setNama("Budi");
        mhs.setUmur(-5); // tidak valid
        mhs.setUmur(21);

        System.out.println("Nama baru: " + mhs.getNama());
        System.out.println("Umur baru: " + mhs.getUmur());
    }
}
