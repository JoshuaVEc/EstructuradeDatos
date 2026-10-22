package CP;

import java.lang.String;
public  class Practice05_Palindromo {


    static public void esPalindromo(String palindromo, String palabra , int n) {

        if(n<0){
            if(palindromo.equals(palabra)){
                System.out.println(" si es un palindromo");
            }else{
                System.out.println(" no es un palindromo");
            }

            return;
        }

        String nueva_texto = palabra + palindromo.charAt(n);

        esPalindromo(palindromo, nueva_texto, n-1);


}
    public static void main(String[] args){
        String palabra = "salome me molas";

        String palabra_ajustada = palabra.replaceAll(" ","");

        esPalindromo(palabra_ajustada, "",palabra_ajustada.length()-1);

    }
}

// esPalindromo("ABA","",3)
// ABA[2 , P=A , es Palindrome("ABA","A",1)   ,     ABA[1 , P=AB  , esPalindrome("ABA" , "AB , 0)  ,


