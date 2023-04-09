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
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StrukBelanja st = new StrukBelanja(9);

        StrukBelanja st1 = new StrukBelanja ("ID2345619", "01/01/2021", 6, 140000 );
        StrukBelanja st2 = new StrukBelanja ("ID8237272", "14/01/2021", 9, 875000 );
        StrukBelanja st3 = new StrukBelanja ("ID6382926", "20/01/2021", 2, 110000 );
        StrukBelanja st4 = new StrukBelanja ("ID9273647", "30/01/2021", 4, 352000 );
        StrukBelanja st5 = new StrukBelanja ("ID8829482", "06/02/2021", 7, 621000 );
        StrukBelanja st6 = new StrukBelanja ("ID7390394", "19/02/2021", 1, 87000 );
        StrukBelanja st7 = new StrukBelanja ("ID1028374", "02/03/2021", 2, 145000 );
        StrukBelanja st8 = new StrukBelanja ("ID6120937", "28/03/2021", 5, 350000 );
        
        st.push(st1);
        st.push(st2);
        st.push(st3);
        st.push(st4);
        st.push(st5);
        st.push(st6);
        st.push(st7);
        st.push(st8);
        
        boolean ulang = true;
        while (ulang == true) {
            System.out.println("====================================");
            System.out.println("         MENU OPERASI STACK");
            System.out.println("====================================");
            System.out.println(" 1. Tambah Struk \n 2. Ambil Struk \n 3. Lihat Struk Teratas "
                    + "\n 4. Tampilkan Struk \n 5. Keluar");
            System.out.print(" Pilih Menu : ");
            int plh = sc.nextInt();
            System.out.println("----------------------------------------");
            
            switch (plh) {
                case 1:
                    System.out.print("No Transaksi\t : ");
                    String noTrans = sc.next();
                    System.out.print("Tanggal Pembelian\t : ");
                    String tanggal = sc.next();
                    System.out.print("Jumlah Barang\t : ");
                    int jumlah = sc.nextInt();
                    System.out.print("Total Bayar\t : ");
                    int total = sc.nextInt();
                    

                    StrukBelanja stt = new StrukBelanja(noTrans, tanggal, jumlah, total);
                    st.push(stt);
                    break;
                case 2:
                    st.pop();
                    System.out.println("----------------------------------------");
                    break;
                case 3:
                    st.peek();
                    System.out.println("----------------------------------------");
                    break;
                case 4:
                    st.print();
                    System.out.println("----------------------------------------");
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
