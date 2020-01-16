package ls3.task2;

public class Person {

    String name = "Smith";
    String surname = "Johnson ";
    int age = 55 ;

    public String getName (){return "a. Name = " + name;}
    public String getSurname (){
        return "b. Surname = " + surname;
    }
    public String getAll (){
        return "c. All = " + name+ " " +  surname + " " + age;
    }
}
