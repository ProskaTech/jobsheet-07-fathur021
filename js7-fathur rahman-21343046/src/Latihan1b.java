/*
 * created by 21343046_fathur rahman
 */

import java.util.Scanner;


public class Latihan1b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda : ");
        String nama = in.nextLine();
        int jumlah = 0;

        while (jumlah < 10) {
            System.out.println(nama);
            jumlah++;
        }
    }
}
