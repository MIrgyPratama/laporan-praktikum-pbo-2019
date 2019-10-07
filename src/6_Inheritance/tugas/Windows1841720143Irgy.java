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
public class Windows1841720143Irgy extends Laptop1841720143Irgy {

    public int ukuranMonitor;

    public Windows1841720143Irgy() {
    }

    public Windows1841720143Irgy(int ukuranMonitor, String jnsBatrei, String merk, int kecProcessor, int sizeMemory, String jnsProcessor) {
        super(jnsBatrei, merk, kecProcessor, sizeMemory, jnsProcessor);
        this.ukuranMonitor = ukuranMonitor;
    }

    public void tampilDataWindowsIrgy() {
        super.tampilDataLaptopIrgy();
        System.out.println("Ukuran Monitor      = " + ukuranMonitor);
    }

}
