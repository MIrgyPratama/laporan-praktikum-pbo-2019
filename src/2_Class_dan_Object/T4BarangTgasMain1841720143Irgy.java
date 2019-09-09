/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet2;

/**
 *
 * @author IRGY
 */
public class T4BarangTgasMain1841720143Irgy {
     public static void main(String[] args) {
        
        T4Barang_tgas1841720143Irgy brg = new T4Barang_tgas1841720143Irgy();
        
        brg.kode = "Nikon";
        brg.namaBarang = "Camera";
        brg.hargaDasar = 10000000;
        brg.diskon = (float) 0.1;
        brg.tampilData();
        
        System.out.println("Harga Jual : "+brg.hitungHargaJual(10000000, (float)0.1));
         
    }
}

    

