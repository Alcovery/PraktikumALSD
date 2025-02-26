package PraktikumALS;

public class MataKuliahMain22 {
        public static void main(String[] args) {
            MataKuliah22 ASD = new MataKuliah22(
                "ASD", "Algoritma Struktur Data",
                2, 4
            );
            ASD.tampilkanInformasi();
            ASD.ubahSks(3);
            ASD.tambahJam(4);
            ASD.kurangiJam(8);
            ASD.tampilkanInformasi();
    
            MataKuliah22 PASD = new MataKuliah22();
            PASD.tampilkanInformasi();
            PASD.ubahSks(2);
            PASD.tambahJam(6);
            PASD.kurangiJam(8);
            PASD.tampilkanInformasi();
    
            MataKuliah22 SOP = new MataKuliah22(
                "SOP", "SISTEM OPERASI",
                2, 4
            );
            SOP.tampilkanInformasi();
        }
    }