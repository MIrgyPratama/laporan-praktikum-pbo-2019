/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet2;
import java.util.Scanner;

/**
 *
 * @author IRGY
 */
public class T3TestLingkaran181720143Irgy {
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
            T3Lingkaran1841720143Irgy lgn1 = new T3Lingkaran1841720143Irgy();
            
            System.out.println("Nilai phi : "+lgn1.phi);
            System.out.println("Nilai jari-jari : "+lgn1.r);
      
            
            System.out.println("Luas Lingkaran : "+lgn1.hitungLuas(3.4));
            System.out.println("Luas Keliling : "+lgn1.hitungKeliling(3.14));
    }
}

    

