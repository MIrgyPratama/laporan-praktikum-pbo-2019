/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package irgy.relasiclass.percobaan4;

/**
 *
 * @author IRGY
 */
public class MainPercobaan41841720143Irgy {

    public static void main(String[] args) {
        Penumpang1841720143Irgy p = new Penumpang1841720143Irgy ("12345", "Mr. Krab");
        Gerbong1841720143Irgy gerbong = new Gerbong1841720143Irgy ("A", 10);
        gerbong.setPenumpangIrgy(p, 1);
        System.out.println(gerbong.infoIrgy());
    }
}
