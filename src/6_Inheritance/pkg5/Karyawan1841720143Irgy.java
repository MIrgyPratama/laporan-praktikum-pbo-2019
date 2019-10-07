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
public class Karyawan1841720143Irgy {

    public String nama, alamat, jk;
    public int umur, gaji;

    public Karyawan1841720143Irgy() {

    }

    public Karyawan1841720143Irgy(String nama, String alamat, String jk, int umur, int gaji) {
        this.nama = nama;
        this.alamat = alamat;
        this.jk = jk;
        this.umur = umur;
        this.gaji = gaji;
    }

    public void tampilDataKaryawanIrgy() {
        System.out.println("Nama            =" + nama);
        System.out.println("Alamat          =" + alamat);
        System.out.println("Jenis Kryawan   =" + jk);
        System.out.println("Umur            =" + umur);
        System.out.println("Gaji            =" + gaji);
    }

}
