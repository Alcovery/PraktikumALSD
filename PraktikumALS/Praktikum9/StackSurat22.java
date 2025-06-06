package Praktikum9;

public class StackSurat22 {
    Surat22[] stack;
    int top;

    public StackSurat22 (int kapasitas) {
        stack = new Surat22[kapasitas];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stack.length -1;
    }

    public void push (Surat22 surat){
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack surat penuh");
        }
    }

    public Surat22 pop () {
        if (!isEmpty()) {
            Surat22 temp = stack[top];
            top--;
            return temp;
        } else {
            System.out.println("Tidak ada surat yang bisa diproses");
            return null;
        }
    }

    public Surat22 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Tidak ada surat diatas");
            return null;
        }
    }

    public boolean cariSurat (String namaMahasiswa) {
        for (int i = 0; i < top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) {
                return true;
            }
        }
        return false;
    }
    public int jumlahSurat() {
        return top + 1;
    }
}