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

class MataKuliah {
    private String kode;
    private String nama;
    private int sks;

    public MataKuliah (String kode, String nama, int sks) {
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
    private ArrayList<MataKuliah> mataKuliahDiajar;

    public Dosen (String nama, String nidn) {
        super(nama);
        this.nidn = nidn;
        this.mataKuliahDiajar = new ArrayList<>();
    }

    public void tambahMataKuliah (MataKuliah mataKuliah) {
        mataKuliahDiajar.add(mataKuliah);
    }

    @Override
    public void tampilkanPeran() {
        System.out.println(getNama() + "Berperan Sebagai Dosen");
    }

    public void tampilkanMataKuliahDiajar() {
        System.out.println("Dosen :" + getNama());
        System.out.println("NIDN :" + nidn);
        System.out.println("Mata Kuliah Yang Diajar :");

        for (MataKuliah mk : mataKuliahDiajar) {
            System.out.println("-" + mk.getInfo());
        }
    }
}

class Mahasiswa extends Orang {
    private String nim;
    private ArrayList<MataKuliah> mataKuliahDiambil;

    public Mahasiswa (String nama, String nim) {
        super(nama);
        this.nim = nim;
        this.mataKuliahDiambil = new ArrayList<>();
    }

    public void ambilMataKuliah (MataKuliah mataKuliah) {
        mataKuliahDiambil.add(mataKuliah);
    }

    @Override
    public void tampilkanPeran() {
        System.out.println(getNama() + "Berperan Sebagai Mahasiswa.");
    }

    public void tampilkanKrs() {
        System.out.println("Mahasiswa : " + getNama());
        System.out.println("Nim       : " + nim);
        System.out.println("Mata Kuliah Yang Diambil :");

        for (MataKuliah mk : mataKuliahDiambil) {
            System.out.println("-" + mk.getInfo());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MataKuliah pbo = new MataKuliah("IF 204", "Pemrograman Berorientasi Objek", 3);
        MataKuliah web = new MataKuliah("IF 305", "Pemrograman Web", 3);
        MataKuliah struktukData = new MataKuliah("IF 201", "Struktur Data", 3)
    }
}