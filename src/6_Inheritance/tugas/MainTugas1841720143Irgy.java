package jobsheet.pkg6.tugas;
/**
 *
 * @author IRGY
 */
public class MainTugas1841720143Irgy {
    public static void main(String[] args) {
         Mac1841720143Irgy mac = new  Mac1841720143Irgy("Smadav", "Li-On", "Apple", 2000, 4000, "A10");
        System.out.println("==============================Apple MacBook=================================");
        mac.tampilDataMacIrgy();
        System.out.println("============================================================================");

        System.out.println("==============================Micrososoft Windows===========================");
        Windows1841720143Irgy windows = new Windows1841720143Irgy(14, "Li-On", "Microsoft", 2500, 8000, "i7");
        windows.tampilDataWindowsIrgy();
        System.out.println("============================================================================");

        System.out.println("==============================ASUS PC=======================================");
       Pc1841720143Irgy pc = new Pc1841720143Irgy(21, "ASUS", 3000, 16000, "i7");
        pc.tampilDataPcIrgy();
        System.out.println("============================================================================");
    }

}
