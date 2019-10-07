/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet.pkg6.pkg2;

/**
 *
 * @author IRGY
 */
public class ClassB1841720143Irgy extends ClassA1841720143Irgy {

    private int z;

    public void setZIrgy(int z) {
        this.z = z;
    }

    public int getZIrgy() {
        return z;
    }

    public void getNilaiZIrgy() {
        System.out.println("nilai Z : " + z);
    }

    public void getJumlahIrgy() {
        System.out.println("jumlah : " + (getXIrgy() + getYIrgy() + z));
    }

}
