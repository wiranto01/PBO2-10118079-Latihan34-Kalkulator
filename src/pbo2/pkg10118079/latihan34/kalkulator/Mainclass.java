/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118079.latihan34.kalkulator;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Wiranto
 * KELAS    : IF-2
 * NIM      : 10118079
 */
public class Mainclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kalkulator kal = new Kalkulator();
        
        System.out.println("===Aplikasi Kalkulator Bilangan===");
        System.out.print("Masukkan Angka ke-1 : ");
        Scanner input = new Scanner(System.in);
        kal.value1 = input.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
        kal.value2 = input.nextDouble();
        
        System.out.println("");
        System.out.println("Hasil Pertambahan : " + kal.tambahBilangan());
        System.out.println("Hasil Pengurangan : " + kal.kurangBilangan());
        System.out.println("Hasil Perkalian : " + kal.kaliBilangan());
        System.out.println("Hasil Pembagian : " + kal.bagiBilangan());
        System.out.println("Hasil Sisa : " + kal.sisaBilagan());
        
        
    }
    
}
