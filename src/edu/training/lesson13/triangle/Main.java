package edu.training.lesson13.triangle;

public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle();
        triangle1.foundSquare();
        triangle1.printSquare();

        Triangle triangle2 = new Triangle(12, 25, 20);
        triangle2.foundPerimeter();
        triangle2.printPerimeter();
    }
}
