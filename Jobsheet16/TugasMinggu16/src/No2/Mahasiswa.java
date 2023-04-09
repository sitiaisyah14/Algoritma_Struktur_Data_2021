/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No2;

/**
 *
 * @author WINDOWS 10
 */
public class Mahasiswa {
    String nim, nama, notlp;
    
    public Mahasiswa(){
        
    }
    
    public Mahasiswa (String nim, String nama, String notlp){
        this.nim = nim;
        this.nama = nama;
        this.notlp = notlp;
    }
    
    @Override
    public String toString(){
        return nim + "\t" + nama + "\t" + notlp;
    }
}
