package lesson_1_OOP;

public abstract class Shape {
    private String name;

    //Метод вычесления площадь фигуры
    public abstract double area();

    public Shape(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
