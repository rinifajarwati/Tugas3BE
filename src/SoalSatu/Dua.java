package SoalSatu;

import java.util.Scanner;

public class Dua {
    public void methodKelasDua(){
        Scanner input= new Scanner(System.in);
        int pilihan;
        System.out.println("KUMPULAN RUMUS");
        System.out.println("Pilih Rumus: ");
        System.out.println("1. Luas Lingkaran");
        System.out.println("2. Volume Balok");
        System.out.print("Masukkan Pilihan Anda = ");
        pilihan = input.nextInt();

        if(pilihan==1){
            double jarijari,luasLingkaran;
            double pi = 3.14;

            System.out.print("Masukkan jari-jari lingkaran: ");
            jarijari =input.nextDouble();

            luasLingkaran = pi*jarijari*jarijari;
            System.out.println("Luas Lingkaran dengan Jari-jari "+jarijari+ " adalah " +luasLingkaran);
        }else if (pilihan==2){
            double panjang,lebar,tinggi,volbalok;
            System.out.print("masukkan panjang: ");
            panjang = input.nextDouble();
            System.out.print("masukkan lebar: ");
            lebar = input.nextDouble();
            System.out.print("masukkan tinggi: ");
            tinggi = input.nextDouble();
            volbalok=panjang*lebar*tinggi;

            System.out.println("volume Balok adalah "+volbalok);

        }else {
            System.out.println("Maaf Pilihan Tidak Tersedia");
        }
    }
}
