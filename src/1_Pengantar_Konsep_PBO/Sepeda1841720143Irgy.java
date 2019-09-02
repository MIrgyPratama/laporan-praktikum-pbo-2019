/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author IRGY
 */
public class Sepeda1841720143Irgy {
     private String merek;
    private int kecepatan;
    private int gear;
    private String warna;
    
   public void setwarnaIrgy(String newValue) {
        warna = newValue;
   }
    
    public void setMerekIrgy(String newValue) {
        merek = newValue;
    }
    
    public void gantiGearIrgy(int newValue) {
        gear = newValue;
    }
    
    public void tambahKecepatanIrgy(int increment) {
        kecepatan = kecepatan + increment;
    }
    
    public void remIrgy(int decrement) {
        kecepatan = kecepatan - decrement;
    }
    
    public void cetakSatusIrgy() {
        System.out.println("Merek: "+merek);
        System.out.println("Kecepatan: "+kecepatan);
        System.out.println("Gear: "+gear);
    }
}
    

