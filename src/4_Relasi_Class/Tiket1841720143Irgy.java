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
public class Tiket1841720143Irgy {
    private String harga;
    private String jenistiket;

    public Tiket1841720143Irgy() {

    }

    public Tiket1841720143Irgy(String harga, String jenistiket) {
        this.harga = harga;
        this.jenistiket = jenistiket;
    }

    public String getHargaIrgy() {
        return harga;
    }

    public void setHargaIrgy(String harga) {
        this.harga = harga;
    }

    public String getJenisTiketIrgy() {
        return jenistiket;
    }

    public void setJenisTiketIrgy(String jenistiket) {
        this.jenistiket = jenistiket;
    }

    public void infoIrgy() {
        System.out.printf("Harga : %s\n",harga);
        System.out.printf("Jenis Tiket: %s\n",jenistiket);
    }
}

    

