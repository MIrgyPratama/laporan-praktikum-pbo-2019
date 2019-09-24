/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package irgy.relasiclass.percobaan3;

/**
 *
 * @author IRGY
 */
public class KeretaApi1841720143Irgy {

    private String nama;
    private String kelas;
    private Pegawai1841720143Irgy masinis;
    private Pegawai1841720143Irgy asisten;


    public KeretaApi1841720143Irgy(String nama, String kelas, Pegawai1841720143Irgy masinis) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }

    
public KeretaApi1841720143Irgy(String nama, String kelas, Pegawai1841720143Irgy masinis, Pegawai1841720143Irgy asisten) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }

    public String getNamaIrgy() {
        return nama;
    }

    public void setNamaIrgy(String nama) {
        this.nama = nama;
    }

    public String getKelasIrgy() {
        return kelas;
    }

    public void setKelasIrgy(String kelas) {
        this.kelas = kelas;
    }

    public Pegawai1841720143Irgy getMasinisIrgy() {
        return masinis;
    }

    public void setMasinis(Pegawai1841720143Irgy masinis) {
        this.masinis = masinis;
    }

    public Pegawai1841720143Irgy getAsistenIrgy() {
        return asisten;
    }

    public void setAsistenIrgy(Pegawai1841720143Irgy asisten) {
        this.asisten = asisten;
    }

    public String infoIrgy() {
        String info = "";
        info += "Nama : " + this.nama + "\n";
        info += "Kelas : " + this.kelas + "\n";
        info += "Masinis: " + this.masinis.info() + "\n";
        info += "Asisten: " + this.asisten.info() + "\n";
        
        return info;
    }
}
