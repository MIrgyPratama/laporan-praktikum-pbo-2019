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
public class Staff1841720143Irgy extends Karyawan1841720143Irgy {

    public int lembur;
    public int potongan;

    public Staff1841720143Irgy() {

    }

    Staff1841720143Irgy(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan) {
        super(nama, alamat, jk, umur, gaji);
        this.lembur = lembur;
        this.potongan = potongan;

    }

    public void tampilDataStaffIrgy() {
        super.tampilDataKaryawanIrgy();
        System.out.println("Lembur: " + lembur);
        System.out.println("Potongan: " + potongan);
        System.out.println("Total Gaji: " + (gaji + lembur - potongan));

    }

}
