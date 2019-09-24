/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package irgy.relasiclass.percobaan4;

/**
 *
 * @author IRGY
 */
public class Penumpang1841720143Irgy {
    private String ktp;
    private String nama;

    public Penumpang1841720143Irgy(String ktp, String nama) {
        this.ktp = ktp;
        this.nama = nama;    
    }

    public void setKtpIrgy(String ktp) {
        this.ktp = ktp;
    }

    public void setNamaIrgy(String nama) {
        this.nama = nama;
    }

    public String getKtpIrgy() {
        return ktp;
    }

    public String getNamaIrgy() {
        return nama;
    }
    
    public String infoIrgy() {
        String info = "";
        info += "Ktp: " + ktp + "\n";
        info += "Nama: " + nama + "\n";
        return info;
    }
}
