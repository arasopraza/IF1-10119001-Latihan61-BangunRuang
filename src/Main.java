/**
 *
 * @author
 * NAMA     : Arsy Opraza Akma
 * KELAS    : IF1
 * NIM      : 10119001
 * Deskripsi Program: menghitung volume bangun ruang
 * anime Naruto berbasis OOP dan implementasi pewarisan dan abstrak.
 */

public class Main {
    public static void main(String[] args){
        BangunRuang kerucut, tabung, bola;
        bola = new Bola(7);
        System.out.println("Volume Bola Basket");
        bola.tampilVolume();

        kerucut = new Kerucut(14, 9);
        System.out.println("Volume Kerucut");
        kerucut.tampilVolume();

        tabung = new Tabung(10, 21);
        System.out.println("Volume Tabung");
        tabung.tampilVolume();
    }
}
