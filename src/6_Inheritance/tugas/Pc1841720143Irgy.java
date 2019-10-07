/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet.pkg6.tugas;

/**
 *
 * @author IRGY
 */
public class Pc1841720143Irgy extends Komputer1841720143Irgy {

    public int ukuranMonitor;

    public Pc1841720143Irgy(int ukuranMonitor) {
        this.ukuranMonitor = ukuranMonitor;
    }

    public  Pc1841720143Irgy(int ukuranMonitor, String merk, int kecProcessor, int sizeMemory, String jnsProcessor) {
        super(merk, kecProcessor, sizeMemory, jnsProcessor);
        this.ukuranMonitor = ukuranMonitor;
    }

    public void tampilDataPcIrgy() {
        super.tampilDataKomputerIrgy();
        System.out.println("Ukuran Monitor      = " + ukuranMonitor);
    }

}
