package Praktikum3;

public class Mahasiswa {
        public String nim, nama, kelas;
        public float ipk;

        public static void main(String[] args) {

            Mahasiswa22[] arrayOfMahasiswa = new Mahasiswa22[3];
            arrayOfMahasiswa[0] = new Mahasiswa22();
            arrayOfMahasiswa[0].nim = "244107060158";
            arrayOfMahasiswa[0].nama = "Ubaidillah Ulil Absor Abdala";
            arrayOfMahasiswa[0].kelas = "SIB-1D";
            arrayOfMahasiswa[0].ipk = (float) 3.75;
    
            arrayOfMahasiswa[1] = new Mahasiswa22();
            arrayOfMahasiswa[1].nim = "23124214598";
            arrayOfMahasiswa[1].nama = "Rifqi Hilmi Mubarok";
            arrayOfMahasiswa[1].kelas = "TI-1A";
            arrayOfMahasiswa[1].ipk = (float) 3.90;
    
            arrayOfMahasiswa[2] = new Mahasiswa22();
            arrayOfMahasiswa[2].nim = "24412423464";
            arrayOfMahasiswa[2].nama = "Muhammad Farras Awaludin";
            arrayOfMahasiswa[2].kelas = "SIB-1E";
            arrayOfMahasiswa[2].ipk = (float) 3.98; 
    
            System.out.println("NIM       : "+ arrayOfMahasiswa[0].nim);
            System.out.println("Nama      : "+ arrayOfMahasiswa[0].nama);
            System.out.println("Kelas     : "+ arrayOfMahasiswa[0].kelas);
            System.out.println("IPK       : "+ arrayOfMahasiswa[0].ipk);
            System.out.println("-------------------------------------");
            System.out.println("NIM       : "+ arrayOfMahasiswa[1].nim);
            System.out.println("Nama      : "+ arrayOfMahasiswa[1].nama);
            System.out.println("Kelas     : "+ arrayOfMahasiswa[1].kelas);
            System.out.println("IPK       : "+ arrayOfMahasiswa[1].ipk);
            System.out.println("-------------------------------------");
            System.out.println("NIM       : "+ arrayOfMahasiswa[2].nim);
            System.out.println("Nama      : "+ arrayOfMahasiswa[2].nama);
            System.out.println("Kelas     : "+ arrayOfMahasiswa[2].kelas);
            System.out.println("IPK       : "+ arrayOfMahasiswa[2].ipk);
            System.out.println("-------------------------------------");
        }
    }