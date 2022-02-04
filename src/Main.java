import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("8894027988");

    public static void main(String[] args) {

        boolean flag = false;
        startPhone();
        printActions();

        while(!flag){
            System.out.println("\nEnter Action: (6 to show the options)");
            int check = scanner.nextInt();
            scanner.nextLine();
            switch (check){
                case 0:
                    System.out.println("\nShutting down.......");
                    flag = true;
                    break;
                case 1:
                    mobilePhone.printContactList();
                    break;
                case 2:
                    addContactList();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
                default:
                    System.out.println("Enter valid Action!");
            }
        }

    }

    private static void startPhone(){
        System.out.println("Starting phone.......");
    }

    private static void printActions(){
        System.out.println("\nAvailable actions\npress");
        System.out.println("0 - to shutdown\n" +
                           "1 - to print contacts\n2 - to add a new contact\n" +
                           "3 - to update an existing contact\n" +
                           "4 - to remove an existing contact\n" +
                           "5 - query if a searched contact exists\n" +
                           "6 - to print the list of available actions");
        System.out.println("Choose your action: ");
    }

    public static void addContactList(){
        System.out.println("Enter Contact Name : ");
        String name = scanner.nextLine();
        System.out.println("Enter contact phone number :");
        String phoneNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phoneNumber);
        if(mobilePhone.addContact(newContact)){
            System.out.println("New contact added: name = " + name + ", phone = " + phoneNumber);
        }else{
            System.out.println("Cannot add new contact, " + name + " already in your contact list.");
        }
    }
    
    public static void updateContact(){
        System.out.println("Enter existing ContactName: ");
        String existingContactName = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(existingContactName);
        if (existingContact == null){
            System.out.println("Contact not found");
            return;
        }else {
            System.out.println("Enter new contact name: ");
            String newName = scanner.nextLine();
            System.out.println("Enter new contact phone number: ");
            String newNumber = scanner.nextLine();
            Contact newContact = Contact.createContact(newName, newNumber);
            mobilePhone.modifyContact(existingContact, newContact);
            System.out.println("Contact list updated!");
        }
    }

    public static void removeContact(){
        System.out.println("Enter existing ContactName: ");
        String existingContactName = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(existingContactName);
        if (existingContact == null){
            System.out.println("Contact not found");
            return;
        }else {
            mobilePhone.removeContact(existingContact);
            System.out.println("Contact removed successfully!");
        }
    }

    public static void queryContact(){
        System.out.println("Enter existing ContactName: ");
        String existingContactName = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(existingContactName);
        if (existingContact == null){
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Contact found!");
        System.out.println("Name : " +  existingContact.getName() + " phone number: " + existingContact.getContactNumber());

    }
}
