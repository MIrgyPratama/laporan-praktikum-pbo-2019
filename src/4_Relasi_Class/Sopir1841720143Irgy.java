/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package irgy.relasiclass.percobaan2;

/**
 *
 * @author IRGY
 */
public class Sopir1841720143Irgy {
    private String nama;
    private int biaya;

    public Sopir1841720143Irgy() {
    }

    public void setNamaIrgy(String nama) {
        this.nama = nama;
    }

    public void setBiayaIrgy(int biaya) {
        this.biaya = biaya;
    }

    public String getNamaIrgy() {
        return nama;
    }

    public int getBiayaIrgy() {
        return biaya;
    }
    
    public int hitungBiayaSopir1841720143Irgy(int hari){
        return biaya * hari;
    }
    
}
