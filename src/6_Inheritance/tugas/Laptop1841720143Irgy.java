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
public class Laptop1841720143Irgy extends Komputer1841720143Irgy {

    public String jnsBatrei;

    public Laptop1841720143Irgy() {
    }

    public Laptop1841720143Irgy(String jnsBatrei, String merk, int kecProcessor, int sizeMemory, String jnsProcessor) {
        super(merk, kecProcessor, sizeMemory, jnsProcessor);
        this.jnsBatrei = jnsBatrei;
    }

    public void tampilDataLaptopIrgy() {
        super.tampilDataKomputerIrgy();
        System.out.println("Jenis Batrei        = " + jnsBatrei);
    }

}
