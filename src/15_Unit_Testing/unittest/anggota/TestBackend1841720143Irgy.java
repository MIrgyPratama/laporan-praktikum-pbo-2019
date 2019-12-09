/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.anggota;

/**
 *
 * @author WINDOWS10
 */
public class TestBackend1841720143Irgy {

    public static void main(String[] args) {
        Anggota1841720143Irgy agt1 = new Anggota1841720143Irgy("iqbal", "mojokerto", "0293482384");
        Anggota1841720143Irgy agt2 = new Anggota1841720143Irgy("agung", "tulungagung", "19203123");
        Anggota1841720143Irgy agt3 = new Anggota1841720143Irgy("napis", "kalimantan", "192837213");

        agt1.save();
        agt2.save();
        agt3.save();

        agt2.setAlamat("kota malang");
        agt2.save();

        agt3.delete();

        for (Anggota1841720143Irgy k : new Anggota1841720143Irgy().getAll()) {
            System.out.println("Nama: " + k.getNama() + ", telp: " + k.getTelepon() + ", alamat: " + k.getAlamat());
        }

        for (Anggota1841720143Irgy k : new Anggota1841720143Irgy().search("ilmiah")) {
            System.out.println("Nama: " + k.getNama() + ", telp: " + k.getTelepon() + ", alamat: " + k.getAlamat());
        }
    }

}
