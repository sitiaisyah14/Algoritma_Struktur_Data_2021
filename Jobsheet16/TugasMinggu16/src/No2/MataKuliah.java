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
public class MataKuliah {
    String kode, matkul;
    int sks;
    
    public MataKuliah(){
        
    }
    
    public MataKuliah (String kode, String matkul, int sks){
        this.kode = kode;
        this.matkul = matkul;
        this.sks = sks;
    }
    
    @Override
    public String toString (){
        return kode + "\t"  + matkul + "\t" + sks;
    }
}
