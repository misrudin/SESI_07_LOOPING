/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesi7Driver;

/**
 *
 * @author riseloka
 */
public class GanjilFor {
    
    public static void main(String[] args) {
        System.out.println("Menampilkan Deret Bilangan Ganjil Dari 1 - 100 :");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
    
}
