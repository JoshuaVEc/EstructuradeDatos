package EI;

public class EI03_Consumable extends EI03_Item {
    String attribute;
    public EI03_Consumable(String name,String attribute){
        this.name=name;
        this.attribute=attribute;
        this.type="Consumable";
    }
    public String getAttribute(){
        return attribute;
    }
}
