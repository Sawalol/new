package PhoneBook;

import java.util.ArrayList;

public class PhoneBook {
    private ArrayList<Contact> contacts = new ArrayList<>();

    public ArrayList<Contact> getAllContact() {
        return contacts;
    }

    public void add(Contact contact) {
        contacts.add(contact);
    }

    public void del(int id) {
        contacts.remove(--id);
    }

    public Contact get(int id) {
        return contacts.get(--id);
    }

    public ArrayList<Contact> findByName(String name) {
        ArrayList<Contact> result = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                result.add(contact);
            }

        }
        return result;
    }

    public ArrayList<Contact> findByPhone(String phone) {
        ArrayList<Contact> result = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getName().equals(phone)) {
                result.add(contact);
            }

        }
        return result;
    }
}


