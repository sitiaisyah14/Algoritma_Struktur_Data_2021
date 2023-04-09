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
public class Tabung {
    public int jari, tinggi;
    
    public Tabung (int r, int t){
        jari = r;
        tinggi = t;
    }
    
    public double LuasPermukaan (){
        return (2 * 3.14 * jari * tinggi) + (2 * 3.14 * jari * jari);
    }
    
    public double Volume (){
        return 3.14 * jari * jari * tinggi;
    }
}

