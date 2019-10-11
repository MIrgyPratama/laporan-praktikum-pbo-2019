/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasjobsheet7;

/**
 *
 * @author IRGY
 */
public class segitiga1841720143irgy {
  public int sudut;

    public int totalSudutIrgy(int sudutA) {
        int sudut = 180 - sudutA;
        return sudut;
    }

    public int totalSudutIrgy(int sudutA, int sudutB) {
        int sudut = 180 - (sudutA + sudutB);
        return sudut;
    }

    public int kelilingIrgy(int sisiA, int sisiB, int sisiC) {
        int keliling = sisiA + sisiB + sisiC;
        return keliling;
    }

    public double kelilingIrgy(int sisiA, int sisiB) {
        double keliling = Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
        return keliling;
    }
}
