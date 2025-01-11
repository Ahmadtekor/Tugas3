/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas3;

/**
 * Dibuat untuk Tugas Kuliah, Semester 3, Kelas Reg.Sore
 * @author Viryal Arliyani :23215033
 * @author Damiri :23215020
 */
import java.util.ArrayList;
import java.util.Scanner;

public class tugas3 {

    public static void main(String[] args) {

        System.out.println("Tugas Kelompok 2");
        try (Scanner input = new Scanner(System.in)) {
            int pilihan;
            int harga = 0;
            int pack;
            char ulang;
            ArrayList<String> daftarBelanja = new ArrayList<>();
            int totalBayar = 0;

            do {
                System.out.println("##- TOKO ALAT TULIS GROSIR -##");
                System.out.println("============================");
                System.out.println("1. Pulpen");
                System.out.println("2. Spidol");
                System.out.println("3. Kertas A4");
                System.out.println("4. Buku tulis");
                System.out.println("5. Tipe x");
                System.out.println();

                System.out.print("Silahkan pilih barang yang anda beli: ");
                pilihan = input.nextInt();
                System.out.print("Jumlah pack: ");
                pack = input.nextInt();

                String namaBarang = "";
                switch (pilihan) {
                    case 1 -> {
                        namaBarang = "Pulpen";
                        harga = 15000 * pack;
                        System.out.println("Anda memilih Pulpen");
                        System.out.println("Harga 1 pack Rp15.000");
                    }
                    case 2 -> {
                        namaBarang = "Spidol";
                        harga = 20000 * pack;
                        System.out.println("Anda memilih Spidol");
                        System.out.println("Harga 1 pack Rp20.000");
                    }
                    case 3 -> {
                        namaBarang = "Kertas A4";
                        harga = 60000 * pack;
                        System.out.println("Anda memilih Kertas A4");
                        System.out.println("Harga 1 pack Rp60.000");
                    }
                    case 4 -> {
                        namaBarang = "Buku tulis";
                        harga = 30000 * pack;
                        System.out.println("Anda memilih Buku tulis");
                        System.out.println("Harga 1 pack Rp30.000");
                    }
                    case 5 -> {
                        namaBarang = "Tipe x";
                        harga = 20000 * pack;
                        System.out.println("Anda memilih Tipe x");
                        System.out.println("Harga 1 pack Rp20.000");
                    }
                    default -> {
                        System.out.println("Menu tidak tersedia");
                        harga = 0;
                    }
                }

                if (harga > 0) {
                    daftarBelanja.add(namaBarang + " - " + pack + " pack - Rp" + harga);
                    totalBayar += harga;
                }

                System.out.println("Total Harga: Rp" + harga);
                System.out.println();

                System.out.print("Ingin memilih yang lain (y/t)? ");
                ulang = input.next().toLowerCase().charAt(0);

                System.out.println();
            } while (ulang != 't');

            // Untuk Cetak struk pembelian
            System.out.println("###** STRUK PEMBELIAN **###");
            for (String item : daftarBelanja) {
                System.out.println(item);
            }
            System.out.println("------------------------");
            System.out.println("Total Bayar: Rp" + totalBayar);
            System.out.println("------------------------");
            System.out.println("Terima kasih telah berbelanja di toko kami!");
        }
    }
}