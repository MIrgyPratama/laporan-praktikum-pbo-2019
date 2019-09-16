/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motorencapsulation;

/**
 *
 * @author IRGY
 */
public class Motor1841720143Irgy {
    public int kecepatan = 0;
    public boolean kontakOn = false;
    
    public void nyalakanMesinIrgy(){
       kontakOn = true;
   }
   public void matikanMesinIrgy(){
       kontakOn = false;
       kecepatan = 0;
   }
   public void tambahKecepatanIrgy(){
       if(kontakOn == true){
           kecepatan += 25;
           if (kecepatan >= 100) {
               System.out.println("Kecepatan Maksimal");
               kecepatan = 100;
           }
       }else{
           System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off \n");
       }
   }
   public void kurangiKecepatanIrgy(){
       if(kontakOn == true){
           kecepatan -= 5;
       }else{
           System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off \n");
       }
   }
    
   public void printStatusIrgy(){
       if(kontakOn == true){
           System.out.println("Kontak On");
       }else{
           System.out.println("Kontak Off");
       }
       System.out.println("kecepatan " + kecepatan+"\n");
   }
}

    

