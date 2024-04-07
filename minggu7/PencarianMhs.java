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

    public int FindSeqSearch (int cari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if(listMhs[j].nim==cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void Tampilposisi(int x,int pos){
        if (pos!= -1) {
            System.out.println("data : " + x + "ditemukan ppada indeks " + pos);
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }

    public void TampilData(int x, int pos){
        if (pos!= -1) {
            System.out.println("Nim\t : " + x);
            System.out.println("Nama\t : "+listMhs[pos].nama);
            System.out.println("Umur\t : "+listMhs[pos].umur);
            System.out.println("IPK\t : "+listMhs[pos].ipk);
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }
}
