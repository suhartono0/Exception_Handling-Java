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
public class Example3 {
    
    
    public static void main (String[] args){
        byte[] b = new byte[5];
        System.out.print("Masukan Bilangan Bulat : ");
        try{
            System.in.read(b);
            String c = new String(b).trim();
            int N = Integer.valueOf(c);
            System.out.println("Hasil : "+(N+2));
        }
        catch (java.io.IOException e){
            System.err.println(e);
        }
    }
    
    //Maka tampilan codingannya sepeti ini jika sudah di benarkan
    //jika user memasukan inputan 10 maka outputnya akan menjadi 12
    //karena angka yang diinput akan di tambah 2
    
    
    
    
    
    
    
    
    
    
}
