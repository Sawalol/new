package PhoneBook;

public class Contact {
    private String Name;
    private static String Phone;
    private String Birthday;


    public Contact(String name, String phone, String birthday) {
        Name = name;
        Phone = phone;
        Birthday = birthday;
    }

    public String getName() {
        return Name;
    }

    public static void setName(String name) {
        name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public static void setPhone(String phone) {
        phone = phone;
    }

    public String getBirthday() {
        return Birthday;
    }

    public static void setBirthday(String birthday) {
        birthday = birthday;
    }
}
