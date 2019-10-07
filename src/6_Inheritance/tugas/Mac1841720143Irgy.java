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
public class Mac1841720143Irgy extends Laptop1841720143Irgy {

    public String security;

    public Mac1841720143Irgy() {

    }

    public Mac1841720143Irgy(String security, String jnsBatrei, String merk, int kecProcessor, int sizeMemory, String jnsProcessor) {
        super(jnsBatrei, merk, kecProcessor, sizeMemory, jnsProcessor);
        this.security = security;
    }

    public void tampilDataMacIrgy() {
        super.tampilDataLaptopIrgy();
        System.out.println("Security            = " + security);
    }

}
