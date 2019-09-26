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
public class MenentukanJumlahHaridanBulan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int kode_bulan, tahun;
              
    
            Scanner sc= new Scanner(System.in);
            System.out.println("tahun= ");tahun=(int) sc.nextFloat();
             System.out.println("kode_bulan= ");kode_bulan=(int) sc.nextFloat();
    
            
            switch (kode_bulan) {
            case 1:
                System.out.println("januari jumlah hari = 31");
               break;
            case 3:
                System.out.println("maret jumlah hari = 31");
               break;
            case 4:
               System.out.println("april jumlah hari = 30");
               break;
            case 5:
               System.out.println("mei jumlah hari = 31");
               break;
            case 6:
               System.out.println("juni jumlah hari = 30");
               break;
            case 7:
               System.out.println("juli jumlah hari = 31");
               break;
            case 8:
               System.out.println("agustus jumlah hari = 31");
               break;   
            case 9:
               System.out.println("september jumlah hari = 30");
               break;
            case 10:
               System.out.println("oktober jumlah hari = 31");
               break;
            case 11:
               System.out.println("november jumlah hari = 30");
               break;
            case 12:
               System.out.println("desember jumlah hari = 31");
               break;
            case 2:
                if (tahun %4 == 0) {
                    System.out.println("februari jumlah hari = 29");
                } else{
                    System.out.println("februari jumlah hari = 28");
                };
               
    }
    }
    
}
