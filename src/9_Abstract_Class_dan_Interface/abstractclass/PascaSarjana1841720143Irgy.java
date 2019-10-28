/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbominggu9.abstractclass;

/**
 *
 * @author IRGY
 */
public class PascaSarjana1841720143Irgy extends Mahasiswa1841720143Irgy implements Icumlaude1841720143Irgy, Iberprestasi1841720143Irgy {

    public PascaSarjana1841720143Irgy(String nama) {
        super(nama);
    }
    

    @Override
    public void menjuaraiKompetisi() {
        System.out.println("Saya menjuarai kompetisi INTERNASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("Saya menerbitkan artikel di jurnal INTERNASIOANAL");    
    }
}


   
    

