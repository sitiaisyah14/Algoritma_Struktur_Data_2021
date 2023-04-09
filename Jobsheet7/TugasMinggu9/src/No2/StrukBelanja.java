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
public class StrukBelanja {
    String noTrans, tanggal;
    int jumlahBarang, totalBayar;
    
    StrukBelanja (String nt, String tgl, int jb, int tb){
        noTrans = nt;
        tanggal = tgl;
        jumlahBarang = jb;
        totalBayar = tb;
    }
    
    int size;
    int top;
    StrukBelanja data[];

    public StrukBelanja(int size) {
        this.size = size;
        data = new StrukBelanja [size];
        top = -1;
    }
    
    public boolean IsEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(StrukBelanja dt) {
        if (!IsFull()) {
            top++;
            data[top] = dt;
        } else {
            System.out.println("Isi stack penuh!");
        }
    }

    public void pop() {
        if (!IsEmpty()) {
            StrukBelanja x = data[top];
            top--;
            System.out.println("Data yang keluar : " + x.noTrans + " || " + x.tanggal 
                    + " " + x.jumlahBarang + " " + x.totalBayar );
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void peek() {
        System.out.println("Elemen teratas : " + data[top].noTrans + " || " + data[top].tanggal 
                + " || " + data[top].jumlahBarang + " || " + data[top].totalBayar );
    }

    
    public void print(){
        System.out.println("\t Isi Stack : ");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i].noTrans + " || " + data[i].tanggal+ " || " + data[i].jumlahBarang 
                    + " || " + data[i].totalBayar + " ");
        }
        System.out.println("");
    }
    
    public void clear (){
        if (!IsEmpty()){
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        }
        else{
            System.out.println("Gagal! Stack masih kosong");
        }
    }
}
