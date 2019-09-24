/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package irgy.relasiclass.percobaan1;

/**
 *
 * @author IRGY
 */
public class MainPercobaan1841720143Irgy {
     public static void main(String[] args) {
        Processor1841720143Irgy p = new Processor1841720143Irgy("Intel i5",3);
        Laptop1841720143Irgy L = new Laptop1841720143Irgy("Thinkpad" , p);
        
        L.infoIrgy();
        
        Processor1841720143Irgy p1 = new Processor1841720143Irgy();
        p1.setMerkIrgy("Intel i5");
        p1.setCacheIrgy(4);
        Laptop1841720143Irgy L1 = new Laptop1841720143Irgy();
        L1.setMerkIrgy("Thinkpad");
        L1.setProcIrgy(p1);
        L1.infoIrgy(); 
    }  
}
    

