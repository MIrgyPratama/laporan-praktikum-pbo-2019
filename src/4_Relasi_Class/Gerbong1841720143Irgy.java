/*+
 -* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package irgy.relasiclass.percobaan4;

/**
 *
 * @author IRGY
 */
public class Gerbong1841720143Irgy {
     private String kode;
    private Kursi1841720143Irgy[]arrayKursi;
    
    private void initKursiIrgy(){
        for(int i = 0; i < arrayKursi.length; i++){
            this.arrayKursi[i] = new Kursi1841720143Irgy(String.valueOf(i + 1));
        }
    }
    
    public Gerbong1841720143Irgy(String kode, int jumlah){
        this.kode = kode;
        this.arrayKursi = new Kursi1841720143Irgy[jumlah];
        this.initKursiIrgy();
    }
    
    public String infoIrgy(){
        String info = "";    
        info += "Kode: " + kode + "\n";
        for(Kursi1841720143Irgy kursi : arrayKursi){
            info += kursi.infoIrgy();
        }    
        return info;
    }
    
    public void setPenumpangIrgy(Penumpang1841720143Irgy penumpang, int nomor){
        this.arrayKursi[nomor - 1].setPenumpangIrgy(penumpang);
    }
}
