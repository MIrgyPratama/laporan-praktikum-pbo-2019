/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.database;

/**
 *
 * @author IRGY
 */
public class TestBackend1841720143Irgy {

    public static void main(String[] args) {
        Kategori1841720143Irgy kat1 = new Kategori1841720143Irgy("Novel", "Koleksi buku novel");
        Kategori1841720143Irgy kat2 = new Kategori1841720143Irgy("Referensi", "Buku referensi ilmiah");
        Kategori1841720143Irgy kat3 = new Kategori1841720143Irgy("Novel", "Komik anak-anak");

        kat1.save();
        kat2.save();
        kat3.save();

        kat2.setKeterangan("Koleksi buku referensi ilmiah");
        kat2.save();

        kat3.delete();

        for (Kategori1841720143Irgy k : new Kategori1841720143Irgy().getAll()) {
            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
        }

        for (Kategori1841720143Irgy k : new Kategori1841720143Irgy().search("ilmiah")) {
            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
        }
    }

}
