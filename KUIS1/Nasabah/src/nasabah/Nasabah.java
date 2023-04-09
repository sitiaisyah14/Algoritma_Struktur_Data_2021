/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nasabah;

/**
 *
 * @author WINDOWS 10
 */
public class Nasabah {
    public String nama, no_rek, alamat, no_ktp;
    public int saldo;
    
    public Nasabah (String nm, String nr, String alm, String nk, int sl){
        nama = nm;
        no_rek = nr;
        alamat = alm;
        no_ktp = nk;  
        saldo = sl;
    }
    void tampilData (){
        System.out.println("Nama        : " + nama);
        System.out.println("No Rekening : " + no_rek);
        System.out.println("Alamat      : " + alamat);
        System.out.println("No KTP      : " + no_ktp);
        System.out.println("Saldo       : " + saldo);
        
    }
    int tabungan (int uang){
        return saldo + uang;
    }
    int ambilUang (int uang){
        if (saldo < uang ){
            System.out.println("*** SALDO ANDA TIDAK MENCUKUPI ***");
            
        } else {
            return saldo - uang;
        }  
        return saldo;
    }

    
}
