package lesson_1_OOP;

public class Box extends Shape {

    public double a;

    public Box(String name, double a) {
        super(name);
        this.a = a;
    }

    @Override
    public double area() {
        return a * a;
    }

    @Override
    public String toString() {
        return super.toString() +
                "a=" + a +
                '}';
    }
}
