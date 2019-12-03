/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.Anggota18411720143Irgy;

/**
 *
 * @author User
 */
public class TestBackendAnggota1841720143Irgy {
    public static void main(String[] args) {
        Anggota18411720143Irgy agt1 = new Anggota18411720143Irgy("Hunayn", "Sidaorjo", "123");
        Anggota18411720143Irgy agt2 = new Anggota18411720143Irgy("Ardan", "Bojonegoro", "456");
        Anggota18411720143Irgy agt3 = new Anggota18411720143Irgy("Dina", "Malang", "789");
        
        //test insert
        agt1.save();
        agt2.save();
        agt3.save();
        
        //test update
        agt2.setAlamat("Jawa Timur");
        agt2.save();
        
        //test delete
        agt3.delete();
        
        //tes select all
        for(Anggota18411720143Irgy k : new Anggota18411720143Irgy().getAll()){
            System.out.println("Nama: " + k.getNama() + ", Alamat : " + k.getAlamat() + ", Telepon : " + k.getTelepon());
        }
        
        //test search
        for(Anggota18411720143Irgy a : new Anggota18411720143Irgy().search("Timur")){
            System.out.println("Nama: " + a.getNama() + ", Alamat : " + a.getAlamat() + ", Telepon : " + a.getTelepon());
        }
    }
}
