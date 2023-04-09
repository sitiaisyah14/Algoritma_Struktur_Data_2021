/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTSAisyah;

/**
 *
 * @author WINDOWS 10
 */
public class Rekening {
    
    int idx;
    public String noRekening, nama, namaIbu, phone, email;
    Rekening[] abc = new Rekening [5];
    
    Rekening (String a, String b, String c, String d, String e){
        noRekening = a;
        nama = b;
        namaIbu = c;
        phone = d;
        email = e;
    }

    Rekening() {
        
    }
    
    void tambah(Rekening m){
        if(idx < abc.length){
            abc[idx] = m;
            idx++;
        }
        else{
            System.out.println("Data sudah penuh!!");
        }
    }
    void tampil(){
        System.out.println("No Rekening     = " + noRekening);
        System.out.println("Nama            = " + nama);
        System.out.println("Nama Ibu        = " + namaIbu);
        System.out.println("Phone           = " + phone);
        System.out.println("Email           = " + email);
    }
    
    void tampilAll(){
        for(Rekening m : abc){
            m.tampil();
            System.out.println("-----------------------------");
        }
    }
    
}
