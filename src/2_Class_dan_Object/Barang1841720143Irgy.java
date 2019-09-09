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
public class Barang1841720143Irgy {
    public String namaBrg;
    public String jenisBrg;
    public int stok;
    
    public void tampilBarang(){
        System.out.println("Nama Barang  : "+namaBrg);
        System.out.println("Jenis Barang : "+jenisBrg);
        System.out.println("Stok         : "+stok);
    }
    
      //method dengan argumen dan nilai balik (return)
    public int tambahStok(int barangMasuk){
        int stokBaru = barangMasuk+stok;
        return stokBaru;
}
}
