package home.work;

public class Triangle {
    private int firstLine;
    private int secondLine;
    private int thirdLine;

    public Triangle() {
        firstLine = 10;
        secondLine = 10;
        thirdLine = 10;
    }

    public Triangle(int firstLine, int secondLine, int thirdLine) {
        this.firstLine = firstLine;
        this.secondLine = secondLine;
        this.thirdLine = thirdLine;
    }

    public int getFirstLine() {
        return firstLine;
    }

    public int getSecondLine() {
        return secondLine;
    }

    public int getThirdLine() {
        return thirdLine;
    }

    public void findPerimeter() {
        int perimeter = getFirstLine() + getSecondLine() + getThirdLine();
        System.out.println("Периметр данного треугольника равен: " + perimeter);
    }

    public void findSquare() {
        int semiPerimeter = (getFirstLine() + getSecondLine() + getThirdLine()) / 2;
        int square = (int) Math.sqrt(semiPerimeter * (semiPerimeter - getFirstLine()) * (semiPerimeter - getSecondLine()) * (semiPerimeter - getThirdLine()));

        System.out.println("Площадь данного треугольника равна: " + square);
    }

    public void findCenterOfMedian() {
        int centerX = (x1 + x2 + x3) / 3;
        int centerY = (y1 + y2 + y3) / 3;

        System.out.println("Координаты центра пересечения медиан: (" + centerX + ":" + centerY + ")" );
    }
}
