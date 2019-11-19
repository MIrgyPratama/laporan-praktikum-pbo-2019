/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package irgy.percobaan4;

/**
 *
 * @author IRGY
 */
import java.util.ArrayList;
public class InputData1841720143Irgy {
      ArrayList<Mahasiswa1841720143Irgy> ListMahasiswa;

    public InputData1841720143Irgy() {
        ListMahasiswa = new ArrayList();
    }

    public void isiData(String Nim, String Nama, String Alamat) {
        Mahasiswa1841720143Irgy mhs = new Mahasiswa1841720143Irgy(Nim, Nama, Alamat);
        ListMahasiswa.add(mhs);
    }

    public ArrayList<Mahasiswa1841720143Irgy> getData() {
        return ListMahasiswa;
    }
}
