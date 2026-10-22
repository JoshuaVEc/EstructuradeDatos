package CP;

public class Practice05_HarmonicNumber {


    public static double getHarmonicNumber(double n, double k) {
    if(n==k){
        return 1/n;
    }
    return 1/k + getHarmonicNumber(n,k +1);
}
}



