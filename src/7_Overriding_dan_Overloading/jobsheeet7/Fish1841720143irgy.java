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
class Ikan1841720143irgy{
    public void swimIrgy(){
        System.out.println("Ikan bisa berenang");
        
    }
}

class Piranha1841720143irgy extends  Ikan1841720143irgy{
    public void swimIrgy(){
        System.out.println("Piranha bisa makan daging");
    }
}

public class Fish1841720143irgy{
    public static void main(String[] args){
        Ikan1841720143irgy a = new Ikan1841720143irgy();
        Ikan1841720143irgy b = new Piranha1841720143irgy();
        a.swimIrgy();
        b.swimIrgy();
    }
}
        
  
