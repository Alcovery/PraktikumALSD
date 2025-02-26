package PraktikumALS.Praktikum3;

import java.util.Scanner;

public class Dosen22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dummy;

        Mahasiswa[] arrayOfMahasiswa22 = new Mahasiswa[3];

        for (int i = 0; i < arrayOfMahasiswa22.length; i++) {
            arrayOfMahasiswa22[i] = new Mahasiswa();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.println("NIM     : ");
            arrayOfMahasiswa22[i].nim = sc.nextLine();
            System.out.println("Nama    : ");
            arrayOfMahasiswa22[i].nama = sc.nextLine();
            System.out.println("Kelas   : ");
            arrayOfMahasiswa22[i].kelas = sc.nextLine();
            System.out.println("IPK     : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa22[i].ipk = Float.parseFloat(dummy);
            System.out.println("---------------------------");

        }

        }
    }

