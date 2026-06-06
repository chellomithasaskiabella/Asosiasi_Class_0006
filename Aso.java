import java.util.ArrayList;

abstract class Orang {
    private String nama;
    
    public Orang (String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public abstract void tampilkanPeran();
}

class Matakuliah {
    private String kode;
    private String nama;
    private int sks;

    public Matakuliah (String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    public String getInfo() {
        return kode + "-" + nama + "(" + sks + "SKS)";
    }
}

class Dosen extends Orang {
    private String nidn;
    private ArrayList<Matakuliah> mataKuliahDiajar;

    public Dosen (String nama, String nidn) {
        super(nama);
        this.nidn = nidn;
        this.mataKuliahDiajar = new ArrayList<>();
    }

}