/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasrelasi;

/**
 *
 * @author IRGY
 */
public class Tujuan1841720143Irgy {
    private String tujuan;
    private String asal;
    private Tiket1841720143Irgy tiket;

    public Tujuan1841720143Irgy() {
    }

    public Tujuan1841720143Irgy(String asal, String tujuan) {
        this.asal = asal;
        this.tujuan = tujuan;
    }
    
    public String getAsalIrgy(){
        return asal;
    }
    
    public void setAsalIrgy(String asal){
        this.asal = asal;
    }

    public String getTujuanIrgy() {
        return tujuan;
    }

    public void setTujuanIrgy(String tujuan) {
        this.tujuan = tujuan;
    }

    public Tiket1841720143Irgy getTiketIrgy() {
        return tiket;
    }

    public void setTiketIrgy(Tiket1841720143Irgy tiket) {
        this.tiket = tiket;
    }

    public String infoIrgy() {
        String info = "";
        tiket.infoIrgy();
        info += "Asal: " + this.asal + "\n";
        info += "Tujuan: " + this.tujuan + "\n";    
        return info;
    }
}


