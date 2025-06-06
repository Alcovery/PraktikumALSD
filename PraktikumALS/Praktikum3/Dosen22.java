package Praktikum3;

import java.util.Scanner;

public class Dosen22 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    public Dosen22() {}
    public Dosen22(
        String _kode, String _nama,
        boolean _jenisKelamin, int _usia
    ) {
        kode = _kode;
        nama = _nama;
        jenisKelamin = _jenisKelamin;
        usia = _usia;
    }

    public static void tambahData(Dosen22[] arrayOfDosen) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arrayOfDosen.length; i++) {
            arrayOfDosen[i] = new Dosen22();
            System.out.println("Data dosen ke-" + (i+1));
            System.out.print("Kode dosen: ");
            arrayOfDosen[i].kode = sc.nextLine();
            System.out.print("Nama dosen: ");
            arrayOfDosen[i].nama = sc.nextLine();
            System.out.print("Pria? (true/false) ");
            arrayOfDosen[i].jenisKelamin = sc.nextBoolean();
            System.out.print("Usia: ");
            arrayOfDosen[i].usia = sc.nextInt();
            sc.nextLine();
            System.out.println("------------------------------");
        }
        sc.close();
    }

    public static void tampilkanData(Dosen22[] arrayOfDosen) {
        System.out.println("\n=== Data Semua Dosen ===");
        for (Dosen22 dosen : arrayOfDosen) {
            System.out.println("-------------------------");
            System.out.println("Kode: " + dosen.kode);
            System.out.println("Nama: " + dosen.nama);
            System.out.println(
                "Jenis Kelamin: " +
                (dosen.jenisKelamin ? "Pria" : "Wanita")
            );
            System.out.println("Usia: " + dosen.usia);
        }
    }

    public static void hitungJumlahPerJenisKelamin(Dosen22[] arrayOfDosen) {
        int jumlahPria = 0;
        int jumlahWanita = 0;
    
        for (Dosen22 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin == true) {
                jumlahPria++;
            } else {
                jumlahWanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria  : " + jumlahPria);
        System.out.println("Jumlah Dosen Wanita: " + jumlahWanita);
    }

    public static void hitungRataRataUsiaPerJenisKelamin(Dosen22[] arrayOfDosen) {
        int usiaPria = 0;
        int usiaWanita = 0;
        int jumlahPria = 0;
        int jumlahWanita = 0;
        double rataUsiaPria;
        double rataUsiaWanita;
        for (Dosen22 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin == true) {
                usiaPria += dosen.usia;
                jumlahPria++;
            } else {
                usiaWanita += dosen.usia;
                jumlahWanita++;
            }
        }

        if (jumlahPria > 0) {
            rataUsiaPria = usiaPria / jumlahPria;
            System.out.println("Rata-rata usia dosen pria  : " + rataUsiaPria);
        }
        
        if (jumlahWanita > 0) {
            rataUsiaWanita = usiaWanita / jumlahWanita;
            System.out.println("Rata-rata usia dosen wanita: " + rataUsiaWanita);
        }
        
        if (jumlahPria == 0 && jumlahWanita == 0) {
            System.out.println("Jumlah tidak valid");
        }
    }

    public static void infoDosenPalingTua(Dosen22[] arrayOfDosen) {
        int usiaTertua = arrayOfDosen[0].usia;
        String namaTertua = arrayOfDosen[0].nama;
        
        for (Dosen22 dosen : arrayOfDosen) {
            if(dosen.usia > usiaTertua) {
                usiaTertua = dosen.usia;
                namaTertua = dosen.nama;
            }
        }
        System.out.println("Dosen tertua: " + namaTertua);
    }

    public static void infoDosenPalingMuda(Dosen22[] arrayOfDosen) {
        int usiaTermuda = arrayOfDosen[0].usia;
        String namaTermuda = arrayOfDosen[0].nama;
        
        for (Dosen22 dosen : arrayOfDosen) {
            if(dosen.usia < usiaTermuda) {
                usiaTermuda = dosen.usia;
                namaTermuda = dosen.nama;
            }
        }
        System.out.println("Dosen termuda: " + namaTermuda);
    }
}
        