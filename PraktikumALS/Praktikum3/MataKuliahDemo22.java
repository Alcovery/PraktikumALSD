package PraktikumALS.Praktikum3;

import java.util.Scanner;

public class MataKuliahDemo22 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Masukkan Jumlah matkul: ");
      int jumlahMatkul = sc.nextInt();
      MataKuliah22[] arrayMataKuliah = new MataKuliah22[jumlahMatkul];
      MataKuliah22.tambahData(arrayMataKuliah);
      MataKuliah22.cetakInfo(arrayMataKuliah);

      sc.close();
        }
}