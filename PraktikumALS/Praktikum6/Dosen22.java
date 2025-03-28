package PraktikumALS.Praktikum6;

public class Dosen22 {
    String kode;
    String nama;
    boolean jenisKelamin; // true pria, false wanita
    int usia;

    Dosen22() {}

    Dosen22(String kd, int us) {
        kode = kd;
        usia = us;
    }

    Dosen22 (String kd, String nm, boolean jk, int us) {
        kode = kd;
        nama = nm;
        jenisKelamin = jk;
        usia = us;
    }

    void tampil() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis kelamin: " + (jenisKelamin ? "Pria" : "Wanita" ));
        System.out.println("Usia : " + usia);
    }
}