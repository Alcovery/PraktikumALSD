package Praktikum1dan2;

public class DosenMain22 {
    public static void main(String[] args) {
        Dosen22 ubay = new Dosen22();
        ubay.tampilInformasi();
        ubay.ubahKeahlian("Algoritma Struktur Data");
        ubay.tampilInformasi();

        Dosen22 ubaidillah = new Dosen22(
            "1", "ubddd", false,
            2024, "Algoritma"
        );
        ubaidillah.tampilInformasi();
        ubaidillah.setStatusAktif(true);
        System.out.println("Masa Kerja: " + ubaidillah.hitungMasaKerja(2025));
        ubaidillah.ubahKeahlian("AlgoritmaStrukturData");

        Dosen22 ubdddd = new Dosen22(
            "2", "Salih", false,
            2023, "ASD"
        );
        System.out.println("Masa kerja: " + ubdddd.hitungMasaKerja(2025));
        ubay.tampilInformasi();
    }
}