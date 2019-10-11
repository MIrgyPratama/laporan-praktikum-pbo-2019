/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet7;

/**
 *
 * @author IRGY
 */
public class Utama1841720143irgy {
    public static void main(String args[]){
        System.out.println("Program Testing Class Manager & Staff");
        Manager1841720143irgy man[] =new Manager1841720143irgy[2];
        Staff1841720143irgy staff1[]=new Staff1841720143irgy[2];
        Staff1841720143irgy staff2[]=new Staff1841720143irgy[3];
        
        //pembuatan Manager
        
        man[0] = new Manager1841720143irgy();
        man[0].setNamaIrgy("Tedjo");
        man[0].setNipIrgy("101");
        man[0].setGolonganIrgy("1");
        man[0].setTunjanganIrgy(5000000);
        man[0].setBagianIrgy("Administrasi");
        
        man[1] = new Manager1841720143irgy();
        man[1].setNamaIrgy("Atika");
        man[1].setNipIrgy("102");
        man[1].setGolonganIrgy("1");
        man[1].setTunjanganIrgy(2500000);
        man[1].setBagianIrgy("Pemasaran");
        
        staff1[0]= new Staff1841720143irgy();
        staff1[0].setNamaIrgy("Usman");
        staff1[0].setNipIrgy("0003");
        staff1[0].setGolonganIrgy("2");
        staff1[0].setLemburIrgy(10);
        staff1[0].setGajiLemburIrgy(10000);
        
        staff1[1]= new Staff1841720143irgy();
        staff1[1].setNamaIrgy("Anugrah");
        staff1[1].setNipIrgy("0005");
        staff1[1].setGolonganIrgy("2");
        staff1[1].setLemburIrgy(10);
        staff1[1].setGajiLemburIrgy(55000);
        man[0].setStaffIrgy(staff1);
        
        staff2[0]= new Staff1841720143irgy();
        staff2[0].setNamaIrgy("Hendra");
        staff2[0].setNipIrgy("0004");
        staff2[0].setGolonganIrgy("3");
        staff2[0].setLemburIrgy(15);
        staff2[0].setGajiLemburIrgy(5500);
        
        staff2[1]= new Staff1841720143irgy();
        staff2[1].setNamaIrgy("Arie");
        staff2[1].setNipIrgy("0006");
        staff2[1].setGolonganIrgy("4");
        staff2[1].setLemburIrgy(5);
        staff2[1].setGajiLemburIrgy(100000);
        
        staff2[2]= new Staff1841720143irgy();
        staff2[2].setNamaIrgy("Mentari");
        staff2[2].setNipIrgy("0007");
        staff2[2].setGolonganIrgy("3");
        staff2[2].setLemburIrgy(6);
        staff2[2].setGajiLemburIrgy(20000);
        man[1].setStaffIrgy(staff2);
        
        
        man[0].lihatInfoIrgy();
        man[1].lihatInfoIrgy();
    }
    
}
