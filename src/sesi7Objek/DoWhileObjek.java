/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesi7Objek;

/**
 *
 * @author riseloka
 */
public class DoWhileObjek {

    public void ganjilGenap(int jumlahDeret, int type) {
        final String jenisBilangan = type == 1
                ? "Ganjil" : "Genap";
        
        System.out.println("Menampilkan deret bilangan " + jenisBilangan + " dari 1 sampai " + jumlahDeret);
        
        for (int i = 1; i <= jumlahDeret; i++) {
            if (type == 1) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            } else {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
