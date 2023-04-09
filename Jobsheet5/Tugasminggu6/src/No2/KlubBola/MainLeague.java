/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No2.KlubBola;

/**
 *
 * @author WINDOWS 10
 */
import java.util.Scanner;

public class MainLeague {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PremierLeagueService liga = new PremierLeagueService(); //objek baru dri class 2

        PremierLeague m1 = new PremierLeague("Liverpool", 29, 45, 82);
        PremierLeague m2 = new PremierLeague("Chelsea", 29, 9, 48);
        PremierLeague m3 = new PremierLeague("Aston Villa", 27, -18, 25);
        PremierLeague m4 = new PremierLeague("Averton", 29, -6, 37);
        PremierLeague m5 = new PremierLeague("Arsenal", 28, 4, 40);

        liga.tambah(m1);
        liga.tambah(m2);
        liga.tambah(m3);
        liga.tambah(m4);
        liga.tambah(m5);

        System.out.println("====================================");
        System.out.println("Data Liga Bola sebelum sorting  ");
        System.out.println("====================================");
        liga.tampilAll();

        System.out.println("===========================================================");
        System.out.println("Data Liga Bola setelah sorting asc berdasarkan points");
        System.out.println("===========================================================");
        boolean asc = true;
        liga.insertionSort(asc);
        liga.tampilAll();

        System.out.println("===========================================================");
        System.out.println("Data Liga Bola setelah sorting dsc berdasarkan points");
        System.out.println("===========================================================");
        boolean dsc = true;
        liga.insertionSortDsc(dsc);
        liga.tampilAll();
    }

}
