package Minggu10;
/**
 *
 * @author IRGY
 */
public class Tester1841720143Irgy {
    public static void main(String[] args) {
        PermanentEmployee1841720143Irgy pEmp = new PermanentEmployee1841720143Irgy("Dedik", 500);
        InternshipEmployee1841720143Irgy iEmp = new InternshipEmployee1841720143Irgy("Sunarto", 5);
        ElectricityBill1841720143Irgy eBill = new ElectricityBill1841720143Irgy(5, "R-1");
        
        Employee1841720143Irgy e;
        Payable1841720143Irgy p;
        
        e = pEmp;
        e = iEmp;
        p = pEmp;
        p = eBill;
        p = iEmp;
        e = eBill;
    }
}

