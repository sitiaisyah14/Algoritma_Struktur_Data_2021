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

public class PremierLeagueService {

    PremierLeague [] leagues = new PremierLeague [5];
    int idx;
    
    //method tambah
    void tambah(PremierLeague t){
        if(idx < leagues.length){
            leagues [idx] = t;
            idx++;
        }
        else{
            System.out.println("Data sudah penuh!!");
        }
    }
    //method tampil
    void tampilAll(){
        for(PremierLeague t : leagues){
            t.tampil();
            System.out.println("-----------------------------");
        }
    }
    //method sorting dengan insertion sort model asc (kecil-besar)
    void insertionSort (boolean asc){
        for (int i = 1; i < leagues.length; i++) {
            PremierLeague temp = leagues [i];
            int j = i;
            
            if (asc){
                while (j > 0 && leagues [j-1].points > temp.points){
                    leagues [j] =  leagues[j - 1];
                    j--;
                }
            }else{    
            }
            leagues [j] =  temp;
        }
    }
    //method sorting dengan insertion sort model asc (besar-kecil)
    void insertionSortDsc (boolean dsc){
        for (int i = 1; i < leagues.length; i++) {
            PremierLeague temp = leagues [i];
            int j = i;
            
            if (dsc){
                while (j > 0 && leagues [j-1].points < temp.points){
                    leagues [j] =  leagues[j - 1];
                    j--;
                }
            }else{    
            }
            leagues [j] =  temp;
        }
    }
}
