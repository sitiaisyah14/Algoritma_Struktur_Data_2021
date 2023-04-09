/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

/**
 *
 * @author WINDOWS 10
 */
import java.util.Scanner;
public class StackMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Buku st = new Buku(8);

        boolean ulang = true;
        while (ulang == true) {
            System.out.println("====================================");
            System.out.println("         MENU OPERASI STACK");
            System.out.println("====================================");
            System.out.println(" 1. Push \n 2. Pop \n 3. Peek \n 4. Print \n 5. selesai");
            System.out.print(" Pilih Menu : ");
            int plh = sc.nextInt();
            System.out.println("------------------------------------");
            
            switch (plh) {
                case 1:
                    System.out.print("Judul\t\t : ");
                    String judul = sc.next();
                    System.out.print("Nama Pengarang\t : ");
                    String nama = sc.next();
                    System.out.print("Tahun Terbit\t : ");
                    int tahun = sc.nextInt();
                    System.out.print("Jumlah Halaman\t : ");
                    int jml = sc.nextInt();
                    System.out.print("Harga\t\t : ");
                    int hrg = sc.nextInt();

                    Buku bk = new Buku(judul, nama, tahun, jml, hrg);
                    st.push(bk);
                    break;
                case 2:
                    st.pop();
                    System.out.println("------------------------------------");
                    break;
                case 3:
                    st.peek();
                    System.out.println("------------------------------------");
                    break;
                case 4:
                    st.print();
                    System.out.println("------------------------------------");
                    break;
                case 5:
                    System.out.println("           --- SELESAI ---");
                    System.out.println("------------------------------------");
                    ulang = false;
                    break;
            }
        }
    }
}
