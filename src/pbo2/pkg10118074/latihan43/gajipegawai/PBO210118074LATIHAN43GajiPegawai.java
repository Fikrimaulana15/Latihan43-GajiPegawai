/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118074.latihan43.gajipegawai;
    import java.util.Scanner;
/**
 *
 * @author ASUS
 * NAMA : fikri maulana
 * NIM : 1018074
 * KELAS :if2
 */
public class PBO210118074LATIHAN43GajiPegawai {
    
    private static int totalGaji;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scanner = new Scanner(System.in);
        GajiPegawai gp = new GajiPegawai();
        gp.setNama("Rizki Adam Kurniawan");
        gp.setAlamat("Jalan Semar dlm 4 No 72/66");
        gp.setUangTransport(250000);
        gp.setUangTunjangan(300000);
        gp.setGajiPokok(4500000);
        
        totalGaji = gp.totalGaji(
            gp.getUangTunjangan(),
            gp.getUangTransport(),
            gp.getGajiPokok()
        );
        
        gp.tampilData(
            gp.getNama(),
            gp.getAlamat(),
            gp.getUangTunjangan(),
            gp.getUangTransport(),
            gp.getGajiPokok(),
            totalGaji
        );
    }
    
}
    

