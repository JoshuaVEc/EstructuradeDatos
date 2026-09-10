package EI;

import TDAs.DoublyLinkedList;

public class EI03_Inventary {
    int size=8;
    DoublyLinkedList<EI03_Item>  list=new DoublyLinkedList<>();
    public EI03_Inventary(){}

    public DoublyLinkedList<EI03_Item> getList(){
        return list;
    }
}
