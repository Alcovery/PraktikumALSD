package Praktikum10;

public class AntrianKrs22 {
    Krs22[] data;
    String nama, prodi, nim, angkatan;
    int front, size, max, rear;

    public AntrianKrs22(int n) {
        max = n;
        data = new Krs22[max];
        front = -1;
        rear = -1;
        size = 0;
    }
    public boolean isFull() {
        return size == max;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public void tambahAntrian(Krs22 krs) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh");
        } 
        rear = (rear + 1) % max;
        data[rear] = krs;
        size++;
        System.out.println("data berhasil ditambahkan");
    }
    public void layaniMahasiswa() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        }
    }
}
