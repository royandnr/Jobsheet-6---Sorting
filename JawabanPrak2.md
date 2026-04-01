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

Setelah perulangan selesai, idxMin menyimpan posisi mahasiswa dengan IPK terkecil di antara elemen yang belum terurut. Indeks ini kemudian digunakan untuk menukar listMhs[i] dengan listMhs[idxMin], sehingga mahasiswa ber-IPK terkecil berpindah ke posisi terdepan — dan data secara bertahap menjadi terurut ascending berdasarkan IPK.

void insertionSort(){
    for (int i=1; i<=data.length-1; i++){
        int temp = data[i];
        int j = i-1;
        while (j>=0 && data[j] < temp){  // ganti < agar descending
            data[j+1] = data[j];
            j--;
        }
        data[j+1] = temp;
    }
} 
Perubahan hanya pada satu kondisi di while, yaitu ganti > menjadi <:


