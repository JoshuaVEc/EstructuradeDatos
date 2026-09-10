package EI;

import TDAs.DoublyLinkedList;

import java.util.Scanner;

public class EI03_InventaryMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        EI03_InventaryController inventary=new EI03_InventaryController();
        do {
            printInterface();

            int option = input.nextInt();
            input.nextLine();
            if (option == 5) {
                break;
            }
            switch (option) {
                case 1: {


                }
                case 2: {

                    }
                case 3: {
                }
                case 4: {

                }
                case 5: {

                }
                default:{
                    System.out.println("Invalid option");
                }
            }

        }while(true);
    }
    public  static void printInterface(){
        System.out.println("Inventary Main Menu: ");
        System.out.println("--------------------------------");
        System.out.println("1. Show Inventory");
        System.out.println("2. Next");
        System.out.println("3. Back");
        System.out.println("4. Use");


    }
    public static void printInventory(EI03_InventaryController inventary){
        System.out.println("1. " + inventary.getFirstItem().getName()+" Type: "+ inventary.getFirstItem().getType());
        int counter=2;
        do {
            EI03_Item item = inventary.getNextItem();
            System.out.println(counter + ". "+ item.getName() +" Type: "+ item.getType());

        }while(inventary.getFirstItem()!=null);

    }
}
