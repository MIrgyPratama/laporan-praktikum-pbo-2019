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
public class Sarjana1841720143Irgy extends Mahasiswa1841720143Irgy implements Icumlaude1841720143Irgy{
    
    public Sarjana1841720143Irgy(String nama) {
        super(nama);
    }
    
    @Override
    public void lulus(){
        kuliahDiKampus();
        System.out.println("Aku sudah menyelesaiakn SKRIPSI");
    }
    
    @Override
    public void meraihIPKTinggi(){
        System.out.println("IPK-ku lebih dari 3,51");
    }
    
    
   

    //@Override
    //public void menjuaraiKompetisi() {
    //System.out.println("Saya telah menjuarai kompetisi NASIONAL");
    }

    //@Override
    //public void membuatPublikasiIlmiah() {
    //System.out.println("Saya menerbitkan artikel di jurnal NASIONAL");
    //}
    
    
    

