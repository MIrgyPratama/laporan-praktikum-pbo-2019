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
public class Kursi1841720143Irgy {
    private String nomer;
    private Penumpang1841720143Irgy penumpang;

    public Kursi1841720143Irgy(String nomer) {
        this.nomer = nomer;
    }

  

    public void setNomerIrgy(String nomer) {
        this.nomer = nomer;
    }

    public void setPenumpangIrgy(Penumpang1841720143Irgy penumpang) {
        this.penumpang = penumpang;
    }

    public String getNomerIrgy() {
        return nomer;
    }

    public Penumpang1841720143Irgy getPenumpang() {
        return penumpang;
    }
    
 
    public String infoIrgy(){
        String info = "";
        info +="Nomor: " + nomer + "\n";
        if (this.penumpang != null) {
            info += "Penumpang: " + penumpang.infoIrgy() + "\n";
        }
        return info;
    }
}
