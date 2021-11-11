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
public class GenapWhile {
    
    public static void main(String[] args) {
        System.out.println("Menampilkan Deret Bilangan Genap Dari 1 - 200 :");
        int i = 1;
        while (i <= 200) {            
            if(i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
    
}
