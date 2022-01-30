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

    public void modifyGroceryItem( int position, String newItem){
        groceryList.set(position, newItem);  // .set() method to set the values of pre-existed element
        System.out.println("Grocery Item " + (position + 1) + " has been updated.");
    }

    public void removeGroceryItem(int position){
        String item = groceryList.get(position);
        groceryList.remove(position); // .remove() method to remove the element from the list
        System.out.println("Grocery Item " + (position + 1) +". " + item + " has been deleted.");
    }

    public String findItem(String searchItem){
//        boolean exists = groceryList.contains(searchItem);

        int position = groceryList.indexOf(searchItem);
        if (position >= 0){
            return groceryList.get(position);
        }
        return null;
    }

}
