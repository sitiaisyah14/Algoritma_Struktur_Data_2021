/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4;

/**
 *
 * @author WINDOWS 10
 */
public class ArrayMain {
    public static void main (String [] args){
        int arr [] = {12,17,2,1,70,50,90,17,2,90};
        
        Array a = new Array(arr);
        
        System.out.println("=====================================================================");
        System.out.println("\t\tData sebelum diurutkan");
        a.tampil();
        System.out.println("=====================================================================");
        System.out.println("\t\tData setelah diurutkan");
        int max = a.insertionSort();
        a.tampil();
        System.out.println("===================================================");
        System.out.println("Data yang merupakan nilai terbesar adalah " + max);
        int jmlMax = a.FindBinarySearch(max, 0, arr.length-1);
        System.out.println("===================================================");
        System.out.println("Nilai terbesar yaitu " + max + " ada sebanyak " + jmlMax);
        System.out.println("===================================================");
        a.TampilPosisi(max, jmlMax);
        System.out.println("===================================================");
    }
}