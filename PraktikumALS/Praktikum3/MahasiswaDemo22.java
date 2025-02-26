package PraktikumALS.Praktikum3;

import java.util.Scanner;

public class MahasiswaDemo22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Mahasiswa22[] arrayOfMahasiswa = new Mahasiswa22[3];
        String dummy;

        for (int i = 0; i < arrayOfMahasiswa.length; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa22();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.println("NIM     : ");
            arrayOfMahasiswa[i].nim = sc.nextLine();
            System.out.println("Nama    : ");
            arrayOfMahasiswa[i].nama = sc.nextLine();
            System.out.println("Kelas   : ");
            arrayOfMahasiswa[i].kelas = sc.nextLine();
            System.out.println("IPK     : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("---------------------------");

        }
    }

    public String nama;
    public String nim;
    public String kelas;
    public String ipk;
}