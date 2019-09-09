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
public class T4Barang_tgas1841720143Irgy {
    String kode;
    String namaBarang;
    int hargaDasar;
    float diskon;
    
    int hitungHargaJual(int hargaDasar, float diskon){
        this.hargaDasar = hargaDasar;
        this.diskon = diskon;
        int hargaJual =(int) (hargaDasar - (diskon*hargaDasar));
      return hargaJual;
    }
    void tampilData(){
        System.out.println("Kode        : "+kode);
        System.out.println("Nama Barang :"+namaBarang);
        System.out.println("harga Dasar :"+hargaDasar);
        System.out.println("Diskon      :"+diskon);
    }
}
    

