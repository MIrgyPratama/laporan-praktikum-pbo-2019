/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author mwpras
 */
public class Peminjaman1841720143Irgy {
    private int idpeminjaman;
    private Anggota18411720143Irgy anggota = new Anggota18411720143Irgy();
    private Buku1841720143Irgy buku = new Buku1841720143Irgy();
    private String tanggalpinjam;
    private String tanggalkembali;

    public Peminjaman1841720143Irgy() {
    }

    public Peminjaman1841720143Irgy(Anggota18411720143Irgy anggota, Buku1841720143Irgy buku, String tanggalpinjam, String tanggalkembali) {        
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalpinjam = tanggalpinjam;
        this.tanggalkembali = tanggalkembali;
    }    

    public int getIdpeminjaman() {
        return idpeminjaman;
    }

    public void setIdpeminjaman(int idpeminjaman) {
        this.idpeminjaman = idpeminjaman;
    }

    public Anggota18411720143Irgy getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota18411720143Irgy anggota) {
        this.anggota = anggota;
    }

    public Buku1841720143Irgy getBuku() {
        return buku;
    }

    public void setBuku(Buku1841720143Irgy buku) {
        this.buku = buku;
    }

    public String getTanggalpinjam() {
        return tanggalpinjam;
    }

    public void setTanggalpinjam(String tanggalpinjam) {
        this.tanggalpinjam = tanggalpinjam;
    }

    public String getTanggalkembali() {
        return tanggalkembali;
    }

    public void setTanggalkembali(String tanggalkembali) {
        this.tanggalkembali = tanggalkembali;
    }

    
    
    public Peminjaman1841720143Irgy getById(int id){
        Peminjaman1841720143Irgy peminjaman = new Peminjaman1841720143Irgy();
        ResultSet rs = DBHelper1841720143Irgy.selectQuery("SELECT "
                                        +"      p.idpeminjaman AS idpeminjaman, "
                                        +"      p.tanggalpinjam AS tanggalpinjam, "
                                        +"      p.tanggalkembali AS tanggalkembali, "
                                        +"      b.idbuku AS idbuku, "
                                        +"      b.judul AS judul, "
                                        +"      b.penerbit AS penerbit, "
                                        +"      b.penulis AS penulis, "
                                        +"      k.idkategori AS idkategori, "
                                        +"      k.nama AS nama_kategori, "
                                        +"      k.keterangan AS keterangan, "
                                        +"      a.idanggota AS idanggota, "
                                        +"      a.nama AS nama_anggota, "
                                        +"      a.alamat AS alamat, "
                                        +"      a.telepon AS telepon"
                                        +"      FROM peminjaman p"
                                        +"      LEFT JOIN buku b ON p.idbuku = b.idbuku "
                                        +"      LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                                        +"      LEFT JOIN anggota a ON p.idanggota = a.idanggota "
                                        +"      WHERE p.idpeminjaman = '"+ id + "'");
        try {
            while(rs.next()){
                peminjaman = new Peminjaman1841720143Irgy();
                peminjaman.setIdpeminjaman(rs.getInt("idbuku"));
                peminjaman.getAnggota().setIdAnggota(rs.getInt("idanggota"));
                peminjaman.getAnggota().setNama(rs.getString("nama_anggota"));
                peminjaman.getAnggota().setAlamat(rs.getString("alamat"));
                peminjaman.getAnggota().setTelepon(rs.getString("telepon"));
                peminjaman.getBuku().setIdbuku(rs.getInt("idbuku"));
                peminjaman.getBuku().getKategori().setIdKategori(rs.getInt("idkategori"));
                peminjaman.getBuku().getKategori().setNama(rs.getString("nama_kategori"));
                peminjaman.getBuku().getKategori().setKeterangan(rs.getString("keterangan"));
                peminjaman.getBuku().setJudul(rs.getString("judul"));
                peminjaman.getBuku().setPenerbit(rs.getString("penerbit"));
                peminjaman.getBuku().setPenulis(rs.getString("penulis"));
                peminjaman.setTanggalpinjam(rs.getDate("tanggalpinjam").toString());
                peminjaman.setTanggalkembali(rs.getDate("tanggalkembali").toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return peminjaman;
    }
    
    public ArrayList<Peminjaman1841720143Irgy> getAll(){
        ArrayList<Peminjaman1841720143Irgy> ListPeminjaman = new ArrayList();
        ResultSet rs = DBHelper1841720143Irgy.selectQuery("SELECT "
                                        +"      p.idpeminjaman AS idpeminjaman, "
                                        +"      p.tanggalpinjam AS tanggalpinjam, "
                                        +"      p.tanggalkembali AS tanggalkembali, "
                                        +"      b.idbuku AS idbuku, "
                                        +"      b.judul AS judul, "
                                        +"      b.penerbit AS penerbit, "
                                        +"      b.penulis AS penulis, "
                                        +"      k.idkategori AS idkategori, "
                                        +"      k.nama AS nama_kategori, "
                                        +"      k.keterangan AS keterangan, "
                                        +"      a.idanggota AS idanggota, "
                                        +"      a.nama AS nama_anggota, "
                                        +"      a.alamat AS alamat, "
                                        +"      a.telepon AS telepon"
                                        +"      FROM peminjaman p"
                                        +"      LEFT JOIN buku b ON p.idbuku = b.idbuku "
                                        +"      LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                                        +"      LEFT JOIN anggota a ON p.idanggota = a.idanggota ");
        
        try {
            while(rs.next()){
                Peminjaman1841720143Irgy peminjaman = new Peminjaman1841720143Irgy();
                peminjaman.setIdpeminjaman(rs.getInt("idpeminjaman"));
                peminjaman.getAnggota().setIdAnggota(rs.getInt("idanggota"));
                peminjaman.getAnggota().setNama(rs.getString("nama_anggota"));
                peminjaman.getAnggota().setAlamat(rs.getString("alamat"));
                peminjaman.getAnggota().setTelepon(rs.getString("telepon"));
                peminjaman.getBuku().setIdbuku(rs.getInt("idbuku"));
                peminjaman.getBuku().getKategori().setIdKategori(rs.getInt("idkategori"));
                peminjaman.getBuku().getKategori().setNama(rs.getString("nama_kategori"));
                peminjaman.getBuku().getKategori().setKeterangan(rs.getString("keterangan"));
                peminjaman.getBuku().setJudul(rs.getString("judul"));
                peminjaman.getBuku().setPenerbit(rs.getString("penerbit"));
                peminjaman.getBuku().setPenulis(rs.getString("penulis"));
                peminjaman.setTanggalpinjam(rs.getString("tanggalpinjam"));
                peminjaman.setTanggalkembali(rs.getString("tanggalkembali"));
                
                ListPeminjaman.add(peminjaman);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return ListPeminjaman;
    }
    
    public ArrayList<Peminjaman1841720143Irgy> search(String keyword){
        ArrayList<Peminjaman1841720143Irgy> ListPeminjaman = new ArrayList();
        ResultSet rs = DBHelper1841720143Irgy.selectQuery("SELECT "
                                        +"      p.idpeminjaman AS idpeminjaman, "
                                        +"      p.tanggalpinjam AS tanggalpinjam, "
                                        +"      p.tanggalkembali AS tanggalkembali, "
                                        +"      b.idbuku AS idbuku, "
                                        +"      b.judul AS judul, "
                                        +"      b.penerbit AS penerbit, "
                                        +"      b.penulis AS penulis, "
                                        +"      k.idkategori AS idkategori, "
                                        +"      k.nama AS nama_kategori, "
                                        +"      k.keterangan AS keterangan, "
                                        +"      a.idanggota AS idanggota, "
                                        +"      a.nama AS nama_anggota, "
                                        +"      a.alamat AS alamat, "
                                        +"      a.telepon AS telepon"
                                        +"      FROM peminjaman p"
                                        +"      LEFT JOIN buku b ON p.idbuku = b.idbuku "
                                        +"      LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                                        +"      LEFT JOIN anggota a ON p.idanggota = a.idanggota "
                                        +"      WHERE p.tanggalpinjam LIKE '%" + keyword + "%' "
                                        +"          OR p.tanggalkembali LIKE '%" + keyword + "%' ");
        
        try {
            while(rs.next()){
                Peminjaman1841720143Irgy peminjaman = new Peminjaman1841720143Irgy();
                peminjaman.setIdpeminjaman(rs.getInt("idbuku"));
                peminjaman.getAnggota().setIdAnggota(rs.getInt("idanggota"));
                peminjaman.getAnggota().setNama(rs.getString("nama_anggota"));
                peminjaman.getAnggota().setAlamat(rs.getString("alamat"));
                peminjaman.getAnggota().setTelepon(rs.getString("telepon"));
                peminjaman.getBuku().setIdbuku(rs.getInt("idbuku"));
                peminjaman.getBuku().getKategori().setIdKategori(rs.getInt("idkategori"));
                peminjaman.getBuku().getKategori().setNama(rs.getString("nama_kategori"));
                peminjaman.getBuku().getKategori().setKeterangan(rs.getString("keterangan"));
                peminjaman.getBuku().setJudul(rs.getString("judul"));
                peminjaman.getBuku().setPenerbit(rs.getString("penerbit"));
                peminjaman.getBuku().setPenulis(rs.getString("penulis"));
                peminjaman.setTanggalpinjam(rs.getString("tanggalpinjam"));
                peminjaman.setTanggalkembali(rs.getString("tanggalkembali"));
                
                ListPeminjaman.add(peminjaman);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return ListPeminjaman;
    }
    
    public void save(){
        if(getById(idpeminjaman).getIdpeminjaman()== 0){
            String SQL = "INSERT INTO peminjaman (idanggota, idbuku, tanggalpinjam, tanggalkembali) VALUES("
                    +"      '"+ this.getAnggota().getIdAnggota()+"', "
                    +"      '"+ this.getBuku().getIdbuku()+"', "
                    +"      '"+ this.tanggalpinjam + "', "
                    +"      '"+ this.tanggalkembali + "' "
                    +"      )";
            this.idpeminjaman = DBHelper1841720143Irgy.insertQueryGetId(SQL);
            
        } else {
            String SQL = "UPDATE peminjaman SET "
                    +"      idanggota = '"+ this.getAnggota().getIdAnggota() + "', "
                    +"      idbuku = '"+ this.getBuku().getIdbuku()+"', "
                    +"      tanggalpinjam = '"+ this.tanggalpinjam +"', "
                    +"      tanggalkembali = '"+ this.tanggalkembali +"' "
                    +"      WHERE idpeminjaman = '"+this.idpeminjaman + "'";
            DBHelper1841720143Irgy.executeQuery(SQL);
        }
    }
    
    public void delete(){
        String SQL = "DELETE FROM peminjaman WHERE idpeminjaman = '" + this.idpeminjaman + "'";
        DBHelper1841720143Irgy.executeQuery(SQL);
    }   
    
}
