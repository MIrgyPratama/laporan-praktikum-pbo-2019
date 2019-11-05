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
public class Barrier1841720143Irgy implements Destroyable1847120143Irgy {
    private int strength;

    public Barrier1841720143Irgy(int strength) {
        this.strength = strength;
    }

    public void setStrengthirgy(int strength) {
        this.strength = strength;
    }

    public int getStrengthIrgy() {
        return strength;
    }

    @Override
    public void destroyedIrgy() {
        this.strength -= (0.1 * this.strength);
    }
    
    public String getBarrierInfoIrgy() {
        return "Barrier Strength = " + this.strength;
    }
    
    
}
