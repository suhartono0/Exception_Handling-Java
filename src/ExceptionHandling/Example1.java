package ExceptionHandling;

public class Example1 {
    
    public static void main(String[] args){
        try {
            System.out.println("Masukan Kata  :");
            char n = (char) System.in.read();
            System.out.println("Hasil : " + n );
        } catch(Exception e) {
            
        }
    }    

    //Jika sudah di pindahlan ke statement try...catch 
    //Hasil codingannya akan seperti berikut : 
    //Jika user memasukan kata atau angka maka
    //hasilnya akan meng-output angka atau kata yang berada di depan

    //Cara Kerja : 
    //Misal user meng input kata "Suhartono"
    //Hasilnya akan meng-output "S" saja


}







