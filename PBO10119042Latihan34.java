/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpbo;
import java.util.Scanner;
/**
 *
 * @author Muhammad RIfqu Abdillah
 *  Nama : Muhammad Rifqu Abdillah
 *  Kelas: Pbo-IF1
 *  Nim : 10119042 
 *  Deskripsi: Program ini berisi tentang Kalkulator
 */
public class PBO10119042Latihan34 {
    
    public static void main(String[] args){
       
       Scanner scanner = new Scanner(System.in);
       
       Kalkulator kalkulator = new Kalkulator();
       
       System.out.println("======Aplikasi Kalkulator Bilangan======");
       System.out.print("Masukan Angka ke-1 : ");
       kalkulator.value1 = scanner.nextDouble();
       System.out.print("Masukan Angka ke-2 : ");
       kalkulator.value2 = scanner.nextDouble();
       
       double tambah = kalkulator.tambahBilangan();
       double kurang = kalkulator.kurangBilangan();
       double kali = kalkulator.kaliBilangan();
       double bagi = kalkulator.bagiBilangan();
       double sisa = kalkulator.sisaBilangan();
        
       System.out.println("Hasil Tambahan : " +tambah);
       System.out.println("Hasil Pengurangan : "+kurang);
       System.out.println("Hasil Perkalian : "+kali);
       System.out.println("Hasil Pembagian : "+bagi);
       System.out.println("Hasil Sisa : "+sisa);
    }
    
}
