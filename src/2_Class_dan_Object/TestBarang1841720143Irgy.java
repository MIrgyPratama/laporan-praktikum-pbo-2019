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
public class TestBarang1841720143Irgy {
      public static void main(String[] args) {
        
        Barang1841720143Irgy brg1 = new Barang1841720143Irgy();
        
        brg1.namaBrg = "Pensil";
        brg1.jenisBrg = "ATK";
        brg1.stok = 10;
        brg1.tampilBarang();
        
        // menampilkan dan mengisi argumen untuk menambahkan stok barang
        System.out.println("Stok Baru adalah " +brg1.tambahStok(20));
    
}
}
