/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu5;

/**
 *
 * @author WINDOWS 10
 */
import java.util.Scanner;
public class Sum {
    public int elemen;
    public double keuntungan[];
    public double total;
    
    Sum (int elemen){
        this.elemen = elemen;
        this.keuntungan = new double [elemen];
        this.total = 0;
    }
    
    double totalBF (double arr[]){
        for (int i = 0; i < elemen; i++){
            total = total + arr[i];
        }
        return total;
    }
    
    double totalDC (double arr[], int l, int r){
        if (l==r){
            return arr[1];
        }
        else if (l<r){
            int mid = (l+r)/2;
            double lsum = totalDC(arr,1,mid-1);
            double rsum = totalDC(arr,mid+l,r);
            return lsum+rsum+arr[mid];
        }
        return 0;
    }
}

class MainSum{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("============================================================");
        System.out.print("Masukkan jumlah perusahaan : ");
        int jmlper = sc.nextInt();
        Sum [] sm = new Sum [jmlper];
        double total = 0;
        for (int i = 0; i < sm.length; i++) {
            System.out.println("============================================================");
            System.out.println("                Perusahaan ke - " + (i+1));
            System.out.println("============================================================");
            System.out.println("Program Menghitung Keuntungan Total(Satuan Juta. Misal 5.9)");
            System.out.print("Masukkan jumlah bulan : ");
            int elm = sc.nextInt();
        
            sm [i] = new Sum(elm);
            System.out.println("===========================================================");
            for( int j =0; j<elm; j++){
                System.out.print("Masukkan untung bulan ke - "+(i+1)+" = ");
                sm[i].keuntungan[j] = sc.nextDouble();
            }
        
        System.out.println("============================================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total Keuntungan perusahaan selama " + sm[i].elemen + " bulan adalah = "+ (float) sm[i].totalBF(sm[i].keuntungan));
        System.out.println("=========================================================");
        System.out.println("Algoritma Divide and Conquer");
        System.out.println("Total Keuntungan perusahaan selama " + sm[i].elemen + " bulan adalah = "+ (float) sm[i].totalDC(sm[i].keuntungan, 0, sm[i].elemen-1));
        }
    }
}
