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
public class Pesawat1841720143Irgy {
    private String jenisPesawat;
    private Tujuan1841720143Irgy penumpang;

    public Pesawat1841720143Irgy() {
    }

    public Pesawat1841720143Irgy(String jenisPesawat, Tujuan1841720143Irgy penumpang) {
        this.jenisPesawat = jenisPesawat;
        this.penumpang = penumpang;
    }

    public String getJenisPesawatIrgy() {
        return jenisPesawat;
    }

    public void setJenisPesawatIrgy(String jenisPesawat) {
        this.jenisPesawat = jenisPesawat;
    }

    public Tujuan1841720143Irgy getPenumpangIrgy() {
        return penumpang;
    }

    public void setPenumpangIrgy(Tujuan1841720143Irgy penumpang) {
        this.penumpang = penumpang;
    }

    public String infoIrgy() {
        String info = "";
        info += "Nama Maskapai: " + this.jenisPesawat + "\n";
        info +=   this.penumpang.infoIrgy() + "\n";
        return info;
    }
}

    

