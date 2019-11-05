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
public class PermanentEmployee1841720143Irgy extends Employee1841720143Irgy implements Payable1841720143Irgy{
     private int salary;

    public PermanentEmployee1841720143Irgy(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalaryIrgy() {
        return salary;
    }

    public void setSalaryIrgy(int salary) {
        this.salary = salary;
    }

    @Override
    public int getPaymentAmountIrgy() {
        return (int) (salary + 0.05 * salary);
    }
    
    @Override
    public String getEmployeeInfoIrgy() {
        String info = super.getEmployeeInfoIrgy() + "\n";
        info += "Registered as permanent employee with salary " + salary + "\n";
        return info;
    }

}
