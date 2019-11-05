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
abstract public class Zombie1841720143Irgy implements Destroyable1847120143Irgy {
    protected int health, level;
    
    abstract public void healIrgy();
    @Override
    abstract public void destroyedIrgy();
    public String getZombieInfoIrgy() {
        return "Health = " + this.health + "\n"
        + "Level = " + this.level + "\n";
    };
    
    
}
