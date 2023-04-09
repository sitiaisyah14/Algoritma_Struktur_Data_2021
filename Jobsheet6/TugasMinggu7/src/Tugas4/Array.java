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
public class Array {
    int jumlahMax = 0;
    int array [] = new int[10];
    int simpanLokasi [] = new int [10];
    
    public Array (int arr[]){
        for (int i = 0; i < arr.length; i++) {
            array[i] = arr[i];
        }
    }
    
    public void tampil(){
        for (int baris : array){
            System.out.print("  "+ baris + "  |");
        }
        System.out.println("");
    }
    
    public int insertionSort(){
        for (int i = 1; i < array.length; i++) {
            int temp = array [i];
            int j = i;
            //ascending
            while (j > 0 && array [j-1] > temp){
                array [j] = array [j-1];
                j--;
            }
            array[j] = temp;
        }
        int max = array [array.length-1];
        return max;
    }
    
    public int FindBinarySearch (int cari, int left, int right){
        int mid;
        if (right >= left ) {
            mid = (left + right) / 2;
            if(cari == array[mid]){
                jumlahMax +=1;
                if (array[mid+1] == cari){
                    jumlahMax +=1;
                }
                else if (array[mid-1] == cari){
                    jumlahMax += 1;
                }
                return jumlahMax;
            }
            else if(array[mid] > cari){
                return FindBinarySearch (cari, left, mid - 1);
            }
            else{
                return FindBinarySearch (cari, mid + 1, right);
            }
        }
        return jumlahMax;
    }
    
    public void TampilPosisi (int tertinggi, int jmlMax){
        for (int i = 1; i <= jmlMax; i++) {
            System.out.println("Data terbesar yaitu  " + tertinggi + " terletak di index ke-" + (array.length -i));
        }
    }
}
