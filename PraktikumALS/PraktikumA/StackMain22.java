package PraktikumA;

import java.util.Scanner;
public class StackMain22 {
    public static void main(String[] args) {
        
    Stack22 stk = new Stack22(5);
    Scanner sc = new Scanner(System.in);

    char pilih;
    do {
        System.out.println("Judul: ");
        String judul = sc.nextLine();
        System.out.println("Pengarang: ");
        String pengarang = sc.nextLine();
        System.out.println("Jumlah Halaman: ");
        int jumlahHalaman = sc.nextInt();
        System.out.println("Tahun Terbit: ");
        int tahunTerbit = sc.nextInt();
        System.out.println("Harga");
        double Harga = sc.nextDouble();

        Buku22 b = new Buku22(judul, pengarang, tahunTerbit, jumlahHalaman, Harga);
        System.out.println("Apakah anda ingin menambahkan data baru ke stack (y/n)? ");
        pilih = sc.next().charAt(0);
        sc.nextLine();
        stk.push(b);
    } while (pilih == 'y');

    stk.print();
    stk.pop();
    stk.peek();
    stk.print();
}

}
