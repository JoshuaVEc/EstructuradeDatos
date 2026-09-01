package CP;





import java.util.ArrayList;


public class Practice01_TEstud {
    String name;
    int age;
    ArrayList<Integer>notas = new ArrayList<>(5);

    public Practice01_TEstud(String name, int age, ArrayList<Integer> notas){
        this.name=name;
        this.age=age;
        this.notas=notas;
    }
    public Practice01_TEstud(){

    }

    public ArrayList<Integer> getNotas(){
        return notas;

    }
    public int getPromedio(){
        int suma;
        int promedio;
        suma= notas.get(0)+
                notas.get(1)+
                notas.get(2)+
                notas.get(3)+
                notas.get(4);
        promedio= suma /5;
        return promedio;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }





}
