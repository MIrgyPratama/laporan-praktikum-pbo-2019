/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koperasigettersetter;

/**
 *
 * @author IRGY
 */
public class KoperasiDemo1841720143Irgy {
      public static void main(String[] args){
      Anggota1841720143Irgy anggota1 = new Anggota1841720143Irgy("Iwan", "Jalan Mawar");
      System.out.println("Simpanan " + anggota1.getNamaIrgy() + " : Rp " + anggota1.getSimpananIrgy());
    
      
        anggota1.setNamaIrgy("Iwan Setiawan");
        anggota1.setAlamatIrgy("Jalan Soekarno Hatta No 10");
        anggota1.setorIrgy(100000);
        System.out.println("Simpanan " + anggota1.getNamaIrgy() + " : Rp " + anggota1.getSimpananIrgy());
    
        anggota1.pinjamIrgy(5000);
        System.out.println("Simpanan " + anggota1.getNamaIrgy() + " : Rp " + anggota1.getSimpananIrgy());
    }
}
    


