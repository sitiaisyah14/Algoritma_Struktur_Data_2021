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
public class Main {
    public static void main (String [] args) throws Exception{
        SingleLingkedList singLL = new SingleLingkedList ();
        
        singLL.print();
        singLL.addFirst('A');
        singLL.print();
        singLL.addLast('C');
        singLL.print();
        singLL.insertAt(1,'B');
        singLL.print();
        singLL.insertAfter('C', 'E');
        singLL.print();
        singLL.insertBefore('E', 'D');
        singLL.print();
    }
}
