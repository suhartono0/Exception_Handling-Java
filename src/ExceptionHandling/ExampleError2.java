/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ExceptionHandling;
public class ExampleError2 {
    
    
    public static void main(String[] args){
        byte[] b = new byte[5];
        try {
            System.in.read(b);            
        }catch (java.Io.IOException e);
            System.out.println("Hasil: "+(char) b[0] +(char) b[1] +(char) b[2]);
        
    }
     
    //Terjadi Error pada baris "catch (java.io.IOException e);"
    //Cara penanganan error tersebut yaitu dengan cara mengganti ";"
    //Menjadi "{}"
    
    
}     
        
 
       