public class Mahasiswa {
    // Atribut dibuat private agar tidak bisa diakses langsung
    private String nama;
    private int umur;

    // Constructor
    public Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Setter (untuk mengubah data)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        // validasi: umur tidak boleh negatif
        if (umur > 0) {
            this.umur = umur;
        } else {
            System.out.println("Umur tidak valid!");
        }
    }

    // Getter (untuk mengambil data)
    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }
}
