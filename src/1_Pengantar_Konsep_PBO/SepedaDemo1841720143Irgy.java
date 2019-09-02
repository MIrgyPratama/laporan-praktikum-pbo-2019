/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




public class SepedaDemo1841720143Irgy {
    public static void main(String[] args) {
      // Pembuatan dua buah Object sepeda
        Sepeda1841720143Irgy spd1 = new Sepeda1841720143Irgy();
        Sepeda1841720143Irgy spd2 = new Sepeda1841720143Irgy();

        
        //Pemanggilan method didalam Object sepeda
        spd1.setMerekIrgy("Polygon");
        spd1.tambahKecepatanIrgy(10);
        spd1.gantiGearIrgy(2);
        spd1.cetakSatusIrgy();
        
        spd2.setMerekIrgy("Wiim Cycle");
        spd2.tambahKecepatanIrgy(10);
        spd2.gantiGearIrgy(2);
        spd2.tambahKecepatanIrgy(10);
        spd2.gantiGearIrgy(3);
        spd2.cetakSatusIrgy();

    }
   
}

    

