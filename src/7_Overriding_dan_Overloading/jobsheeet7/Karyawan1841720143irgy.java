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
public class Karyawan1841720143irgy {
    private String nama;
    private String nip;
    private String golongan;
    private double gaji;
    
    public void setNamaIrgy(String nama){
        this.nama=nama;
    }    
    public void setNipIrgy(String nip){
        this.nip=nip;
    }    
    public void setGolonganIrgy(String golongan){
        this.golongan=golongan;
        
        switch(golongan.charAt(0)){
            case '1': this.gaji=5000000;
                break;
            case '2': this.gaji=3000000;
                break;
            case '3': this.gaji=2000000;
                break;
            case '4': this.gaji=1000000;
                break;
            case '5': this.gaji=750000;
                break;
        }
    }
    public void setGajiIrgy(double gaji){
        this.gaji=gaji;
    }
    public String getNamaIrgy(){
        return nama;
    }
    public String getNipIrgy(){
        return nip;
    }
    public String getGolonganIrgy(){
        return golongan;
    }
    public double getGajiIrgy(){
        return gaji;
    }
}

    

