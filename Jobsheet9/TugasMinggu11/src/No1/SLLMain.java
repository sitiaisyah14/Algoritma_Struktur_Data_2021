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
public class SLLMain {
    public static void main (String [] args) throws Exception{
        SingleLingkedList singLL = new SingleLingkedList();
        
        singLL.print();
        singLL.addFirst (890);
        singLL.print();
        singLL.addLast(760);            // akhir
        singLL.print();
        singLL.addFirst(700);           //pertama
        singLL.print();
        singLL.insertAfter(700, 999);     // setelah key
        singLL.print();
        singLL.insertAt(3, 833);          // pada indeks 3
        singLL.print();
        singLL.insertBefore(999, 100);    //sebelum key
        singLL.print();
        
        System.out.println("Data pada indeks ke-1 = " + singLL.getData(1));
        System.out.println("Data 3 berada pada indeks ke-" + singLL.indexOf(760));
        
        singLL.remove(999);             //hapus
        singLL.print();
        singLL.removeAt(0);             //hapus pd indeks
        singLL.print();
        singLL.removeFirst();           //hapus awal
        singLL.print();
        singLL.removeLast();            //hapus akhir
        singLL.print();
    }
}
