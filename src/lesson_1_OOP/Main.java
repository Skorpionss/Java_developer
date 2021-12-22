package lesson_1_OOP;

public class Main {
    public static void main(String[] args) {
        Person myPerson = new Person.Builder()
                .firstName("Pavel")
                .lastName("Kozlov")
                .middleName("Victorovich")
                .counter("RU")
                .build();


        Shape[] shapes = {
                new Circle("Circle", 10),
                new Box("Box", 5),
                new Triangle("Triangle", 1, 2, 3)
                };
        double summa = 0;
        for (Shape s:shapes) {
            System.out.println(s);
            summa += s.area();
        }
        System.out.println("Summa " + summa);
    }
}
