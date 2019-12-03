/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

/**
 *
 * @author mwpras
 */
import backend.*;

public class TestBackendBuku1841720143Irgy {
    public static void main(String[] args){
        Kategori1841720143Irgy novel = new Kategori1841720143Irgy().getById(27);
        Kategori1841720143Irgy referensi = new Kategori1841720143Irgy().getById(28);
        
        Buku1841720143Irgy buku1 = new Buku1841720143Irgy(novel, "Timun Mas", "Elex Media", "Bang Supit");
        Buku1841720143Irgy buku2 = new Buku1841720143Irgy(referensi, "Metode Linier", "Springer", "Alex Baldwin");
        Buku1841720143Irgy buku3 = new Buku1841720143Irgy(novel, "Bintang Terang", "Erlangga", "Mat Sewoot");
        
        buku1.save();
        buku2.save();
       
        buku2.setJudul("Aljabar Linier");
        buku2.save();
      
        buku3.delete();
        
        for(Buku1841720143Irgy b : new Buku1841720143Irgy().getAll()){
            System.out.println("Kategori: " + b.getKategori().getNama() + ", Judul: " + b.getJudul());
        }
        // test search
        for(Buku1841720143Irgy b : new Buku1841720143Irgy().search("timun")){
            System.out.println("Kategori: " + b.getKategori().getNama() + ", Judul: " + b.getJudul());
        }
    }
}
