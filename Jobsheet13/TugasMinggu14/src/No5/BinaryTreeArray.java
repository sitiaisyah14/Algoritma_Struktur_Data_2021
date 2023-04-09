/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No5;

/**
 *
 * @author WINDOWS 10
 */
public class BinaryTreeArray {
    int [] data;
    int idxLast;
    
    public BinaryTreeArray(){
        data = new int[10];
    }
    
    void populateData (int data[], int idxLast){
        this.data = data;
        this.idxLast = idxLast;
    }
    
    void add (int dataMasuk, int idx){
        data[idx] = dataMasuk;
    }
    
    void traversePreOrder (int idxStart){
        if(idxStart <= idxLast){
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2*idxStart+1);
            traverseInOrder(2*idxStart+2);
        }
    }
    
    void traversePostOrder (int idxStart){
        if(idxStart <= idxLast){
            traverseInOrder(2*idxStart+1);
            traverseInOrder(2*idxStart+2);
            System.out.print(data[idxStart] + " ");
        }
    }
    
    void traverseInOrder (int idxStart){
        if(idxStart <= idxLast){
            traverseInOrder(2*idxStart+1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2*idxStart+2);
        }
    }
}
