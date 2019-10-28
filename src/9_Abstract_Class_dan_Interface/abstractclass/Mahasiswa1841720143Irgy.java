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
public class Mahasiswa1841720143Irgy implements Icumlaude1841720143Irgy {
    protected String nama;
    public Mahasiswa1841720143Irgy(String nama){
        this.nama = nama;
    }

    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3,51");
    }
    public void kuliahDiKampus(){
        System.out.println("Aku mahasiswa, namaku: "+this.nama);
        System.out.println("Aku berkuliah di kampus");
}}
