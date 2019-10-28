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
public class programm1841720143Irgy {
    public static void main(String[] args) {
        Rektor1841720143Irgy pakRektor = new Rektor1841720143Irgy();
        
        Mahasiswa1841720143Irgy mahasiswaBiasa = new Mahasiswa1841720143Irgy("Charlie");
        Sarjana1841720143Irgy sarjanaCumlaude = new Sarjana1841720143Irgy("Dini");
        PascaSarjana1841720143Irgy masterCumlaude = new PascaSarjana1841720143Irgy("Elok");
        
        //pakRektor.beriSertifikatCumlaude(mahasiswaBiasa);
        //mahasiswaBiasa.kuliahDiKampus();
        //sarjanaCumlaude.kuliahDiKampus();
        pakRektor.beriSertifikatMawapres(sarjanaCumlaude);
        pakRektor.beriSertifikatMawapres(masterCumlaude);
        
    }
    
}
