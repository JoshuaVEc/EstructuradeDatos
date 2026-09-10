package EI;

public class EI03_Tool extends EI03_Item{
    String action;
    EI03_Tool(String name, String action){
        this.name=name;
        this.type="Tool";
        this.action=action;
    }


    public String getAction(){
        return action;
    }
}
