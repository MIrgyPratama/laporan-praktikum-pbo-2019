/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasrelasi;

/**
 *
 * @author IRGY
 */
public class MainTugas1841720143Irgy {
    public static void main(String[] args) {
        Customer1841720143Irgy c = new Customer1841720143Irgy();
        Pesawat1841720143Irgy p = new Pesawat1841720143Irgy();
        Tujuan1841720143Irgy j = new Tujuan1841720143Irgy("Jombang", "Zimbagwe");
        Tiket1841720143Irgy t = new Tiket1841720143Irgy("Rp. 90.000.000", "First Class");

       
        c.setNamacusIrgy("Muhammad Irgy Pratama");
        c.setKtpIrgy("1841720143");
        p.setJenisPesawatIrgy("Garuda Indonesia");
        j.setTiketIrgy(t);
        c.infoIrgy();
        System.out.println(j.infoIrgy());

    }
}

    

