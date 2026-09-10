package EI;

import TDAs.DoublyLinkedList;

public class EI03_InventaryController {
    EI03_Inventary inventary=new EI03_Inventary();
    EI03_InventaryController(){}

    public EI03_Inventary getInventary(){
        return inventary;
    }
    public EI03_Item getFirstItem(){
        return inventary.getList().first();
    }
    public EI03_Item getLastItem(){
        return inventary.getList().last();
    }
    public EI03_Item getNextItem(){
       while(true){
           return inventary.getList().
       }

    }
}
