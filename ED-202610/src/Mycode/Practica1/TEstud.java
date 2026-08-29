package Mycode.Practica1;



import java.util.ArrayList;

public class TEstud {
    private String name;
    private int age;
    private ArrayList<Integer>notas;
    private float promedio=0;
    public TEstud(String name, int age){
        this.name=name;
        this.age=age;
    }

    String getName(){
        return name;
    }
    int getAge(){
        return age;

    }
    void adicionarNota(int nota){
        notas.add(nota);

    }
    float getPromedio(){
        int sum=0;
        for (int i=0;i<notas.size();i++) sum += notas.get(i);
        promedio=sum/notas.size();
        return promedio;
    }

}
