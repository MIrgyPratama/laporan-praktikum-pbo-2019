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
public class Pelanggan1841720143Irgy {
    private String nama;
    private Mobil1841720143Irgy mobil;
    private Sopir1841720143Irgy sopir;
    private int hari;

    public Pelanggan1841720143Irgy() {
    }

    public void setNamaIrgy(String nama) {
        this.nama = nama;
    }

    public void setMobilIrgy(Mobil1841720143Irgy mobil) {
        this.mobil = mobil;
    }

    public void setSopirIrgy(Sopir1841720143Irgy sopir) {
        this.sopir = sopir;
    }

    public void setHariIrgy(int hari) {
        this.hari = hari;
    }

    public String getNamaIrgy() {
        return nama;
    }

    public Mobil1841720143Irgy getMobilIrgy() {
        return mobil;
    }

    public Sopir1841720143Irgy getSopirIrgy() {
        return sopir;
    }

    public int getHariIrgy() {
        return hari;
    }
    
    public int hitungBiayaTotal1841720143Irgy(){
        return mobil.hitungBiayaMobil(hari)+ sopir.hitungBiayaSopir1841720143Irgy(hari);
    }

    
    }

    

