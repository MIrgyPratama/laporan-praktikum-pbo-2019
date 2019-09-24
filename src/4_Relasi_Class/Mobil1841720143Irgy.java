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
public class Mobil1841720143Irgy {
    private String nama;
    private int biaya;

    public Mobil1841720143Irgy() {
    }

    public void setMerkIrgy(String nama) {
        this.nama = nama;
    }

    public void setBiayaIrgy(int biaya) {
        this.biaya = biaya;
    }

    public String getMerkIrgy() {
        return nama;
    }

    public int getBiayaIrgy() {
        return biaya;
    }
    
    public int hitungBiayaMobil(int hari){
        return biaya * hari;
    }
    
}
