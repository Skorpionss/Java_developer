package lesson_1_OOP;

public class Main {
    public static void main(String[] args) {
        Person myPerson = new Person.Builder()
                .firstName("Pavel")
                .lastName("Kozlov")
                .middleName("Victorovich")
                .counter("RU")
                .build();
     }
}
