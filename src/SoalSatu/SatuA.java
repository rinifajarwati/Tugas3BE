package SoalSatu;

import java.util.Scanner;

public class SatuA {
    public void methodKelasA(){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama Anda : ");
        String nama = input.nextLine();

        System.out.println("Selamat datang di bootcamp Kawah Edukasi,"+ nama + "!");
    }
}
