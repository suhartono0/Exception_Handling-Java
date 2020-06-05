/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ExceptionHandling;

/**
 *
 * @author Asus
 */
public class ExampleError3 {

    public static void main (String[] args){
        byte[] b = new byte[5];
        System.out.println("Input Bilangan Bulat : ");
        try{
            System.in.read(b);
        }catch(java.io.IOException);
        int N = Integer.valueOf(b).intValue;
            System.out.println("Hasil : " + (N+2));
    }
        //Terjadi Error pada baris "catch(java.io.IOException);", karena
        //setelah catch(...) harusnya di tambah "{}" bukan ";"
    
    
    
}

