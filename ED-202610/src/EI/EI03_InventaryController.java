package EI;

import TDAs.DoublyLinkedList;

public class EI03_InventaryController {
    private EI03_Inventary inventary = new EI03_Inventary();
    private EI03_Inventary backupInventary = new EI03_Inventary();

    public EI03_InventaryController() {}

    public EI03_Inventary getInventary() {
        return inventary;
    }

    public EI03_Item getFirstItem() {
        if (inventary.getSize() == 0) return null;
        return inventary.getList().first();
    }

    public EI03_Item getLastItem() {
        if (inventary.getSize() == 0) return null;
        return inventary.getList().last();
    }

    public EI03_Item getNextItem() {

        if (inventary.getSize() <= 1) {
            return getFirstItem();
        }
        EI03_Item prev = inventary.getList().removeFirst();
        backupInventary.getList().addFirst(prev);
        return inventary.getList().first();
    }

    public EI03_Item getPrevItem() {

        if (backupInventary.getSize() == 0) {
            return getFirstItem();
        }
        EI03_Item prev = backupInventary.getList().removeFirst();
        inventary.getList().addFirst(prev);
        return inventary.getList().first();
    }

    public int getInventarySize() {
        return inventary.getSize();
    }

    public void addItem(EI03_Item item) {
        inventary.getList().addFirst(item);
    }

    public void useItem() {
        if (inventary.getSize() == 0) {
            System.out.println("Nothing to use.");
            return;
        }

        EI03_Item item = inventary.getList().first();

        if (item instanceof EI03_Tool) {
            EI03_Tool tool = (EI03_Tool) item;
            tool.getAction();
        } else if (item instanceof EI03_Consumable) {
            EI03_Consumable consumable = (EI03_Consumable) item;
            consumable.getAttribute();
        }
    }
}