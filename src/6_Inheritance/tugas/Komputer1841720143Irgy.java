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
public class Komputer1841720143Irgy {

    public String merk;
    public int kecProcessor;
    public int sizeMemory;
    public String jnsProcessor;

    public Komputer1841720143Irgy() {
    }

    public Komputer1841720143Irgy(String merk, int kecProcessor, int sizeMemory, String jnsProcessor) {
        this.merk = merk;
        this.kecProcessor = kecProcessor;
        this.sizeMemory = sizeMemory;
        this.jnsProcessor = jnsProcessor;
    }

    public void tampilDataKomputerIrgy() {
        System.out.println("Merk                = " + merk);
        System.out.println("Kecepatan Processor = " + kecProcessor);
        System.out.println("Size Memory         = " + sizeMemory);
        System.out.println("Jenis Processor     = " + jnsProcessor);
    }

}
