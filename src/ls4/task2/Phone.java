package ls4.task2;


import java.util.Scanner;

public class Phone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String lastName;
        String firstName;

        int variableForCountArray;

        do {

            PhoneBook pb = new PhoneBook();
            PhoneEntry[] entry;

            entry = null;
            variableForCountArray = 0;


            System.out.print("Pleast enter the last name to search: ");
            lastName = input.nextLine();

            System.out.print("Please enter the first name to search: ");
            firstName = input.nextLine();

            entry = pb.search(firstName.toUpperCase(), lastName.toUpperCase());


            if (entry != null) {
                for(int i = 0; i < entry.length; i++) {
                    if(entry[i] != null) {
                        variableForCountArray++;
                    }
                }
                for(int index = 0; index < variableForCountArray; index++) {
                    System.out.println(entry[index].firstName + " " + entry[index].lastName + ": " + entry[index].phone);
                }
            }
            else if ("quit".equals(lastName)) {
                System.out.println("Good Bye!");
            }
            else {
                System.out.println("Name not found.");
            }
        } while (!"quit".equals(lastName));

    }
}