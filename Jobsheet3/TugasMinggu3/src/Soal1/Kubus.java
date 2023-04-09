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
public class Kubus {
    public int sisi;
    
    public Kubus(int s){
        sisi = s;
    }
    
    public int LuasPermukaan(){
        return 6 * sisi * sisi;
    }
    
    public int Volume (){
        return sisi * sisi * sisi;
    }
}
