package HybridInheritance;

// Class induk (superclass)
public class Pegawai {
    protected String nama;
    protected String nip;

    public Pegawai(String nama, String nip) {
        this.nama = nama;
        this.nip = nip;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Pegawai: " + nama);
        System.out.println("NIP: " + nip);
    }
}
