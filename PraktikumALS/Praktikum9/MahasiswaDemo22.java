package Praktikum9;

import java.util.Scanner;

public class MahasiswaDemo22 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int pilih = sc.nextInt();

        StackTugasMahasiswa22 stack = new StackTugasMahasiswa22(5);

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Lihat jumlah tugas");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.println("Nama: ");
                    String nama = sc.nextLine();
                    System.out.println("NIM: ");
                    String nim = sc.nextLine();
                    System.out.println("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa22 mhs = new Mahasiswa22(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa22 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = sc.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai Biner Tugas: "+ biner);
                    }
                    break;
                case 3:
                Mahasiswa22 lihat = stack.peek();
                if (lihat != null) {
                    System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                }
                break;
                case 4:
                System.out.println("Daftar semua tugas");
                System.out.println("nama\tNIM\tKelas");
                stack.print();
                break;
                case 5:
                System.out.println("Jumlah tugas: " + stack.jumlahTugas());
                break;            
            default:
                System.out.println("Pilihan tidak valid. ");
            }
        } while (pilih >= 1 && pilih <= 4); 
    }
    }