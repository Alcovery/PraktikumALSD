package Praktikum10;

public class Krs22 {
    String nama;
    String nim;
    String prodi;
    String angkatan;

    public Krs22 (String nama, String nim, String prodi, String angkatan) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.angkatan = angkatan;
    }
    public void tampilkanData() {
        System.out.println(nama + nim + prodi + angkatan);
    }
}
