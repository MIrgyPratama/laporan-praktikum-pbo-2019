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
public class StaffHarian1841720143Irgy extends Staff1841720143Irgy {

    public int jmlJamKerja;

    public StaffHarian1841720143Irgy() {

    }

    public StaffHarian1841720143Irgy(String nama, String alamat, String jk, int umur, int gaji, int lembur,
            int potongan, int jmlJamKerja) {
        super(nama, alamat, jk, umur, gaji, potongan, lembur);
        this.jmlJamKerja = jmlJamKerja;
    }

    public void tampilDataStaffHarianIrgy() {
        System.out.println("=====================Data Staff Harian==================");
        super.tampilDataStaffIrgy();
        System.out.println("Jumlah Jam Kerja  = " + jmlJamKerja);
        System.out.println("Gaji Bersih    = " + (gaji * jmlJamKerja + lembur - potongan));
    }
}
