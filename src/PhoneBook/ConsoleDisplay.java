package PhoneBook;

import java.util.ArrayList;

public class ConsoleDisplay {
    public static void printMenu() {

        System.out.println(String.format("%s - ADD; %s - DELETE ;  %s - Update ; %s - SHOW ; %s - FINDBYNAME ; %s - EXIT ; ",
                ActionType.ADD.getIndex(), ActionType.DELEATE.getIndex(), ActionType.UPDATE.getIndex(), ActionType.SHOW.getIndex(),
                ActionType.FINDBYNAME.getIndex(),  ActionType.EXIT.getIndex()));

//        System.out.println(ActionType.ADD.getIndex() "1-Add ;" + ActionType.DELETE.getIndex() +
//                " 2 - DELETE;" +
//                " 3 - Update;" +
//                " 4 - SHOW;" +
//                " 5 - FINDBYNAME;" +
//                " 6 - FIND BY NUM;" +
//                " 0 - EXIT");

    }
    public static void printContacts(ArrayList<Contact> contacts){
        System.out.println("Contacts: ");
        if (contacts.size()== 0) {
            System.out.println("NO CONTACTS FOUND ");
        }
        else{
        int index = 1;
        for (Contact contact : contacts) {
            System.out.println("id:" + index++);
            System.out.println(contact.getName());
            System.out.println(contact.getPhone());
            System.out.println("----------");
        }
        }
    }

    public static void printContact(Contact contact) {
        System.out.println("CONTACT: ");
        System.out.println(contact.getName());
        System.out.println(contact.getPhone());
        System.out.println(contact.getBirthday());
        System.out.println("----------");


    }
}
