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
public class MenentukanTypeKarakter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
char karakter;
    
              
   
            System.out.println("masukkan 1 karakter !");
             Scanner sc= new Scanner(System.in);
             System.out.print("karakter= ");
             karakter=sc.next().charAt(0);
             
             if (karakter >= 'a' && karakter <= 'z'){
                 System.out.println(""+karakter+"yaitu adalah huruf kecil");
             }else if (karakter >= 'A' && karakter <= 'Z'){
                 System.out.println(""+karakter+" yaitu adalah huruf kapital");
             }else if (karakter >= '0' && karakter <= '9'){
                 System.out.println(""+karakter+"yaitu adalah Angka");
             }else{
                 System.out.println(""+karakter+"yaitu adalah simbol");
             }}
}
    
    
    
            