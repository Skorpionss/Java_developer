package lesson_1_OOP;

public class Triangle extends Shape {

    public double a, b, c;

    public Triangle(String name, double a, double b, double c) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double p;
        p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));


    }

    @Override
    public String toString() {
        return super.toString() +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

}
