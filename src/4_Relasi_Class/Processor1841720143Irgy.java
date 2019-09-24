/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package irgy.relasiclass.percobaan1;

/**
 *
 * @author IRGY
 */
public class Processor1841720143Irgy {
    private String merk;
    private double cache;

    public Processor1841720143Irgy() {
    }
    
    public Processor1841720143Irgy(String merk,double cache){
    this.merk = merk;
    this.cache = cache;
    }

    public void setMerkIrgy(String merk) {
        this.merk = merk;
    }

    public void setCacheIrgy(double cache) {
        this.cache = cache;
    }

    public double getCacheIrgy() {
        return cache;
    }

    public String getMerkIrgy() {
        return merk;
    }
    
    public void infoIrgy(){
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Memory = %.2f\n", cache);
    }
    
}
