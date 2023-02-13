package SoalSatu;

public class Main {
    public static void main(String[] args) {
        System.out.println("Soal No 1a");
        SatuA  SoalA = new SatuA();
        SoalA.methodKelasA();

        System.out.println();
        System.out.println("Soal No 1b");
        SatuB SoalB = new SatuB();
        SoalB.methodKelasB();

        System.out.println();
        System.out.println("Soal No 1c");
        SatuC SoalC = new SatuC();
        SoalC.methodKelasC();

        System.out.println();
        System.out.println("Soal No 2");
        Dua SoalDua = new Dua();
        SoalDua.methodKelasDua();
    }
}
