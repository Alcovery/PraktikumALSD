package Praktikum11;

import java.util.Scanner;

public class SLLMain22 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        SingleLinkedList sll = new SingleLinkedList();
        Mahasiswa22[] mhsArr = new Mahasiswa22[4];
       for (int i = 0; i < args.length; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("Nama     : ");
            String nama = sc.nextLine();
            System.out.println("Nama     : ");
            String nim = sc.nextLine();
            System.out.println("Nama     : ");
            String kelas = sc.nextLine();
            System.out.println("IPK      : ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            mhsArr[i] = new Mahasiswa22(nama, nim, kelas, ipk);

            System.out.println("data index 1: ");
            sll.getData(1);

            System.out.println("data mahasiswa an Bimon berada pada index : "+ sll.indexOf("Bimon"));
            System.out.println();

            sll.removeFirst();
            sll.removeLast();
            sll.print();
            sll.removeAt(0);
            sll.print();
       }
    }
}