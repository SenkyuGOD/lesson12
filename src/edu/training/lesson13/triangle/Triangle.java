package edu.training.lesson13.triangle;

public class Triangle {
    private int line1;
    private int line2;
    private int line3;
    private int perimeter;
    private double square;

    public Triangle() {
        setLine1(10);
        setLine2(10);
        setLine3(10);
    }

    public Triangle(int line1, int line2, int line3) {
        setLine1(line1);
        setLine2(line2);
        setLine3(line3);
    }

    public int getLine1() {
        return line1;
    }

    public void setLine1(int line1) {
        this.line1 = line1;
    }

    public int getLine2() {
        return line2;
    }

    public void setLine2(int line2) {
        this.line2 = line2;
    }

    public int getLine3() {
        return line3;
    }

    public void setLine3(int line3) {
        this.line3 = line3;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public void foundPerimeter() {
        setPerimeter(getLine1() + getLine2() + getLine3());
    }

    public void printPerimeter() {
        System.out.println("Периметр данного треугольника равен: " + getPerimeter());
    }

    public void foundSquare() {
        int p = (getLine1() + getLine2() + getLine3()) / 2;

        double square = Math.sqrt(p * (p - getLine1()) * (p - getLine2()) * (p - getLine3()));
        this.square = square;
    }

    public void printSquare() {
        System.out.println("Площадь данного треугольника:" + getSquare());
    }


    public int[] foundCenterOfMedian(int x1, int y1, int x2, int y2, int x3, int y3) {
        int x = (x1 + x2 + x3) / 3;
        int y = (y1 + y2 + y3) / 3;
        int[] centerOfMedian = new int[2];
        centerOfMedian[0] = x;
        centerOfMedian[1] = y;
        return centerOfMedian;
    }
}
