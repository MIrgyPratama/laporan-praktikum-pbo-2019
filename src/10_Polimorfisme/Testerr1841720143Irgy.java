/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu10;

/**
 *
 * @author IRGY
 */
public class Testerr1841720143Irgy {
    public static void main(String[] args) {
        WalkingZombie1841720143Irgy wz = new WalkingZombie1841720143Irgy(100, 1);
        JumpingZombie1841720143Irgy jz = new JumpingZombie1841720143Irgy(100, 2);
        Barrier1841720143Irgy b = new Barrier1841720143Irgy(100);
        Plant1841720143Irgy p = new Plant1841720143Irgy();
        System.out.println(""+wz.getZombieInfoIrgy());
        System.out.println(""+jz.getZombieInfoIrgy());
        System.out.println(""+b.getBarrierInfoIrgy());
        System.out.println("---------------------");
        for (int i = 0; i < 4; i++) {
            p.doDestroyIrgy(wz);
            p.doDestroyIrgy(jz);
            p.doDestroyIrgy(b);
        }
        System.out.println(""+wz.getZombieInfoIrgy());
        System.out.println(""+jz.getZombieInfoIrgy());
        System.out.println(""+b.getBarrierInfoIrgy());
    }
}
