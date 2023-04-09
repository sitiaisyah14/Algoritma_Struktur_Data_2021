/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3.Barang;

/**
 *
 * @author WINDOWS 10
 */
public class Barang {
    String nama;
    int hargaSatuan, jumlah;
    
    int  hitungHargaTotal(){
        return hargaSatuan*jumlah;
    }
    int hitungDiskon(int total){
        
        if (total > 100000){
            total = total*10/100; 
        }
        else if (total > 50000){
            total = total*50/100; 
        } else {
            
        }
        return total;
    }
    int hitungHargaBayar(int total, int diskon){
        return total - diskon; 
    }
}
