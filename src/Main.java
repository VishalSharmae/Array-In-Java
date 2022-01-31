import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        printInstructions();

        boolean quit =false;
        int choice ;
        while (!quit){
            System.out.println("\nEnter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem(){
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
        System.out.println("Item Added!");
    }

    public static void modifyItem(){
        System.out.println("Please enter the item name: ");
        String CurrentItemName = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Please enter replacement item: ");
        String itemName = scanner.nextLine();
        groceryList.modifyGroceryItem(CurrentItemName,itemName);
    }

    public static void removeItem(){
        System.out.println("Please enter the item name: ");
        String itemName = scanner.nextLine();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemName);
    }

    public static void searchForItem(){
//        System.out.println("Please enter Item name: ");
//        String searchItem = scanner.nextLine();
//        if(groceryList.findItem(searchItem) != null ){
//            System.out.println("Found " + searchItem + " in the grocery list");
//        } else {
//            System.out.println(searchItem + " is not in the shopping list");
//        }
        System.out.println("Please enter item to search for: ");
        String searchName = scanner.nextLine();
        if (groceryList.onRecords(searchName)){
            System.out.println("Found " + searchName);
        } else {
            System.out.println(searchName + " not on records.");
        }
    }
}
