package minggu7;

public class PencarianMhs {
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;

    void tambah(Mahasiswa m) {
        if(idx < listMhs.length) {
            listMhs[idx] = m;
            idx ++;
        } else {
            System.out.println("Data sudah penuh !!");
        }
    }

    void tampil() {
        for(Mahasiswa m : listMhs){
            m.tampil();
            System.out.println("---------------------------");
        }
    }

    // public int FindSeqSearch (int cari) {
    //     int posisi = -1;
    //     for (int j = 0; j < listMhs.length; j++) {
    //         if(listMhs[j].nim==cari) {
    //             posisi = j;
    //             break;
    //         }
    //     }
    //     return posisi;
    // }

    public void sortMhsByName() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (listMhs[j].nama.compareTo(listMhs[j + 1].nama) > 0) {
                    Mahasiswa temp = listMhs[j];
                    listMhs[j] = listMhs[j + 1];
                    listMhs[j + 1] = temp;
                }
            }
        }
    }

    // settingan kode program jawab latihan praktikum point B
    public int FindBinarySearch(String cari, int left, int right){
        if ( right >= left){
            int mid = left + (right - left) / 2;
            int Hasil = cari.compareTo(listMhs[mid].nama);
            if (Hasil == 0) {
                return mid;
            } else if (Hasil < 0) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
    
        System.out.println("Pencarian tidak menemukan hasil.");
        return -1;
    }
    
    // settingan kode program jawab latihan praktikum point A
    // public int FindBinarySearch(String cari, int left, int right){
    //     if ( right >= left){
    //         int mid = left + (right - left) / 2;
    //         int Hasil = cari.compareTo(listMhs[mid].nama);
    //         if (Hasil == 0) {
    //             return mid;
    //         } else if (Hasil < 0) {
    //             return FindBinarySearch(cari, left, mid - 1);
    //         } else {
    //             return FindBinarySearch(cari, mid + 1, right);
    //         }
    //     }
    //     return -1;
    // }

    //settingan awal 
    // public int FindBinarySearch(int cari, int left, int right){
    //     int mid;
    //     if ( right >= left){
    //         mid = (left + right) / 2;
    //         if (cari == listMhs[mid].nim) {
    //             return (mid);
    //         } else if (listMhs[mid].nim > cari) {
    //             return FindBinarySearch(cari, left, mid - 1);
    //         } else {
    //             return FindBinarySearch(cari, mid + 1, right);
    //         }
    //     }
    //     return -1;
    // }


    public void Tampilposisi(String nama, int pos){
        if (pos!= -1) {
            System.out.println("Data dengan nama " + nama + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data dengan nama " + nama + " tidak ditemukan");
        }
    }

    // public void Tampilposisi(int x,int pos){
    //     if (pos!= -1) {
    //         System.out.println("data : " + x + "ditemukan ppada indeks " + pos);
    //     } else {
    //         System.out.println("data " + x + "tidak ditemukan");
    //     }
    // }

    public void TampilData(String nama, int pos){
        if (pos!= -1) {
            System.out.println("NIM\t : " + listMhs[pos].nim);
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("Umur\t : " + listMhs[pos].umur);
            System.out.println("IPK\t : " + listMhs[pos].ipk);
        } else {
            System.out.println("Data dengan nama " + nama + " tidak ditemukan");
        }
    }

    // kode program tambahan untuk jawaban latihan praktikum point B
    public void TampilDataGanda(String nama, int pos){
        if (pos != -1) {
            System.out.println("\n---------------------------------------------------------------------");
            System.out.println("Pencarian menemukan lebih dari satu hasil untuk nama " + nama + ".");
            System.out.println("Silakan periksa kembali kriteria pencarian Anda.");
            System.out.println("___________________________________________________________________");
        } else {
            System.out.println("Data dengan nama " + nama + " tidak ditemukan");
        }
    }

    // public void TampilData(int x, int pos){
    //     if (pos!= -1) {
    //         System.out.println("Nim\t : " + x);
    //         System.out.println("Nama\t : "+listMhs[pos].nama);
    //         System.out.println("Umur\t : "+listMhs[pos].umur);
    //         System.out.println("IPK\t : "+listMhs[pos].ipk);
    //     } else {
    //         System.out.println("data " + x + "tidak ditemukan");
    //     }
    // }
}
