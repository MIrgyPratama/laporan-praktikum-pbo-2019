/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author IRGY
 */
public class T1HewanLain1841720143Irgy extends T1Hewan1841720143Irgy {
     private String tipeSuspensi;

    public void setTipeSuspensiIrgy(String newValue) {
        tipeSuspensi = newValue;
    }

    public void cekIrgy() {
        super.cekIrgy();
        System.out.println("Tipe suspensi           :" + tipeSuspensi);
    }
}

    

