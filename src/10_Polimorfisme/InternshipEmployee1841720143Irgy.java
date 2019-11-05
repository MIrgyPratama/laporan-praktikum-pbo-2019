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
public class InternshipEmployee1841720143Irgy extends Employee1841720143Irgy {
     
    private int length;

    public InternshipEmployee1841720143Irgy(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public int getLengthIrgy() {
        return length;
    }

    public void setLengthIrgy(int length) {
        this.length = length;
    }

    @Override
    public String getEmployeeInfoIrgy() {
        String info = super.getEmployeeInfoIrgy() + "\n";
        info += "Registered as internship employee for " + length + " month/s\n";
        return info;
    }
    
}
