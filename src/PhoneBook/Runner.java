package PhoneBook;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {




    public static void main(String[] args) {
        ConsoleDisplay consoleDisplay = new ConsoleDisplay();
        PhoneBook phoneBook = new PhoneBook();
        ConsoleDisplay.printMenu();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            ConsoleDisplay.printMenu();
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();

                if (input == ActionType.EXIT.getIndex()) {
                    System.out.println("Close Phone Book!!!");
                    break;
                } else if (input == ActionType.ADD.getIndex()) {
                    System.out.println("Enter Name: ");
                    String name = scanner.next();
                    System.out.println("Enter Phone: ");
                    String phone = scanner.next();
                    System.out.println("Enter Birthday: ");
                    String birthday = scanner.next();
                    Contact contact = new Contact(name, phone, birthday);

                    phoneBook.add(contact);
                    ConsoleDisplay.printContacts(phoneBook.getAllContact());

                }
                else if (input == ActionType.DELEATE.getIndex()){
                    System.out.println("Enter id:");
                    int id = scanner.nextInt();
                    phoneBook.del(id);
                }

                else if (input == ActionType.UPDATE.getIndex()) {
                    System.out.println("ENTER ID :");
                    int id = scanner.nextInt();
                    ConsoleDisplay.printContact(phoneBook.get(id));
                }
            else if(input == ActionType.SHOW.getIndex()){
                System.out.println("Find by Name:");
                String name = scanner.next();
                phoneBook.findByName(name);
                ArrayList<Contact> filteredContacts = phoneBook.findByName(name);
                ConsoleDisplay.printContacts(filteredContacts);
            } else if(input == ActionType.FINDBYNAME.getIndex()){
                    System.out.println("Find by Num:");
                    String phone = scanner.next();
                    phoneBook.findByPhone(phone);
                    ArrayList<Contact> filteredContacts = phoneBook.findByPhone(phone);
                    ConsoleDisplay.printContacts(filteredContacts);
                }
            } else {
                System.out.println("looser!");
                break;
            }
        }
    }
}
