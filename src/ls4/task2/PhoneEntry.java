package ls4.task2;

public class PhoneEntry {
    String firstName;
    String lastName;
    String phone;


    public PhoneEntry(String fName, String lName, String p) {
        firstName = fName.toUpperCase();
        lastName = lName.toUpperCase();
        phone = p;
    }
}