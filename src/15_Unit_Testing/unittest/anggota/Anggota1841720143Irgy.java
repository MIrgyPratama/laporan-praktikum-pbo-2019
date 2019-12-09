/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.anggota;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author WINDOWS10
 */
public class Anggota1841720143Irgy {

    private int idanggota;
    private String nama;
    private String alamat;
    private String telepon;

    public Anggota1841720143Irgy() {

    }

    public Anggota1841720143Irgy(String nama, String alamat, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }

    public int getIdanggota() {
        return idanggota;
    }

    public void setIdanggota(int idanggota) {
        this.idanggota = idanggota;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public Anggota1841720143Irgy getById(int id) {
        Anggota1841720143Irgy a = new Anggota1841720143Irgy();
        ResultSet rs = DBHelper1841720143Irgy.selectQuery("SELECT * FROM anggota "
                + "WHERE idanggota = '" + id + "'");
        try {
            while (rs.next()) {
                a = new Anggota1841720143Irgy();
                a.setIdanggota(rs.getInt("idanggota"));
                a.setNama(rs.getString("nama"));
                a.setAlamat(rs.getString("alamat"));
                a.setTelepon(rs.getString("telepon"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a;
    }

    public ArrayList<Anggota1841720143Irgy> getAll() {
        ArrayList<Anggota1841720143Irgy> ListAnggota = new ArrayList();
        ResultSet rs = DBHelper1841720143Irgy.selectQuery("SELECT * FROM anggota");
        try {
            while (rs.next()) {
                Anggota1841720143Irgy a = new Anggota1841720143Irgy();
                a.setIdanggota(rs.getInt("idanggota"));
                a.setNama(rs.getString("nama"));
                a.setAlamat(rs.getString("alamat"));
                a.setTelepon(rs.getString("telepon"));
                ListAnggota.add(a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }

    public ArrayList<Anggota1841720143Irgy> search(String keyword) {
        ArrayList<Anggota1841720143Irgy> ListAnggota = new ArrayList();
        String sql = "SELECT * FROM anggota WHERE "
                + "     nama LIKE '%" + keyword + "%' "
                + "     OR alamat LIKE '%" + keyword + "%' ";
        ResultSet rs = DBHelper1841720143Irgy.selectQuery(sql);
        try {
            while (rs.next()) {
                Anggota1841720143Irgy a = new Anggota1841720143Irgy();
                a.setIdanggota(rs.getInt("idanggota"));
                a.setNama(rs.getString("nama"));
                a.setAlamat(rs.getString("alamat"));
                a.setTelepon(rs.getString("telepon"));
                ListAnggota.add(a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }

    public void save() {
        if (getById(idanggota).getIdanggota() == 0) {
            String SQL = "INSERT INTO anggota (nama, alamat, telepon) VALUES("
                    + "     '" + this.nama + "', "
                    + "     '" + this.alamat + "', "
                    + "     '" + this.telepon + "' "
                    + "     )";
            this.idanggota = DBHelper1841720143Irgy.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE anggota SET "
                    + "     nama = '" + this.nama + "', "
                    + "     alamat = '" + this.alamat + "', "
                    + "     telepon = '" + this.telepon + "' "
                    + "     WHERE idanggota = '" + this.idanggota + "'";
            DBHelper1841720143Irgy.executeQuery(SQL);
        }
    }

    public void delete() {
        String SQL = "DELETE FROM anggota WHERE idanggota = '" + this.idanggota + "'";
        DBHelper1841720143Irgy.executeQuery(SQL);
    }

    public ArrayList<Anggota1841720143Irgy> getByNamaAlamatAndTelepon(String nama, String alamat, String telepon) {
        ArrayList<Anggota1841720143Irgy> ListKategori = new ArrayList();
        ResultSet rs;

        if ((nama.trim().length() > 0) && (alamat.trim().length() > 0) && (telepon.trim().length() > 0)) {
            rs = DBHelper1841720143Irgy.selectQuery("SELECT * FROM anggota WHERE nama = '" + nama + "' AND alamat = '" + alamat + "' AND telepon = '" + telepon + "'");
        } else if ((nama.trim().length() > 0) && (alamat.trim().length() > 0) && (telepon.trim().length() == 0)) {
            rs = DBHelper1841720143Irgy.selectQuery("SELECT * FROM anggota WHERE nama = '" + nama + "' AND alamat = '" + alamat + "'");
        } else if ((nama.trim().length() > 0) && (alamat.trim().length() == 0) && (telepon.trim().length() > 0)) {
            rs = DBHelper1841720143Irgy.selectQuery("SELECT * FROM anggota WHERE nama = '" + nama + "' AND telepon = '" + telepon + "'");
        } else if ((nama.trim().length() == 0) && (alamat.trim().length() > 0) && (telepon.trim().length() > 0)) {
            rs = DBHelper1841720143Irgy.selectQuery("SELECT * FROM anggota WHERE alamat = '" + alamat + "' AND telepon = '" + telepon + "'");
        } else if ((nama.trim().length() > 0) && (alamat.trim().length() == 0) && (telepon.trim().length() == 0)) {
            rs = DBHelper1841720143Irgy.selectQuery("SELECT * FROM anggota WHERE nama = '" + nama + "'");
        } else if ((nama.trim().length() == 0) && (alamat.trim().length() > 0) && (telepon.trim().length() == 0)) {
            rs = DBHelper1841720143Irgy.selectQuery("SELECT * FROM anggota WHERE alamat = '" + alamat + "'");
        } else {
            rs = DBHelper1841720143Irgy.selectQuery("SELECT * FROM kategori WHERE telepon = '" + telepon + "'");
        }

        try {
            while (rs.next()) {
                Anggota1841720143Irgy agt = new Anggota1841720143Irgy();
                agt.setIdanggota(rs.getInt("idanggota"));
                agt.setNama(rs.getString("nama"));
                agt.setAlamat(rs.getString("alamat"));
                agt.setTelepon(rs.getString("telepon"));
                ListKategori.add(agt);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }
}
