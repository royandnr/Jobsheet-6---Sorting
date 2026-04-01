public class SortingMain22 {
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};
        int b[] = {30, 20, 2, 8, 14};

        Sorting22 dataurut1 = new Sorting22 (a, a.length);
        Sorting22 dataurut2 = new Sorting22 (b, b.length);
        Sorting22 dataurut3 = new Sorting22 (a, a.length);

        System.out.println("Data awal 1");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan Bubble Sort (ASC)");
        dataurut1.tampil();

        System.out.println("Data awal 2");
        dataurut2.tampil();
        dataurut2.selectionSort();
        System.out.println("Data sudah diurutkan dengan Selection Sort (ASC)");
        dataurut2.tampil();

        System.out.println("Data awal 3");
        dataurut3.tampil();
        dataurut3.insertionSort();
        System.out.println("Data sudah diurutkan dengan Insertion Sort (ASC)");
        dataurut3.tampil();

    }
}
