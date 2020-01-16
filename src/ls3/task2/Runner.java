package ls3.task2;

public class Runner {
    public static void main(String[] args) {
        Person myNewPerson = new Person();
         String name = myNewPerson.getName();
         String surname = myNewPerson.getSurname();
         String all = myNewPerson.getAll();

         System.out.println(name);
         System.out.println(surname);
         System.out.println(all);
//         System.out.println(combiner(name, surname, all));
    }
//    public static String combiner(String a, String b, String c) {
//        return a + b + c ;
//    }
}
