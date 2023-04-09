/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan.pkg1;

/**
 *
 * @author WINDOWS 10
 */
public class Array {
    public static void main (String [] args){
                String cabang[] = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};
        String bunga[] = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        int harga[] = {75000, 50000, 60000, 10000};
        int stok[][] = {{10, 5, 15, 7}, {6, 11, 9, 12}, {2, 10, 10, 5},{5, 7, 12, 9}};
        
        System.out.println("=======================ROYAL GARDEN==========================");
        for (int i=0; i<4; i++){
            System.out.println ("Cabang "+cabang[i]);
            System.out.println("Stok Tanaman : ");
            System.out.println(bunga[0]+"|"+bunga[1]+"\t\t|"+bunga[2]+"\t|"+bunga[3]+"\t\t|");
            for (int j=0; j<4; j++){
                System.out.print (+stok[i][j] +"\t|\t");
            }
            System.out.println("\n============================================================");
        }
        

        int aglonema = 0;
        int keladi =0;
        int alocasia = 0;
        int mawar = 0;
        for (int i=0; i<stok.length; i++){
            
            //info tambahan bunga mati di cabang RoyalGarden 1
            if (i==0){
                System.out.println("\n============================================================");
                System.out.println("Bunga di cabang "+cabang[0]+" mati sejumlah : ");
                stok[i][0] -= 1;
                stok[i][1] -= 2;
                stok[i][2] -= 0;
                stok[i][3] -= 5;             
                System.out.println(bunga[0] + " mati sebanyak 1, sehingga stok menjadi : ");
                System.out.println(stok[i][0]);
                System.out.println(bunga[1] + " mati sebanyak 2, sehingga stok menjadi : ");
                System.out.println(stok[i][1]);
                System.out.println(bunga[2] + " mati sebanyak 0, sehingga stok menjadi : ");
                System.out.println(stok[i][2]);
                System.out.println(bunga[3] + " mati sebanyak 5, sehingga stok menjadi : ");
                System.out.println(stok[i][3]);
            }
            
            for (int j=0; j<stok[0].length; j++){
                if (j==0){
                    aglonema += stok[i][j];
                }
                else if (j==1){
                    keladi += stok[i][j];
                }
                else if (j==2){
                    alocasia += stok[i][j];
                }
                else if (j==3){
                    mawar += stok[i][j];
                }
            }
        }
        
        System.out.println("\n===================== JAWABAN A ==================");
        
        System.out.println("Jumlah Stock berdasarkan jenis bunga : ");
        System.out.println("(sebelum bunga di RoyalGarden 1 mati)");
        System.out.println ("Stok aglonema \t= "+(aglonema+1));
        System.out.println ("Stok keladi \t= "+(keladi+2));
        System.out.println ("Stok alocasia \t= "+(alocasia+0));
        System.out.println ("Stok mawar \t= "+(mawar+5));
        
        System.out.println("\n===================== JAWABAN B ======================");
        System.out.println("Jumlah Stock berdasarkan jenis bunga : ");
        System.out.println("(setelah bunga di RoyalGarden 1 mati)");
        System.out.println ("Stok aglonema \t= "+aglonema);
        System.out.println ("Stok keladi \t= "+keladi);
        System.out.println ("Stok alocasia \t= "+alocasia);
        System.out.println ("Stok mawar \t= "+mawar);
        
        //penghasilan
        System.out.println("\n=================================");
        int  hasilAglonema = aglonema * harga[0];
        int  hasilKeladi = keladi * harga[1];
        int  hasilAlocasia = aglonema * harga[2];
        int  hasilMawar = aglonema * harga[3];
        int totalPenghasilan = hasilAglonema + hasilKeladi + hasilAlocasia + hasilMawar;
        System.out.print("Total Penghasilan : Rp. "+totalPenghasilan);
        System.out.println("\n=================================");
    }
}
