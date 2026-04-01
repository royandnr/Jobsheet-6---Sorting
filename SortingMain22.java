public class SortingMain22 {
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};

        Sorting22 dataurut1 = new Sorting22 (a, a.length);

        System.out.println("Data awal 1");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan Bubble Sort (ASC)");
        dataurut1.tampil();
    }
}
