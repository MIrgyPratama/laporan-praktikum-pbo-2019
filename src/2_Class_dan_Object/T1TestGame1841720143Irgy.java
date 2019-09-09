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
public class T1TestGame1841720143Irgy {
      
    public static void main(String[] args) {
        
        T1Game1841720143Irgy gm1 = new T1Game1841720143Irgy();
        
        gm1.id = 0143;
        gm1.nama = "IRGY";
        gm1.member = "PRATAMA";
        gm1.namaGame = "NFS UNDERGROUND";
        gm1.harga = 20000;
        gm1.tampilPinjaman();
        
        //menampilkan dan mengisi argumen untuk mengkalikan harga 
        System.out.println("Harga yang Harus di Bayar adalah : "+gm1.hargaBayar(3));
}
}
