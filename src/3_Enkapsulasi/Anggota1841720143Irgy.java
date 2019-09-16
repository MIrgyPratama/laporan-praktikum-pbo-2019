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
public class Anggota1841720143Irgy {
    private String nama;
    private String alamat;
    private float simpanan;
    
    Anggota1841720143Irgy(String nama, String alamat){
        this.nama = nama;
        this.alamat =alamat;
        this.simpanan = 0;
    }

    public void setNamaIrgy(String nama) {
        this.nama = nama;
    }

    public void setAlamatIrgy(String alamat) {
        this.alamat = alamat;
    }

    public String getNamaIrgy() {
        return nama;
    }

    public String getAlamatIrgy() {
        return alamat;
    }

    public float getSimpananIrgy() {
        return simpanan;
    }

    public void setorIrgy(float uang) {
        simpanan += uang;
    }

    public void pinjamIrgy(float uang) {
        simpanan -= uang;
    }
}
    

