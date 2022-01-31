import java.util.ArrayList;

public class GroceryList {


    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list."); // to get the no. of elements in Arraylist pass .size() method
        for (int i = 0; i < groceryList.size(); i++){
            System.out.println((i + 1) + ". " + groceryList.get(i)); // .get() method to access a particular element
        }
    }

    public void modifyGroceryItem(String existingItem, String newItem){
        if (findItem(existingItem) >= 0){
            modifyGroceryItem(findItem(existingItem), newItem);
        }
    }

    private void modifyGroceryItem( int position, String newItem){
        groceryList.set(position, newItem);  // .set() method to set the values of pre-existed element
        System.out.println("Grocery Item " + (position + 1) + " has been updated.");
    }

    public void removeGroceryItem(String item){
        int position = findItem(item);
        if (position >= 0){
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position){
        String item = groceryList.get(position);
        groceryList.remove(position); // .remove() method to remove the element from the list
        System.out.println("Grocery Item " + (position + 1) +". " + item + " has been deleted.");
    }

    // Removed and edited the code for better programming
//    public String findItem(String searchItem){
//        boolean exists = groceryList.contains(searchItem);
//
//        int position = groceryList.indexOf(searchItem);
//        if (position >= 0){
//            return groceryList.get(position);
//        }
//        return null;
//    }

    private int findItem(String searchItem){
        return groceryList.indexOf(searchItem);
    }

    public boolean onRecords(String searchItem){
        int position = findItem(searchItem);
        if (position >= 0){
            return true;
        }
        return false;
    }

}
