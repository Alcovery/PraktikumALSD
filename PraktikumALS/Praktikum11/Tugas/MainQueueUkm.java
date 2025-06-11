package Praktikum11.Tugas;

import java.util.Scanner;

public class MainQueueUkm {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        QueueLinkedList queue = new QueueLinkedList(10);

        int pilih;
        do {
            System.out.println("\nMenu: ");
            System.out.println("1. Daftar Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Mahasiswa Pertama");
            System.out.println("4. Lihat Mahasiswa Terakhir");
            System.out.println("5. Tampilkan Semua Antrian");
            System.out.println("6. Tampilkan Jumlah Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    if (queue.isFull()) {
                        System.out.println("Antrian Penuh!");
                        break;
                    }
                    System.out.println("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Angkatan: ");
                    int angkatan = sc.nextInt();
                    sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, angkatan);
                    queue.enqueue(mhs);
                    break;
                case 2:
                queue.dequeue();
                break;
                case 3:
                if (queue.isEmpty()) {
                    System.out.println("Antrian kosong");
                } else {
                    Mahasiswa pertama = queue.getFront();
                    System.out.println("Antrian pertama adalah: ");
                    pertama.tampilData();
                }
                break;
                case 4:
                queue.tampilBelakang();
                case 5:
                if (queue.isEmpty()) {
                    System.out.println("Antrian kosong");
                } else {
                    Mahasiswa terakhir = queue.getRear();
                    System.out.println("Antrian terakhir adalah: ");
                    terakhir.tampilData();
                }
                break;
                case 6:
                queue.jumlahAntrian();
                break;
                case 7:
                queue.clear();
                break;
                case 0:
                System.out.println("Terima kasih");
                break;
                default:
                System.out.println("Pilihan tidak ada");
            }
        } while (pilih != 0);
    }
}
