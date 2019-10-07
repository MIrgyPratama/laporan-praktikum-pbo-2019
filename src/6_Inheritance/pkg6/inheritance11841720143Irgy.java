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
public class inheritance11841720143Irgy {

    public static void main(String[] args) {
        Manager1841720143Irgy M = new Manager1841720143Irgy();
        M.nama = "Vivin";
        M.alamat = "Jl. Vinolia";
        M.umur = 25;
        M.jk = "Perempuan";
        M.gaji = 30000000;
        M.tunjangan = 10000000;
        M.tampilDataManagerIrgy();

        Staff1841720143Irgy S = new Staff1841720143Irgy();
        S.nama = "Lestari";
        S.alamat = "Malang";
        S.umur = 25;
        S.jk = "Perempuan";
        S.gaji = 20000000;
        S.lembur = 500000;
        S.potongan = 250000;
        S.tampilDataStaffIrgy();
    }

}
