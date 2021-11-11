/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesi7Driver;

import java.util.Scanner;
import sesi7Objek.DoWhileObjek;

/**
 *
 * @author riseloka
 */
public class DimanisDoWhile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DoWhileObjek obj = new DoWhileObjek();
        int ulang = 1;

        do {
            System.out.println("Silahkan masukan jumlah deret bilangan: ");
            int jumlahDeret = input.nextInt();
            input.nextLine();
            
            System.out.println("Bilangan apa yang ingin anda tampilkan?\n(1)-> GANJIL\n(2)-> GENAP:");
            int type = input.nextInt();

            obj.ganjilGenap(jumlahDeret, type);
            
            input.nextLine();
            System.out.println("Mau di ulang ?\n(1)-> Ya\n(2)-> Tidak ");
            ulang = input.nextInt();
        } while (ulang == 1);
    }

}
