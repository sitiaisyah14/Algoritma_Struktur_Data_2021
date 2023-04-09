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
import java.util.Scanner;
public class Main {
    public static void menu(){
        System.out.println("==================================================");
        System.out.println(" PROGRAM PENGOLAHAN ANGKA DENGAN DOUBLE LINKED LIST ");
        System.out.println("==================================================");
        System.out.println("1. Tambah Head");
        System.out.println("2. Tambah Tail");
        System.out.println("3. Tambah Data");
        System.out.println("4. Hapus Data Pertama");
        System.out.println("5. Hapus Data Terakhir");
        System.out.println("6. Hapus Data Tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari");
        System.out.println("9. Urut Data");
        System.out.println("10. Keluar");
    }
    public static void main(String [] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList dll = new DoubleLinkedList();
        
        dll.addFirst(88);
        dll.addLast(66);
        dll.addLast(32);
        dll.addLast(34);
        dll.addLast(23);
        dll.addLast(67);
        dll.addLast(44);
        dll.addLast(90);
        dll.addLast(99);
        
        int pilih = 0;
        do {
            menu();
            System.out.println("--------------");
            System.out.print("  Pilih : ");
            pilih = sc.nextInt();
            
            switch(pilih){
                case 1:
                    System.out.print("Data : ");
                    int dt = sc.nextInt();
                    dll.addFirst(dt);
                    break;
                case 2:
                    System.out.print("Data : ");
                    int dt2 = sc.nextInt();
                    dll.addLast(dt2);
                    break;
                case 3:
                    System.out.print("Posisi : ");
                    int idx = sc.nextInt();
                    System.out.print("Data : ");
                    int dt3 = sc.nextInt();
                    dll.add(dt3, idx);
                    break;
                case 4:
                    dll.removeFirst();
                    break;
                case 5:
                    dll.removeLast();
                    break;
                case 6:
                    System.out.print("Posisi yang Dihapus : ");
                    int idx1 = sc.nextInt();
                    dll.remove(idx1);
                    break;
                case 7:
                    dll.print();
                    break;
                case 8:
                    System.out.print("Masukkan Data yang dicari : ");
                    int cari =sc.nextInt();
                    dll.findSeqSearch(cari);
                    break;
                case 9:
                    dll.bubleSort();
                    break;
            } 
        } while ( pilih != 10); 
    }
}
