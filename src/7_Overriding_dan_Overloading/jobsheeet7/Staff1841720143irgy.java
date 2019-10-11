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
public class Staff1841720143irgy extends Karyawan1841720143irgy {
     private int lembur;
    private double gajiLembur;
    
    public void setLemburIrgy(int lembur){
        this.lembur=lembur;
    }
    public int getLemburIrgy(){
        return lembur;
    }
    public void setGajiLemburIrgy(double gajiLembur){
        this.gajiLembur=gajiLembur;
    }
    public double getGajiLemburIrgy(){
        return gajiLembur;
    }
    public double getGajiIrgy(int lembur, double gajiLembur){
        return super.getGajiIrgy()+ lembur*gajiLembur;
    }
    public double getGajiIrgy(){
        return super.getGajiIrgy() + lembur*gajiLembur;
    }
    public void lihatInfoIrgy(){
        System.out.println("NIP :"+this.getNipIrgy());
        System.out.println("Nama :"+this.getNamaIrgy());
        System.out.println("Golongan :"+this.getGolonganIrgy());
        System.out.println("Jml Lembur :"+this.getLemburIrgy());
        System.out.println("Gaji Lembur :%.0f\n"+this.getGajiLemburIrgy());
        System.out.println("Gaji :%.0f\n"+this.getGajiIrgy());
    }
    
}
