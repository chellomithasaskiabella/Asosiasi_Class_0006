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
