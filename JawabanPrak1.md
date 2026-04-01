1. Jika elemen sebelah kiri (data[j-1]) lebih besar dari elemen sebelah kanan (data[j]), maka keduanya ditukar posisinya. Proses ini dilakukan berulang-ulang sehingga elemen yang lebih besar "menggelembung" (bubble) ke arah kanan, dan data akhirnya terurut secara ascending (kecil ke besar).

2. int min = i;
for (int j = i+1; j < jumData; j++) {
    if (data[j] < data[min]) {
        min = j;
    }
}
Variabel min menyimpan indeks elemen terkecil yang ditemukan dari posisi i hingga akhir array.

3. j >= 0 → agar indeks tidak keluar batas array (tidak negatif)
data[j] > temp → selama elemen sebelumnya lebih besar dari nilai yang ingin disisipkan, geser elemen tersebut ke kanan

4. Menggeser elemen data[j] satu posisi ke kanan untuk memberi ruang kosong bagi nilai temp (nilai yang sedang dicari posisinya). Setelah perulangan while selesai, temp disisipkan ke posisi data[j+1] yang sudah kosong.
