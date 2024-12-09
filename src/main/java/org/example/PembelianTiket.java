package org.example;

import java.util.Scanner;

public class PembelianTiket {
    public static void main(String[] args) {
        Scanner pembelian = new Scanner(System.in);
        System.out.print("Masukkan Nama: ");
        String Nama = pembelian.nextLine();
        System.out.print("Masukkan Hari: ");
        String Hari = pembelian.nextLine().toLowerCase();
        System.out.print("Masukkan Tanggal: ");
        String Tanggal = pembelian.nextLine();

        if (Nama.isEmpty() || Hari.isEmpty() || Tanggal.isEmpty()) {
            System.out.println("Data Harus Diisi");
            return;
        }

        System.out.print("Pilih Jenis Tiket (reguler || terusan): ");
        String Tiket = pembelian.nextLine().toLowerCase();
        System.out.print("dewasa || anak: ");
        String Umur = pembelian.nextLine().toLowerCase();
        double HargaTiket = 0;
        if (Tiket.equals("reguler")) {
            if (Umur.equals("dewasa")) {
                HargaTiket = 75000;
            } else if (Umur.equals("anak")) {
                HargaTiket = 60000;
            }
        } else if (Tiket.equals("terusan")) {
            if (Umur.equals("dewasa")) {
                HargaTiket = 100000;
            } else if (Umur.equals("anak")) {
                HargaTiket = 85000;
            }
        } else {
            System.out.println("Tidak ada jenis tiket");
            return;
        }

        if (Hari.equals("sabtu") || Hari.equals("minggu")) {
            HargaTiket += HargaTiket * 0.2;
        }
        System.out.println("Nama: " + Nama);
        System.out.println("Hari: " + Hari);
        System.out.println("Tanggal: " + Tanggal);
        System.out.println("Jenis Tiket: " + Tiket);
        System.out.println("Kategori: " + Umur);
        System.out.println("Total Harga Tiket Rp " + HargaTiket);

        pembelian.close();
    }
}
