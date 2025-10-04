package HybridInheritance;

// Dosen mewarisi dari Pegawai dan mengimplementasikan dua interface
public class Dosen extends Pegawai implements Pengajar, Peneliti {

    private String mataKuliah;

    public Dosen(String nama, String nip, String mataKuliah) {
        super(nama, nip);
        this.mataKuliah = mataKuliah;
    }

    @Override
    public void mengajar() {
        System.out.println("Dosen mengajar mata kuliah: " + mataKuliah);
    }

    @Override
    public void meneliti() {
        System.out.println("Dosen sedang melakukan penelitian di bidang " + mataKuliah);
    }

    public void tampilkanPeran() {
        tampilkanInfo();
        mengajar();
        meneliti();
    }
}