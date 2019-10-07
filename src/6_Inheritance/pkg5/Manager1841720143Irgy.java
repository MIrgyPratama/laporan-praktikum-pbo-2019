/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet.pkg6.pkg5.pkg6;

/**
 *
 * @author IRGY
 */
public class Manager1841720143Irgy extends Karyawan1841720143Irgy {

    public int tunjangan;

    public Manager1841720143Irgy() {

    }

    public void tampilDataManagerIrgy() {
        super.tampilDataKaryawanIrgy();
        System.out.println("Tunjnagan        =" + tunjangan);
        System.out.println("Total Gaji      =" + (super.gaji + tunjangan));
    }

}
