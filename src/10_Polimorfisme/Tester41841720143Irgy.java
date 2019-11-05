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
public class Tester41841720143Irgy {
        public static void main(String[] args) {
        Owner1841720143Irgy ow = new Owner1841720143Irgy();
        ElectricityBill1841720143Irgy eBill = new ElectricityBill1841720143Irgy(5, "R-1");
        ow.payIrgy(eBill);
        System.out.println("-------------------------");
        
        PermanentEmployee1841720143Irgy pEmp = new PermanentEmployee1841720143Irgy("Dedik", 500);
        ow.payIrgy(pEmp);
        System.out.println("-------------------------");
        
        InternshipEmployee1841720143Irgy iEmp = new InternshipEmployee1841720143Irgy("Sunarto", 5);
        ow.showMyEmployeeIrgy(pEmp);
        System.out.println("-------------------------");
        ow.showMyEmployeeIrgy(iEmp);
        
        //ow.pay(iEmp);
    }
}
