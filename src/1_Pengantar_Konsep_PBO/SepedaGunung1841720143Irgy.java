/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IRGY
 */
public class SepedaGunung1841720143Irgy extends Sepeda1841720143Irgy{
    private String tipeSuspensi;
    
    public void setTipeSuspensiIrgy(String newValue) {
        tipeSuspensi = newValue;
    }
    
    public void cetakSatusIrgy() {
        super.cetakSatusIrgy();
        System.out.println("Tipe Suspensi: "+tipeSuspensi);
    }
}

    

