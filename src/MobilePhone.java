import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContact;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContact = new ArrayList<Contact>();
    }

    public boolean addContact(Contact newContact){
        if (findContact(newContact.getName()) >= 0){
            System.out.println("Contact already exists!");
            return false;
        }
        myContact.add(newContact);
        System.out.println("Contact added successfully!");
        return true;
    }
    public void printContactList(){
        System.out.println("You have " + myContact.size() + " contacts in your Contact List.");
        for (int i = 0; i < myContact.size(); i++){
            System.out.println( (i+1) +". Name - " + myContact.get(i).getName() + "\nPhone Number = " + myContact.get(i).getContactNumber() + "\n");
        }
    }

    public boolean modifyContact(Contact existingContact, Contact newContact){
        if (findContact(existingContact.getName()) < 0){
            System.out.println(existingContact.getName() + ", contact doesn't exist!");
            return false;
        }
        myContact.set(findContact(existingContact), newContact);
        System.out.println("Contact successfully updated!");
        return true;
    }

    public boolean removeContact(Contact contact){
        if (findContact(contact) < 0){
            System.out.println(contact.getName() + ", contact does not exist!");
            return false;
        }
        myContact.remove(findContact(contact));
        System.out.println("Contact successfully deleted!");
        return true;
    }

    public int findContact(String contactName){
        for(int i = 0; i < this.myContact.size(); i++){
            Contact contact = this.myContact.get(i);
            if (contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    private int findContact(Contact contact){
        return this.myContact.indexOf(contact);
    }

    public String queryContact(Contact contact){
        if (findContact(contact) >= 0){
            return contact.getName();
        }
        System.out.println("Contact does not exist!");
        return null;
    }

    public Contact queryContact(String name){
        int position = findContact(name);
        if (position >= 0){
            return this.myContact.get(position);
        }
        return null;
    }
}
