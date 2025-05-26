package Praktikum12;

public class DoubleLinkedList {
    Node22 head, tail;
    Mahasiswa22 terhapus;

    public DoubleLinkedList() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }
    public void addFirst(Mahasiswa22 data) {
        Node22 newNode = new Node22(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    public void addLast(Mahasiswa22 data) {
        Node22 newNode = new Node22(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    public void insertAfter(String keyNim, Mahasiswa22 data) {
        Node22 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + "Tidak ditemukan.");
            return;
        }
        Node22 newNode = new Node22(data);

        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }
    public void print() {
        if (head == null) {
            System.out.println("Linked list kosong!");
        } else {
            Node22 current = head;
            while (current != null) {
                current.data.tampil();
                current = current.next;
            }
        }
    }
    public void removeFirst() {
        terhapus = head.data;
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus. ");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        System.out.println("Data yang terhapus adalah : ");
        terhapus.tampil();
    }
    public void removeLast() {
        terhapus = tail.data;
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        if (head == tail) {
            head = tail = null;
        }
        System.out.println("Data yang terhapus adalah : ");
        terhapus.tampil();
    }
    public Node22 search(String nim) {
        Node22 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
    public void add(int index, Mahasiswa22 data) {
        Node22 newNode = new Node22(data);
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node22 current = head;
        int count = 0;
        while (current != null && count < index - 1) {
            current = current.next;
            count++;
        }
        if (current == null) {
            throw new IndexOutOfBoundsException("Indeks di luar batas");
        }
        newNode.next = current.next;
        if (current.next != null) {
            current.next.prev = newNode;
        }
        current.next = newNode;
        newNode.prev = current;
        if (newNode.next == null) {
            tail = newNode;
        }
    }
    public void removeAfter(String keyNim) {
        Node22 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            System.out.println("Node setelah NIM " + keyNim + " tidak ditemukan.");
            return;
        }
        Node22 toRemove = current.next;
        current.next = toRemove.next;
        if (toRemove.next != null) {
            toRemove.next.prev = current;
        } else {
            tail = current;
        }
        System.out.println("Node setelah NIM " + keyNim + " berhasil dihapus.");
    }
    public void remove(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Indeks di luar batas");
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        Node22 current = head;
        int count = 0;
        while (current != null && count < index) {
            current = current.next;
            count++;
        }
        if (current == null) {
            throw new IndexOutOfBoundsException("Indeks di luar batas");
        }
        if (current.next != null) {
            current.next.prev = current.prev;
        } else {
            tail = current.prev;
        }
        if (current.prev != null) {
            current.prev.next = current.next;
        }
        System.out.println("Node pada indeks " + index + " berhasil dihapus.");
    }
    public Mahasiswa22 getFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("Linked list kosong!");
        }
        return head.data;
    }

    public Mahasiswa22 getLast() {
        if (isEmpty()) {
            throw new IllegalStateException("Linked list kosong!");
        }
        return tail.data;
    }

    public Mahasiswa22 getIndex(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Indeks di luar batas");
        }
        Node22 current = head;
        int count = 0;
        while (current != null && count < index) {
            current = current.next;
            count++;
        }
        if (current == null) {
            throw new IndexOutOfBoundsException("Indeks di luar batas");
        }
        return current.data;
    }
    public int getSize() {
        int size = 0;
        Node22 current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }
}