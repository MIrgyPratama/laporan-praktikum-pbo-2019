/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.database;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author IRGY
 */
public class Kategori1841720143Irgy {

    private int idkategori;
    private String nama;
    private String keterangan;

    public Kategori1841720143Irgy() {

    }

    public Kategori1841720143Irgy(String nama, String keterangan) {
        this.nama = nama;
        this.keterangan = keterangan;
    }

    public int getIdkategori() {
        return idkategori;
    }

    public void setIdkategori(int idkategori) {
        this.idkategori = idkategori;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public Kategori1841720143Irgy getById(int id) {
        Kategori1841720143Irgy kat = new Kategori1841720143Irgy();
        ResultSet rs = DBHelper1841720143Irgy.selectQuery("Select * from kategori where idkategori = '" + id + "'");
        try {
            while (rs.next()) {
                kat = new Kategori1841720143Irgy();
                kat.setIdkategori(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kat;
    }

    public ArrayList<Kategori1841720143Irgy> getAll() {
        ArrayList<Kategori1841720143Irgy> ListKategori = new ArrayList();
        ResultSet rs = DBHelper1841720143Irgy.selectQuery("Select * from kategori");
        try {
            while (rs.next()) {
                Kategori1841720143Irgy kat = new Kategori1841720143Irgy();
                kat.setIdkategori(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));
                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public ArrayList<Kategori1841720143Irgy> search(String keyword) {
        ArrayList<Kategori1841720143Irgy> ListKategori = new ArrayList();
        String sql = "Select * from kategori where nama like '%" + keyword + "%' or keterangan like '%" + keyword + "%'";
        ResultSet rs = DBHelper1841720143Irgy.selectQuery(sql);
        try {
            while (rs.next()) {
                Kategori1841720143Irgy kat = new Kategori1841720143Irgy();
                kat.setIdkategori(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));
                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public void save() {
        if (getById(idkategori).getIdkategori() == 0) {
            String sql = "INSERT INTO kategori (nama, keterangan) values ('" + this.nama + "','" + this.keterangan + "')";
            this.idkategori = DBHelper1841720143Irgy.insertQueryGetId(sql);
        } else {
            String SQL = "Update kategori set nama = '" + this.nama + "', keterangan = '" + this.keterangan + "'"
                    + "where idkategori = '" + this.idkategori + "'";
            DBHelper1841720143Irgy.executeQuery(SQL);
        }
    }

    public void delete() {
        String SQL = "Delete from kategori where idkategori = '" + this.idkategori + "'";
        DBHelper1841720143Irgy.executeQuery(SQL);
    }

    public String toString() {
        return nama;
    }

    ArrayList<Kategori1841720143Irgy> getByNamaAndKeterangan(String nama, String keterangan) {
        ArrayList<Kategori1841720143Irgy> ListKategori = new ArrayList();
        ResultSet rs;

        if ((nama.trim().length() > 0) && (keterangan.trim().length() > 0)) {
            rs = DBHelper1841720143Irgy.selectQuery("SELECT * FROM kategori Where nama = '"
                    + nama + "' and keterangan = '" + keterangan + "'");
        } else if ((nama.trim().length() > 0) && (keterangan.trim().length() == 0)) {
            rs = DBHelper1841720143Irgy.selectQuery("SELECT * FROM kategori Where nama = '"
                    + nama + "'");
        } else {
            rs = DBHelper1841720143Irgy.selectQuery("SELECT * FROM kategori Where keterangan'" + keterangan + "'  ");
        }

        try {
            while (rs.next()) {
                Kategori1841720143Irgy kat = new Kategori1841720143Irgy();
                kat.setIdkategori(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));
                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

}
