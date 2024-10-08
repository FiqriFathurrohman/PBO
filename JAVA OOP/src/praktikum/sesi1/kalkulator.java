package praktikum.sesi1;

import java.util.Scanner;

public class kalkulator {
  public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
    
        System.out.println("Kalkulator Sederhana");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");
        System.out.print("Pilih operasi: ");
        int pilihan = input.nextInt();
        
        
        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();


        int hasil = 0;

        switch (pilihan) {
            case 1:
                hasil = angka1 + angka2;
                System.out.println("Hasil Penjumlahan: " + hasil);
                break;
            case 2:
                hasil = angka1 - angka2;
                System.out.println("Hasil Pengurangan: " + hasil);
                break;
            case 3:
                hasil = angka1 * angka2;
                System.out.println("Hasil Perkalian: " + hasil);
                break;
            case 4:
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println("Hasil Pembagian: " + hasil);
                } else {
                    System.out.println("Kesalahan: Pembagian dengan nol tidak diperbolehkan.");
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }

        input.close();
    }
}  

