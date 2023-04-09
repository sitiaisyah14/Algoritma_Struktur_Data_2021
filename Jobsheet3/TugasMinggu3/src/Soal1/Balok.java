/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal1;

/**
 *
 * @author WINDOWS 10
 */
public class Balok {
    public int panjang, lebar, tinggi;
    
    public Balok (int p, int l, int t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }
    
    public int LuasPermukaan (){
        return 2 * ((panjang*lebar) + (panjang*tinggi) + (lebar*tinggi));
    }
    
    public int Volume (){
        return panjang * lebar * tinggi;
    }
}
