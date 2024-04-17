package minggu7;

import java.util.Scanner;
public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Scanner s1 = new Scanner(System.in);

        PencarianMhs data = new PencarianMhs();
        int jumMhs = 5;

        System.out.println("-------------------------------------");
        System.out.println("Masukkan data nama mahasiswa secara Urut dari Nim Terkecil");
        for(int i = 0; i < jumMhs; i++){
            System.out.println("------------------------");
            System.out.print("Nim\t: ");
            // int nim = s.nextInt();
            String nim = s.nextLine();
            System.out.print("Nama\t : ");
            String nama = s.nextLine();
            System.out.print("Umur\t : ");
            int umur = s.nextInt();
            System.out.print("IPK\t : ");
            double ipk = s.nextDouble();
            s.nextLine();
            Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }

        data.sortMhsByName();
        System.out.println("--------------------------------------");
        System.out.println("Data keseluruhan Mahasiswa : ");
        data.tampil();

        System.out.println("_____________________________________");
        System.out.println("______________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Nama Mahasiswa yang dicari: ");
        System.out.print("Nama : ");
        // int cari = s.nextInt();
        String cari = s.nextLine();

        // System.out.println("menggunakan sequential Search");
        // int posisi = data.FindSeqSearch(cari);

        // data.Tampilposisi(cari, posisi);

        // data.TampilData(cari, posisi);

        System.out.println("====================================");
        System.out.println("menggunakan binary Search");
        int posisi = data.FindBinarySearch(cari, 0, jumMhs - 1);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);
        // tambahan kode program untuk latihan praktikum point B
        data.TampilDataGanda(cari, posisi);
    }
}
