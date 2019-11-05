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
public class Owner1841720143Irgy {
      public void payIrgy(Payable1841720143Irgy p){
        System.out.println("Total payment = "+ p.getPaymentAmountIrgy());
        if (p instanceof ElectricityBill1841720143Irgy) {
            ElectricityBill1841720143Irgy eb = (ElectricityBill1841720143Irgy)p;
            System.out.println(""+eb.getBillInfo());
        } else if (p instanceof PermanentEmployee1841720143Irgy) {
            PermanentEmployee1841720143Irgy pe = (PermanentEmployee1841720143Irgy)p;
            pe.getEmployeeInfoIrgy();
            System.out.println(""+pe.getEmployeeInfoIrgy());
        }
    }
    public void showMyEmployeeIrgy(Employee1841720143Irgy e) {
        System.out.println(""+e.getEmployeeInfoIrgy());
        if (e instanceof PermanentEmployee1841720143Irgy) {
            System.out.println("You have to pay her/him monthly!!!");
        } else {
            System.out.println("No need to pay him/her :)");
        }
    }

}
