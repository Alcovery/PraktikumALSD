package PraktikumALS.Praktikum3;

import java.util.Scanner;

public class DemoDosen {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang array: ");
        int jumlah = sc.nextInt();
        Dosen22[] arrayOfDosen = new Dosen22[jumlah];

        Dosen22.tambahData(arrayOfDosen);
        Dosen22.tampilkanData(arrayOfDosen);
        Dosen22.hitungJumlahPerJenisKelamin(arrayOfDosen);
        Dosen22.hitungRataRataUsiaPerJenisKelamin(arrayOfDosen);
        Dosen22.infoDosenPalingTua(arrayOfDosen);
        Dosen22.infoDosenPalingMuda(arrayOfDosen);

        sc.close();
    }
}

