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
public class Customer1841720143Irgy {
    private String namacus;
    private String ktp;

    public Customer1841720143Irgy() {

    }

    public Customer1841720143Irgy(String namacus, String ktp) {
        this.namacus = namacus;
        this.ktp = ktp;
    }

    public String getNamacusIrgy() {
        return namacus;
    }

    public void setNamacusIrgy(String namacus) {
        this.namacus = namacus;
    }

    public String getKtpIrgy() {
        return ktp;
    }

    public void setKtpIrgy(String ktp) {
        this.ktp = ktp;
    }


    public void infoIrgy() {
        System.out.println("Nama Customer: " + namacus);
        System.out.println("Nomer Ktp: " + ktp);
    }
}

    

