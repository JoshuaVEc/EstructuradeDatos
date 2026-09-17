package EI;

import java.util.Scanner;

public class EI03_InventaryMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        EI03_InventaryController inventary = new EI03_InventaryController();
        EI03_Item item = new EI03_Item();

        EI03_Tool tool1 = new EI03_Tool("Hammer", "striking");
        inventary.addItem(tool1);
        EI03_Consumable consumable1 = new EI03_Consumable("Water", "drinking");
        inventary.addItem(consumable1);
        EI03_Tool tool2 = new EI03_Tool("Sword", "swinging");
        inventary.addItem(tool2);

        do {
            printInterface();
            String option1 = "";
            int option = input.nextInt();
            input.nextLine();
            if (option == 5) {
                break;
            }

            switch (option) {
                case 1: {
                    printInventory(inventary);
                    break;
                }
                case 2: {
                    item = inventary.getFirstItem();
                    if (item == null) {
                        System.out.println("Inventory is empty.");
                        break;
                    }
                    System.out.println("Item: " + item.getName() + " Type: " + item.getType());
                    do {
                        System.out.println("Next ? (y/n) ");
                        option1 = input.nextLine();

                        if (option1.equalsIgnoreCase("y")) {
                            EI03_Item nextItem = inventary.getNextItem();
                            if (nextItem == item) {
                                System.out.println("End of inventory reached.");
                            } else {
                                item = nextItem;
                                System.out.println("Item: " + item.getName() + " Type: " + item.getType());
                            }
                        } else {
                            System.out.println("Selected Object: " + item.getName());
                            break;
                        }
                    } while (option1.equalsIgnoreCase("y"));
                    break;
                }
                case 3: {
                    item = inventary.getFirstItem();
                    if (item == null) {
                        System.out.println("Inventory is empty.");
                        break;
                    }
                    System.out.println("Item: " + item.getName() + " Type: " + item.getType());
                    do {
                        System.out.println("Previous ? (y/n) ");
                        option1 = input.nextLine();

                        if (option1.equalsIgnoreCase("y")) {
                            EI03_Item prevItem = inventary.getPrevItem();
                            if (prevItem == item) {
                                System.out.println("Beginning of inventory reached.");
                            } else {
                                item = prevItem;
                                System.out.println("Item: " + item.getName() + " Type: " + item.getType());
                            }
                        } else {
                            System.out.println("Selected Object: " + item.getName());
                            break;
                        }
                    } while (option1.equalsIgnoreCase("y"));
                    break;
                }

                    case 4: {
                        EI03_Item currentItem = inventary.getFirstItem();

                        if (currentItem == null) {
                            System.out.println("No item selected or inventory is empty.");
                            break;
                        }

                        if (currentItem instanceof EI03_Tool) {
                            EI03_Tool tool = (EI03_Tool) currentItem;
                            System.out.println(">>> You use the " + tool.getName() + " for " + tool.getAction() + "!");

                        } else if (currentItem instanceof EI03_Consumable) {
                            EI03_Consumable consumable = (EI03_Consumable) currentItem;
                            System.out.println(">>> You consume the " + consumable.getName() + " for " + consumable.getAttribute() + "!");

                        } else {
                            System.out.println(">>> You use the " + currentItem.getName() + ".");
                        }
                        break;
                    }

                case 5:
                    System.out.println("Leaving Inventory.");
                    break;
                default: {
                    System.out.println("Invalid option");
                }
            }
        } while (true);
        input.close();
    }

    public static void printInterface() {
        System.out.println("Inventary Main Menu: ");
        System.out.println("--------------------------------");
        System.out.println("1. Show Inventory");
        System.out.println("2. Next");
        System.out.println("3. Back");
        System.out.println("4. Use");
        System.out.println("5. Exit");
    }

    public static void printInventory(EI03_InventaryController inventary) {
        int inventarySize = inventary.getInventarySize();
        if (inventarySize == 0) {
            System.out.println("No inventory available");
        } else {
            System.out.println(inventary.getFirstItem().getName() + " Type: " + inventary.getFirstItem().getType());
            int counter = 0;

            while (counter < inventarySize - 1) {
                EI03_Item item = inventary.getNextItem();
                System.out.println(item.getName() + " Type: " + item.getType());
                counter++;
            }


            refillInventary(inventary, counter);
        }
    }

    public static void refillInventary(EI03_InventaryController inventary, int counter) {
        int counter1 = 0;
        while (counter1 < counter) {
            inventary.getPrevItem();
            counter1++;
        }
    }
}