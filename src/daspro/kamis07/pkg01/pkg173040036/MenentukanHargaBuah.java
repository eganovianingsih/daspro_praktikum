/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daspro.kamis07.pkg01.pkg173040036;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class MenentukanHargaBuah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float berat_buah, harga_diskon, harga_bayar, harga_setelah_diskon, diskon;
int kode_buah;
String Buah = null;

            System.out.println("Daftar Harga Buah dan Diskon");
            System.out.println("1. Jeruk = Rp.20.000/kg diskon 10%");
            System.out.println("2. Rambutan = Rp.10.000/kg");
            System.out.println("3.Duku = Rp.15.000/kg diskon 20%");
              
    
            Scanner sc= new Scanner(System.in);
            System.out.print("kode_buah= ");
            kode_buah=(int) sc.nextFloat();
            System.out.print("berat_buah= ");
            berat_buah=(float) sc.nextFloat();
            
            switch (kode_buah) {
                case 1:
            harga_bayar = 20000 * berat_buah;
            harga_diskon = (float) (harga_bayar * 0.1);
            harga_setelah_diskon = (float) harga_bayar - harga_diskon;
                System.out.println("harga - "+harga_bayar+"\nDiskon 10%, harga_bayar= "+harga_setelah_diskon);
                
             break;
                case 2:
              harga_bayar = 10000 * berat_buah;
                System.out.println("harga_bayar ="+harga_bayar);
              
             break;
                case 3:
                    harga_bayar = 25000 * berat_buah;
                    harga_diskon = (float) (harga_bayar * 0.2);
                    harga_setelah_diskon = (float) harga_bayar - harga_diskon;
                        System.out.println("harga ="+harga_bayar+"\nDiskon 20%,harga_bayar = "+harga_setelah_diskon);
                
                
            
    }
    }
    
}
