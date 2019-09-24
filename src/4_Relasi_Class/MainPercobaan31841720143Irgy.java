/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package irgy.relasiclass.percobaan3;

/**
 *
 * @author IRGY
 */
public class MainPercobaan31841720143Irgy {

    public static void main(String[] args) {
        Pegawai1841720143Irgy masinis = new Pegawai1841720143Irgy("1234", "Spongebob Squarepants");
        Pegawai1841720143Irgy asisten = new Pegawai1841720143Irgy("4567", "Patrick Star");
        KeretaApi1841720143Irgy keretaApi = new KeretaApi1841720143Irgy("Gaya Baru", "Bisnis", masinis, asisten);
        System.out.println(keretaApi.infoIrgy());
    }
}

