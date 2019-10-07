/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet.pkg6.pkg3;

/**
 *
 * @author IRGY
 */
public class Tabung1841720143Irgy extends Bangun1841720143Irgy {

    protected int t;
    protected int r;
    protected double phi;

    public void setSuperPhiIrgy(double phi) {
        super.phi = phi;
    }

    public void setSuperRIrgy(int r) {
        super.r = r;
    }

    public void setTIrgy(int t) {
        this.t = t;
    }

    public void volumeIrgy() {
        System.err.println("Volume tabung adalah " + (super.phi * super.r * super.r * this.t));
    }

}
