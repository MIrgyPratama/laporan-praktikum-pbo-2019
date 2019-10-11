/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet7;

/**
 *
 * @author IRGY
 */
public class Manager1841720143irgy extends Karyawan1841720143irgy {

    private double tunjangan;
    private String bagian;
    private Staff1841720143irgy st[];

    public void setTunjanganIrgy(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public double getTunjanganIrgy() {
        return tunjangan;
    }

    public void setBagianIrgy(String bagian) {
        this.bagian = bagian;
    }

    public String getBagianIrgy() {
        return bagian;
    }

    public void setStaffIrgy(Staff1841720143irgy st[]) {
        this.st = st;
    }

    public void viewStaffIrgy() {
        int i;
        System.out.println("----------------");
        for (i = 0; i < st.length; i++) {
            st[i].lihatInfoIrgy();
        }
        System.out.println("----------------");
    }

    public void lihatInfoIrgy() {
        System.out.println("Manager :" + this.getBagianIrgy());
        System.out.println("NIP :" + this.getNipIrgy());
        System.out.println("Nama :" + this.getNamaIrgy());
        System.out.println("Golongan :" + this.getGolonganIrgy());
        System.out.println("Tunjangan :%.0f\n" + this.getTunjanganIrgy());
        System.out.println("Gaji :%.0f\n" + this.getGajiIrgy());
        System.out.println("Bagian " + this.getBagianIrgy());
        this.viewStaffIrgy();
    }

    public double getGajiIrgy() {
        return super.getGajiIrgy() + tunjangan;
    }
}


