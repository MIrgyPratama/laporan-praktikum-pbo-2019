/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author IRGY
 */
public class T4Anggota1841720143Irgy {

    public String nama;
    public String noktp;
    public int jumlah;
    public int limit;

    T4Anggota1841720143Irgy(String noktp, String nama, int limit) {
        this.noktp = noktp;
        this.nama = nama;
        this.limit = limit;
    }

    public String getNamaIrgy() {
        return nama;
    }

    public int getLimitPinjamanIrgy() {
        return limit;
    }

    public void pinjamIrgy(int pinjam) {
        if (pinjam < limit) {
            jumlah = pinjam;
        } else {
            System.out.println("Maaf jumlah pinjaman melebihi limit");
        }
    }

    public int getJumlahPinjamanIrgy() {
        return jumlah;
    }

    public void angsurIrgy(int angsur) {
        if (angsur < jumlah * 0.1) {
            jumlah -= angsur;
        } else {
            System.out.println("Maaf angsuran harus 10% dari jumlah pinjaman");
        }
    }
}
