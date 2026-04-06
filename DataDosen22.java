public class DataDosen22 {
    Dosen22[] dataDosen = new Dosen22[10];
    int idx = 0;

    // tambah data
    void tambah(Dosen22 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data penuh!");
        }
    }

    // tampil data
    void tampil() {
        if (idx == 0) {
            System.out.println("Data masih kosong!");
        } else {
            for (int i = 0; i < idx; i++) {
                dataDosen[i].tampil();
            }
        }
    }

    // 🔵 SORTING ASC (Bubble Sort)
    // dari usia termuda → tertua
    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen22 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorting ASC (Bubble Sort) berhasil!");
    }

    // 🔴 SORTING DSC (Selection Sort)
    // dari usia tertua → termuda
    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int max = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[max].usia) {
                    max = j;
                }
            }
            Dosen22 temp = dataDosen[max];
            dataDosen[max] = dataDosen[i];
            dataDosen[i] = temp;
        }
        System.out.println("Sorting DSC (Selection Sort) berhasil!");
    }
}