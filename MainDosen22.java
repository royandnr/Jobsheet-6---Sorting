import java.util.Scanner;

public class MainDosen22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen22 list = new DataDosen22 ();
        int pilih;

        do {
            System.out.println("\n===== MENU DATA DOSEN =====");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Sorting ASC (Termuda → Tertua)");
            System.out.println("4. Sorting DSC (Tertua → Termuda)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Kode  : ");
                    String kd = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (L/P): ");
                    char jk = sc.next().charAt(0);
                    boolean jenisKelamin = (jk == 'L' || jk == 'l');
                    System.out.print("Usia  : ");
                    int usia = sc.nextInt();

                    Dosen22 d = new Dosen22(kd, nama, jenisKelamin, usia);
                    list.tambah(d);
                    break;

                case 2:
                    list.tampil();
                    break;

                case 3:
                    list.sortingASC();
                    list.tampil();
                    break;

                case 4:
                    list.sortingDSC();
                    list.tampil();
                    break;

                case 5:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 5);
    }
}