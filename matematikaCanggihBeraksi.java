/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematikaongki;

/**
 *
 * @author USER
 */
public class matematikaCanggihBeraksi {
      public static void main(String[] args) {
        // Membuat objek dari kelas MatematikaCanggih
        matematikaCanggih matematika = new matematikaCanggih();

        // Memanggil method pertambahan
        int hasilPertambahan = matematika.pertambahan(10, 5);
        System.out.println("Hasil Pertambahan: " + hasilPertambahan);

        // Memanggil method perkalian
        int hasilPerkalian = matematika.perkalian(10, 5);
        System.out.println("Hasil Perkalian: " + hasilPerkalian);

        // Memanggil method modulus
        int hasilModulus = matematika.modulus(10, 3);
        System.out.println("Hasil Modulus: " + hasilModulus);
    }
    
}
