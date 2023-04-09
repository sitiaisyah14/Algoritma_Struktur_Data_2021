/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No2;

/**
 *
 * @author WINDOWS 10
 */
public class Queue {
    int max, front, rear, size;
    Mahasiswa antrian [];
    
    public Queue (int n){
        max = n;
        Create();
    }
    
    public void Create(){
        antrian = new Mahasiswa [max];
        size = 0;
        front = rear = -1;
    }
    
    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }
    
    public void Enqueue (Mahasiswa data){
        if (IsFull()){
            System.out.println("Queue sudah penuh");
        }
        else{
            if (IsEmpty()){
                front = rear = 0;
            }else{
                if (rear == max -1){
                    rear = 0;
                } else {
                    rear++;
                }
            }
            antrian [rear] = data;
            size++;
        }
    }
    
    public Mahasiswa Dequeue(){
        Mahasiswa data = new Mahasiswa (" ", " ", 0 , 0);
        if (IsEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            data = antrian [front];
            size--;
            if (IsEmpty()){
                front = rear = -1;
            } else {
                if (front == max -1){
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return data;
    }
    
    public void print (){
        if (IsEmpty()) {
            System.out.println("Queue Masih Kosong");
        } else {
            int i = front;
            while (i != rear){
                System.out.print(antrian[i].nim + " " + antrian[i].nama + " " + antrian[i].absen 
                        + " " + antrian[i].ipk );
                i = (i+1) % max;
                System.out.println("");
            }
            System.out.println(antrian[i].nim + " " + antrian[i].nama + " " +
                     + antrian[i].absen + " " + antrian[i].ipk + " ");
            System.out.println("Jumlah Elemen = " +  size);
        }
    }
    
    public void peek(){
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan : " + antrian[front].nim + " || " + antrian[front].nama + " || " 
                    + antrian[front].absen + " || " + antrian[front].ipk + " " );    
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    
    public void peekrear(){
        if (!IsEmpty()) {
            System.out.println("Elemen terakhir : " + antrian[rear].nim + " || " + antrian[rear].nama + " || " 
                    + antrian[rear].absen + " || " + antrian[rear].ipk + " " );    
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    
    public void peekPosition(String nim){
        if (!IsEmpty()) {
            int i = 0;
            int index = -1;
            while (i < antrian.length){
                if(nim.equals(antrian[i].nim)){
                   index = i;
                    System.out.println("Data tersebut berada pada posisi ke-" + index);
                    break;
                }
                i++;
            }
            if(index == -1){
                System.out.println("Data Tidak Ditemukan");
            }
        } else {
            System.out.println("Antrian masih kosong");
        }
    }
    
    public void printMahasiswa(int posisi) {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else if (posisi >= max) {
            System.out.println("Posisi indeks tidak ada");
        } else if (antrian[posisi] == null) {
            System.out.println("Posisi Indeks masih kosong");
        } else {
            Mahasiswa a = antrian[posisi];
            System.out.println("Data Posisi Indeks ke-" + posisi + " adalah: ");
            System.out.println(a.nim + " || " + a.nama+ " || " + a.absen + " || " + a.ipk);
        }
    }
  
}
