package Praktikum10;

import java.util.Scanner;

public class LayananAkademikSIAKAD {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        AntrianLayanan antrian = new AntrianLayanan(5);
        int pilihan;
    
    do {
        System.out.println("\n=== Menua Antrian Layanan Akademik ===");
        System.out.println("1.Tambah Mahasiswa ke Antrian");
        System.out.println("2. Layani Mahasiswa");
        System.out.println("3. Lihat Mahasiswa Terdepan");
        System.out.println("4. Lihat Semua Antrian");
        System.out.println("5. Jumlah Mahasiswa dalam Antrian");
        System.out.println("6. Cek Antrian Mahasiswa Terakhir");
        System.out.println("0. Keluar");
        System.out.println("Pilih menu: ");
        pilihan = sc.nextInt(); sc.nextLine();

        switch (pilihan) {
            case 1:
                System.out.println("NIM    : ");
                String nim = sc.nextLine();
                System.out.println("Nama   : ");
                String nama = sc.nextLine();
                System.out.println("Prodi  : ");
                String prodi = sc.nextLine();
                System.out.println("Kelas  : ");
                String kelas = sc.nextLine();
                Mahasiswa22 mhs = new Mahasiswa22(nim, nama, prodi, kelas);
                antrian.tambahAntrian(mhs);
                break;
            case 2:
                Mahasiswa22 dilayani = antrian.layaniMahasiswa22();
                if (dilayani != null) {
                    System.out.println("Melayani mahasiswa: ");
                    dilayani.tampilkanData();
                }
                break;
                case 3:
                antrian.lihatTerdepan();
                break;
                case 4: 
                antrian.tampilkanSemua();
                break;
                case 5:
                System.out.println("Jumlah dalam antrian: " + antrian.getJumlahAntrian());
                break;
                case 6:
                antrian.lihatAkhir();
                break;
                case 0:
                System.out.println("Terima kasih.");
                break;
            default:
                System.out.println("pilihan tidak valid.");
        }

    } while (pilihan != 0);
}
}
