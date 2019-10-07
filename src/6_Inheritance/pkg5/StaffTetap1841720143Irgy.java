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
public class StaffTetap1841720143Irgy extends Staff1841720143Irgy {

    public String golongan;
    public int asuransi;

    public StaffTetap1841720143Irgy() {

    }

    public StaffTetap1841720143Irgy(String nama, String alamat, String jk, int umur,
             int gaji, int lembur, int potongan, String golongan, int asuransi) {
        super(nama, alamat, jk, umur, gaji, potongan, lembur);
        this.golongan = golongan;
        this.asuransi = asuransi;
    }

    public void tampilDataStaffTetapIrgy() {
        System.out.println("================Data Staff Tetap============");
        super.tampilDataStaffIrgy();
        System.out.println("Golongan          = " + golongan);
        System.out.println("Jumlah Angsuransi = " + asuransi);
        System.out.println("Gaji Bersih       = " + (gaji + lembur - potongan - asuransi));
    }

}
