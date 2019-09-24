/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package irgy.relasiclass.percobaan2;

/**
 *
 * @author IRGY
 */
public class MainPercobaan21841720143Irgy {

    public static void main(String[] args) {
        Mobil1841720143Irgy m = new Mobil1841720143Irgy();
        m.setMerkIrgy("Avanza");
        m.setBiayaIrgy(350000);
        Sopir1841720143Irgy s = new Sopir1841720143Irgy();
        s.setNamaIrgy("John Doe");
        s.setBiayaIrgy(200000);
        Pelanggan1841720143Irgy p = new Pelanggan1841720143Irgy();
        p.setNamaIrgy("Jane Doe");
        p.setMobilIrgy(m);
        p.setSopirIrgy(s);
        p.setHariIrgy(2);
        System.out.println("Biaya Total = " +
        p.hitungBiayaTotal1841720143Irgy());

    }
}
