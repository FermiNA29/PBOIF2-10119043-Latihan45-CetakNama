/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan45.cetaknama;
import java.util.Scanner;
/**
 *
 * @author FERMI
 * NAMA      : FERMI NAUFAL AKBAR
 * NIM       : 10119043
 * KELAS     : IF2
 * DESKRIPSI : Program cetak nama dengan banyak cetak
 */
public class PBOIF210119043Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    private static String nama;
    private static int cetak;
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Printer printer = new Printer();
        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukan nama anda : ");
        nama = scanner.nextLine();
        printer.setNama(nama);
        
        System.out.print("Mau cetak berapa kali : ");
        cetak = scanner.nextInt();
        printer.setJmlCetak(cetak);
        printer.cetak(printer.getNama());
        printer.cetak(printer.getJmlCetak(), printer.getNama());
    }
    
}
