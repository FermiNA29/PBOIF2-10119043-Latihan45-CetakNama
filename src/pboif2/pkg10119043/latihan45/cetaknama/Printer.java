/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan45.cetaknama;

/**
 *
 * @author FERMI
 * NAMA      : FERMI NAUFAL AKBAR
 * NIM       : 10119043
 * KELAS     : IF2
 * DESKRIPSI : Program cetak nama dengan banyak cetak
 */
public class Printer {
    private int jmlCetak;
    private String nama;

    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJmlCetak() {
        return jmlCetak;
    }

    public String getNama() {
        return nama;
    }
    
    public void cetak(String nama) {
        System.out.println("Nama Anda : " + nama);
    }
    
    public void cetak(int jmlCetak, String nama) {
        System.out.println("Hasil cetak : ");
        for(int i=1; i<=jmlCetak; i++) {
            System.out.println(i + ". " + nama);
        }
    }
}
