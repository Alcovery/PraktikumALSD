package PraktikumALS.Praktikum3;

import java.util.Scanner;

public class MataKuliah22 {
    public String kode;
    public String nama;
    public int sks;
    public int JumlahJam;

    public MataKuliah22() {}

    public MataKuliah22(String kode, String nama, int sks, int JumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.JumlahJam = JumlahJam;    
    }

    public static void tambahData(MataKuliah22[] arrayMataKuliah) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arrayMataKuliah.length; i++) {
            arrayMataKuliah[i] = new MataKuliah22();
            System.out.println("Kode Matkul: ");
            arrayMataKuliah[i] = new MataKuliah22();
            System.out.println("Nama Matkul: ");
            arrayMataKuliah[i] = new MataKuliah22();
            System.out.println("SKS : ");
            arrayMataKuliah[i] = new MataKuliah22();
            System.out.println("Jumlah Jam: ");
            arrayMataKuliah[i].JumlahJam = sc.nextInt();
            sc.nextLine();
        }
    }
    public static void cetakInfo(MataKuliah22[] arrayOfMahasiswa22) {
        for (int i = 0; i < arrayOfMahasiswa22.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i +1));
            System.out.println("NIM      :"+ arrayOfMahasiswa22[i].kode);
            System.out.println("Nama           :"+ arrayOfMahasiswa22[i].nama);
            System.out.println("SKS              :"+ arrayOfMahasiswa22[i].sks);
            System.out.println("Jumlah Jam    :"+ arrayOfMahasiswa22[i].JumlahJam);
            System.out.println("-----------------------");
        }
    }
}
