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
public class ElectricityBill1841720143Irgy implements Payable1841720143Irgy {
    private int kwh;
    private String category;

     public ElectricityBill1841720143Irgy(int kwh, String category) {
        this.kwh = kwh;
        this.category = category;
    }

    public int getKwhIrgy() {
        return kwh;
    }

    public void setKwhIrgy(int kwh) {
        this.kwh = kwh;
    }

    public String getCategory() {
        return category;
    }

    public void setCategoryIrgy(String category) {
        this.category = category;
    }

    @Override
    public int getPaymentAmountIrgy() {
        return kwh*getBasePriceIrgy();
    }
    
    public int getBasePriceIrgy() {
        int bPrice = 0;
        switch(category) {
            case "R-1" : bPrice = 100;break;
            case "R-2" : bPrice = 200;break;
        }
        return bPrice;
    }
    
    public String getBillInfo(){
        return "kWH = "+kwh+"\n"+
                "Category = "+category+"("+getBasePriceIrgy()+" per kWH) \n";
    }
    
}
