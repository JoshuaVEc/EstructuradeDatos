package CP;

import java.util.Scanner;

public class Practica05_HarmonicNumber {



public static double getHarmonicNumber(int n,double k,double suma){
    if(n==0 || k==0){
        return -1;
    }
    if(k==n){
        suma+=1/k;
        return suma;
    }else {
        suma+=1/k;
        k++;
        return getHarmonicNumber(n,k,suma);
    }


}
static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    double resultado=getHarmonicNumber(n,1,0);
    System.out.println(resultado);
    sc.close();
}
}

