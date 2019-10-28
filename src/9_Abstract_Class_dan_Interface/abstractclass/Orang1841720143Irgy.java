/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbominggu9.abstractclass;

/**
 *
 * @author IRGY
 */
public class Orang1841720143Irgy {
    private String nama;
    private Hewan1841720143Irgy hewanPeliharaanIrgy;
    
    public Orang1841720143Irgy(String nama){
        this.nama = nama;
    }
    
    public void peliharaanHewanIrgy(Hewan1841720143Irgy hewanPeliharaanIrgy){
        this.hewanPeliharaanIrgy = hewanPeliharaanIrgy;
    }
    
    public void ajakPeliharaanJalanJalanIrgy(){
        System.out.println("Namaku" + this.nama);
        System.out.println("Hewan peliharaanku berjalan dengan cara: ");
        this.hewanPeliharaanIrgy.bergerakIrgy();
        System.out.println("=========================================");
    }
    
}
