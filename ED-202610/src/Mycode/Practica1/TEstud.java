package Mycode.Practica1;





import java.util.ArrayList;


public class TEstud {
    String name;
    int age;
    ArrayList<Integer>notas = new ArrayList<>(5);

    public TEstud(String name, int age, ArrayList<Integer> notas){
        this.name=name;
        this.age=age;
        this.notas=notas;
    }
    public TEstud(){

    }

    public ArrayList<Integer> getNotas(){
        return notas;

    }





}
