package PraktikumALS.Praktikum1dan2;

public class Mahasiswamain22 {
        public static void main(String[] args) {

        Mahasiswa22 mhs1 = new Mahasiswa22();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "230923443";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa22 mhs2 = new Mahasiswa22("Annisa Nabila","2141720160", 3.25,"TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        @SuppressWarnings("unused")
        Mahasiswa22 UbaidillahUlilAbsorAbdala = new Mahasiswa22(
            "Ubaidillah Ulil Absor Abdala", "244107060158",
            "SIB 1D", 3.00 
            );
    }
}
