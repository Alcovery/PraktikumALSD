package Praktikum11.Tugas;

import java.util.Scanner;

public class MainQueueUkm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLinkedList queue = new QueueLinkedList(10);

        int pilih;
        do {
            System.out.println("\nMenu: ");
            System.out.println("1.");
            System.out.println("2.");
            System.out.println("3.");
            System.out.println("4.");
            System.out.println("5.");
            System.out.println("6.");
            System.out.println("7.");
            System.out.println("0.");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();
        } while (pilih != 0);
    }
}
