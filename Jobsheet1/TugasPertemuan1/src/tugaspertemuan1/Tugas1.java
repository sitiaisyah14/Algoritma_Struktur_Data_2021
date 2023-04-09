/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertemuan1;
/**
 *
 * @author WINDOWS 10
 */
import java.util.Scanner;
public class Tugas1 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("===== JASA CUCI PAKAIAN SMILE LAUNDRY ======");
        System.out.println("Harga 1 kg yaitu Rp. 4.500");
        System.out.println("Diskon 5% Ketika mencuci > 10kg ");
        System.out.println("==== Customer dan Berat ====");
        System.out.println("  1. Ani  = 4  kg");
        System.out.println("  2. Budi = 15 kg");
        System.out.println("  3. Bina = 6  kg");
        System.out.println("  4. Cita = 11 kg");
        System.out.println();
        int BrtAni = 4;
        int BrtBudi = 15;
        int BrtBina = 6;
        int BrtCita = 11;
        int harga = 4500; 
        int totalAni , totalBudi, totalBina, totalCita;
        if (BrtAni > 10){
            int Ani = BrtAni * harga;
            totalAni = Ani -((Ani*5)/100);
        } else {
            totalAni = BrtAni * harga;
        }
        
        if (BrtBudi > 10){
            int Budi = BrtBudi * harga;
            totalBudi = Budi -((Budi*5)/100);
        } else {
            totalBudi = BrtBudi * harga;
        }
        
        if (BrtBina > 10){
            int Bina = BrtBina * harga;
            totalBina = Bina -((Bina*5)/100);
        } else {
            totalBina = BrtBina * harga;
        }
        
        if (BrtCita > 10){
            int cita = BrtCita * harga;
            totalCita = cita -((cita*5)/100);
        } else {
            totalCita = BrtCita * harga;
        }
        int totalhasil = totalAni + totalBudi + totalBina + totalCita;
        System.out.println("========= Pendapatan Smile Laundry =========");
        System.out.println("Pendapatan : Rp. " + totalhasil);
        System.out.println("============================================");
    }
 
}
