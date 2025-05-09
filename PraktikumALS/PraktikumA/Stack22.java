package PraktikumA;

public class Stack22 {
    int size, top;
    Buku22 data[];

    public Stack22(int size) {
        this.size = size;
        data = new Buku22[size];
        top = -1;
    }
    public boolean IsEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
    public boolean IsFull() {
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }
    public void push(Buku22 bk) {
        if (!IsFull()) {
            top ++;
            data[top] = bk;
        } else {
            System.out.println("Isi stack penuh");
        }
    }
    public void pop() {
        if (!IsEmpty()) {
            Buku22 x =data[top];
            top--;
            System.out.println("Data yang keluar: " + x.judul + " " + x.pengarang
            + "" + x.jumlahHalaman + " " + x.tahunTerbit + "" + x.tahunTerbit + "" + x.harga );
        } else {
            System.out.println("Stack Masih Kosong");
        }
    }
    public void peek () {
        System.out.println("Elemen Teratas: " + data[top].judul + "" + 
        data[top].pengarang + "" + data[top].jumlahHalaman+ "" +
        data[top].tahunTerbit + "" + data[top].harga);
    }
    public void print () {
        System.out.println("Isi stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i].judul + " " + data[i].pengarang + " " + data[i].jumlahHalaman + data[i].tahunTerbit
            + " " + data[i].harga + "");
        }
        System.out.println("");
    }
    public void Clear() {
        if (IsEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("Stack masih kosong");
        }
    }
    
 }