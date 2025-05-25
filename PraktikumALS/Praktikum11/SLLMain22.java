package Praktikum11;

public class SLLMain22 {
    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        Mahasiswa22 mhs1 = new Mahasiswa22("Meka", "234", "SIB 1D", 4.0);
        Mahasiswa22 mhs2 = new Mahasiswa22("Yoga", "235", "SIB 1D", 4.0);
        Mahasiswa22 mhs3 = new Mahasiswa22("Razif", "236", "SIB 1D", 4.0);
        Mahasiswa22 mhs4 = new Mahasiswa22("Zaki", "237", "SIB 1D", 4.0);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs3);
        sll.print();
        sll.insertAfter("Zaki", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
    }
}
