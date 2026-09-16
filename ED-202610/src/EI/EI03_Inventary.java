package EI;

import TDAs.DoublyLinkedList;
import TDAs.Node;

public class EI03_Inventary {

    DoublyLinkedList<EI03_Item>  list=new DoublyLinkedList<>();
    public EI03_Inventary(){}

    public DoublyLinkedList<EI03_Item> getList(){
        return list;
    }

    public int getSize(){
        return list.size();
    }

}
