package EI;

import TDAs.DoublyLinkedList;

public class EI03_InventaryController {
    EI03_Inventary inventary=new EI03_Inventary();
    EI03_InventaryController(){}
    EI03_Inventary backupInventary=new EI03_Inventary();
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

        EI03_Item prev=inventary.getList().removeFirst();
        EI03_Item next=inventary.getList().first();
        backupInventary.getList().addLast(prev);
        return next;
    }
    public EI03_Item getPrevItem() {

        EI03_Item prev = backupInventary.getList().removeLast();
        inventary.getList().addFirst(prev);
        return prev;

    }

    public void useItem(){
        EI03_Item item = inventary.getList().first();
        if(item instanceof EI03_Tool){
            EI03_Tool tool=(EI03_Tool)item;
            tool.getAction();
        } else if(item instanceof EI03_Item){
            EI03_Consumable consumable = (EI03_Consumable) item;
            consumable.getAttribute();
        }
    }
}
