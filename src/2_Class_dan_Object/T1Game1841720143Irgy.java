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
public class T1Game1841720143Irgy {
     int id;
    String nama;
    String member;
    String namaGame;
    int harga;
    int lamaSewa;
    
    
     public void tampilPinjaman(){
        System.out.println("ID        : "+id);
        System.out.println("Nama      : "+nama);
        System.out.println("Member    : "+member);
        System.out.println("Nama Game : "+namaGame);
        System.out.println("Lama Sewa : "+lamaSewa);
    }      

    //methood dengan argumen dan nilai balik  (return)
        public int hargaBayar(int lamaSewa){
            int bayar = lamaSewa * harga;
            return bayar;
}
}
