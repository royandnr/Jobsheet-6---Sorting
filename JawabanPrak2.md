1. 
a. Karena Bubble Sort hanya butuh n-1 putaran. Setelah n-1 putaran, elemen terakhir sudah otomatis berada di posisi yang benar tanpa perlu dibandingkan lagi. Jika sampai i < length, putaran terakhir tidak akan melakukan pertukaran apapun — sia-sia.

b. Karena setiap selesai 1 putaran (i), elemen paling akhir sudah pasti berada di posisi finalnya dan tidak perlu dibandingkan lagi. Dengan mengurangi i, perulangan j semakin pendek setiap tahapnya sehingga lebih efisien.

c. Perulangan i berlangsung = 49 kali
Jumlah Tahap Bubble Sort = 49 Tahap
Rumus: n - 1 = 50 - 1 = 49

2. import java.util.Scanner;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi mb = new MahasiswaBerprestasi();

        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            System.out.print("NIM   : "); String nim   = sc.nextLine();
            System.out.print("Nama  : "); String nama  = sc.nextLine();
            System.out.print("Kelas : "); String kelas = sc.nextLine();
            System.out.print("IPK   : "); double ipk   = sc.nextDouble();
            sc.nextLine(); // buang newline

            mb.tambah(new Mahasiswa(nim, nama, kelas, ipk));
        }

        System.out.println("Data sebelum diurutkan:");
        mb.tampil();

        mb.bubbleSort();

        System.out.println("Data setelah Bubble Sort:");
        mb.tampil();

        sc.close();
    }
}



