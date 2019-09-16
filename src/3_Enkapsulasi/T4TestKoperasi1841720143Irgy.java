package tugas;

import java.util.Scanner;

/**
 *
 * @author IRGY
 */
public class T4TestKoperasi1841720143Irgy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        T4Anggota1841720143Irgy donny = new T4Anggota1841720143Irgy("111333444", "Donny", 5000000);
        System.out.println("Nama Anggota: " + donny.getNamaIrgy());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjamanIrgy());
        System.out.print("Meminjam : ");
        int pinjam = sc.nextInt();
        donny.pinjamIrgy(pinjam);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjamanIrgy());
        System.out.print("Meminjam : ");
        int pinjam1 = sc.nextInt();
        donny.pinjamIrgy(pinjam1);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjamanIrgy());
        System.out.print("Angsur : ");
        int angsur = sc.nextInt();
        donny.angsurIrgy(angsur);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjamanIrgy());
        System.out.print("Angsur : ");
        int angsur1 = sc.nextInt();
        donny.angsurIrgy(angsur1);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjamanIrgy());
    }
}
