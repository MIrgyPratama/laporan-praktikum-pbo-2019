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
public class WalkingZombie1841720143Irgy extends Zombie1841720143Irgy {
     public WalkingZombie1841720143Irgy(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void healIrgy() {
        switch(this.level){
            case 1: this.health += (20/100 * this.health);break;
            case 2: this.health += (30/100 * this.health);break;
            case 3: this.health += (40/100 * this.health);break;
        }
    }

    @Override
    public void destroyedIrgy() {
        this.health -= (20 * this.health / 100);
    }

    @Override
    public String getZombieInfoIrgy() {
        String info = super.getZombieInfoIrgy();
        return "Walking Zombie Data = \n"
        + info;
    }
    
    
}
