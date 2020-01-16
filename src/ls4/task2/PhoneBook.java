package ls4.task2;

public class PhoneBook {

    PhoneEntry[] phoneBook;
    PhoneEntry[] resultList = new PhoneEntry[10];
    public PhoneBook() {

        phoneBook = new PhoneEntry[10];
        phoneBook[0] = new PhoneEntry("Artyom", "Odnkl", "(418) 665-1223");
        phoneBook[1] = new PhoneEntry("Dasha", "Uchitel", "(860) 399-3044");
        phoneBook[2] = new PhoneEntry("Anatoli", "Uchitel", "(815) 439-9271");
        phoneBook[3] = new PhoneEntry("Maxim", "sosed", "(312) 223-1937");
        phoneBook[4] = new PhoneEntry("Mama", "life", "(913) 883-2874");
        phoneBook[5] = new PhoneEntry("Babushka", "Nina", "(407) 123-4555");
    }
    public PhoneEntry[] search(String fName, String lName) {

        int i = 0;
        if (fName.equals("")) {
            for (int j = 0; j < phoneBook.length; j++) {
                if(phoneBook[j] != null) {
                    if (phoneBook[j].lastName.equals(lName)) {
                        resultList[i] = phoneBook[j];
                        i++;
                    }
                }
            }
        } else {
            for (int j = 0; j < phoneBook.length; j++) {
                if(phoneBook[j] != null) {
                    if (phoneBook[j].lastName.equals(lName) && phoneBook[j].firstName.equals(fName)) {
                        resultList[i] = phoneBook[j];
                        i++;
                    }
                }
            }
        }

        if(i == 0) {
            return null;
        } else {
            return resultList;
        }

    }


    public void add(String fName, String lName, String phone) {

        for (int i = 0; i < phoneBook.length; i++) {
            if (phoneBook[i] == null) {
                phoneBook[i] = new PhoneEntry(fName, lName, phone);
            }

            else {
                System.out.println("No room in phone book.");
            }
        }
    }
}