package Praktikum6;

public class DataDosen22 {
    Dosen22[] listDosen = new Dosen22[10];
    int idx;

    void tambah(Dosen22 dosen) {
        if (idx < listDosen.length) {
            listDosen[idx] = dosen;
            idx++;
        } else {
            System.out.println("Data dosen sudah penuh");
        }
    }

    void tampil() {
        for (Dosen22 dosen22 : listDosen) {
            dosen22.tampil();
            System.out.println("-------------");
        }
    }

    void sortingAsc() { // bubble sort ascending
        for (int i = 0; i < listDosen.length - 1; i++) {
            for (int j = 1; j < listDosen.length - i; j++) {
                if (listDosen[j].usia < listDosen[j - 1].usia) {
                    Dosen22 temp = listDosen[j];
                    listDosen[j] = listDosen[j - 1];
                    listDosen[j - 1] = temp;
                }
            }
        }
    }

    void sortingDsc() { // insertion sort descending
        for (int i = 0; i < listDosen.length; i++) {
            Dosen22 temp = listDosen[i];
            int j = i;
            while (j > 0 && listDosen[j - 1].usia < temp.usia) {
                listDosen[j] = listDosen[j - 1];
                j--;
            }
            listDosen[j] = temp;
        }
    }
}