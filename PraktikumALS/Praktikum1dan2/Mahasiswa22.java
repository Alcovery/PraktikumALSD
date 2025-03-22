package PraktikumALS.Praktikum1dan2;

public class Mahasiswa22 {
        String nama;
        String nim;
        String kelas;
        double ipk;

        public Mahasiswa22() {
        }

        public Mahasiswa22(String nm, String nim, double ipk, String kls) {
            nama = nm;
            this.nim = nim;
            this.ipk = ipk;
            kelas = kls;
        }

        public Mahasiswa22(String string, String string2, String string3, double d) {
        }

        void tampilkanInformasi() {
            System.out.println("Nama: " + nama);
            System.out.println("NIM: " + nim);
            System.out.println("IPK: " + ipk);
            System.out.println("Kelas: " + kelas);
        }

        void ubahKelas(String kelasBaru) {
            kelas = kelasBaru;
        }

        void updateIpk(double ipkBaru) {
            ipk = ipkBaru;
        }

        String nilaiKinerja() {
            if (ipk >= 4.0 || ipk <=0) {
                return "Nilai ipk tidak valid";
            } else if (ipk >= 3.5) {
                return "Kinerja sangat baik";
            } else if (ipk >= 3.0) {
                return "Kinerja baik";
            } else if (ipk >= 2.0) {
                return "Kinerja cukup";
            } else {
                return "Kinerja kurang";
            }
        }
}