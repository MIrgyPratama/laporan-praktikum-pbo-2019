/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author IRGY
 */
public class T1Hewan1841720143Irgy {
    private String nama;
    private String jenis;
    private String makan;
    private int jumHewan;

    public void namaHewanIrgy(String newValue) {
        nama = newValue;
    }

    public void makananIrgy(String mak) {
        makan = mak;
    }

    public void jenishewanIrgy(String newValue) {
        jenis = newValue;
    }

    public void JumlahHewanIrgy(int hew) {
        jumHewan = jumHewan + hew;
    }

    public void kurangIrgy(int k) {
        jumHewan = jumHewan - k;
    }

    public void cekIrgy() {
        System.out.println("Nama Hewan              :" + nama);
        System.out.println("Jenis Hewan             :" + jenis);
        System.out.println("Makanan Hewan           :" + makan);
        System.out.println("Jumlah Hewan dikandang  :" + jumHewan);
    }
}

    


    
    
    

