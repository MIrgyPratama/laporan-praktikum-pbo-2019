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
public class Laptop1841720143Irgy {
    private String merk;
    private Processor1841720143Irgy proc;

    public Laptop1841720143Irgy(String merk, Processor1841720143Irgy proc) {
        this.merk = merk;
        this.proc = proc;
    }

    public Laptop1841720143Irgy() {
    }
    
    
    

    public String getMerkIrgy() {
        return merk;
    }

    public void setMerkIrgy(String merk) {
        this.merk = merk;
    }

    public Processor1841720143Irgy getProcIrgy() {
        return proc;
    }

    public void setProcIrgy(Processor1841720143Irgy proc) {
        this.proc = proc;
    }
    public void infoIrgy(){
        System.out.println("Merk Laptop ="+merk);
        proc.infoIrgy();
    }
}
    
    

