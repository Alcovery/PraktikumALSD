package Praktikum6;

public class Sortingmain22 {
    public static void main(String[] args) {
    
    int[] a={20, 10, 2, 7, 12};
    int[] b={30, 20, 2, 8, 14};
    int[] c={40, 10, 9, 3, 4};
    Sorting22 dataurut1 =new Sorting22(a, a.length);

        System.out.println("Data awal 1");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT(ASC)");
        dataurut1.tampil();

        Sorting22 dataUrut2 = new Sorting22(b, b.length); 
        System.out.println("data");
        dataUrut2.tampil();
        dataUrut2.selectionSort();
        System.out.println("data sudah dirutukan dengan selection sort");
        dataUrut2.tampil();

        Sorting22 dataUrut3 = new Sorting22(c, c.length);
        System.out.println("data");
        dataUrut3.tampil();
        dataUrut3.insertionSort();
        System.out.println("data sudah diurutkan dengan insertion sort");
        dataUrut3.tampil();
    }
}