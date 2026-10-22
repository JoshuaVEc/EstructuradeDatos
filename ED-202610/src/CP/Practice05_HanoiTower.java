package CP;

public class Practice05_HanoiTower {

public static void resolverHanoi(int n, char origen, char destino, char aux){
    if(n==1){
        System.out.println("Mover disco 1 de "+ origen + " -a " +  destino);
        return ;
    }

    resolverHanoi(n-1,origen, aux, destino);

    System.out.println("Mover disco " + n +" de "+ origen + " a " + destino);

    resolverHanoi(n-1,aux,destino,origen);

}
public static void main(String[] args){
    resolverHanoi(5,'A','B','C');
}
}
