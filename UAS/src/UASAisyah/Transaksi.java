/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UASAisyah;

/**
 *
 * @author WINDOWS 10
 */
public class Transaksi {
    String kode;
    int jml, total;
    Object kodeTr;
    
    public Transaksi(){
        
    }
    
    public Transaksi (String kode, int jml, int total){
        this.kode = kode;
        this.jml = jml;
        this.total = total;
    }
    
    @Override
    public String toString (){
        return kode + "\t"  + jml + "\t" + total;
    }
}
