/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No1;

/**
 *
 * @author WINDOWS 10
 */
public class KarakterKebalik {
    int size;
    int top;
    String data;
    
    public KarakterKebalik(int size, String data) {
        this.size = size;
        this.data = data;
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
    
    public void push(char dt) {
        if (!IsFull()) {
            top++;
            dt = data.charAt(top) ;
        } else {
            System.out.println("Isi stack penuh!");
        }
    }
    
    public void print(){
        System.out.println("Hasil : ");
        for (int i = top; i >= 0; i--) {
            System.out.print( data.charAt(i));
        }
        System.out.println("");
    }
    
    public void konversi (String Q){
        char c;
        for (int i = 0; i < size; i++) {
            c = Q.charAt(i);
            push (c);
        }
    }
}
