package EI;

public class EI03_Item {
    String name;
    String type;
    EI03_Item(String name,String type){
        this.name=name;
        this.type=type;
    }
    EI03_Item(){}
    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
}
