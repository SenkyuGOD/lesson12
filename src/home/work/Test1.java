package home.work;

public class Test1 {
    private int number1;

    private int number2;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int num1) {
        number1 = num1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int num2) {
        number2 = num2;
    }

    public void changeNumbers(int num1, int num2) {
        setNumber1(num1);

        setNumber2(num2);
    }


    public void printSum() {
        System.out.println(sumOfNum());
    }

    public int sumOfNum() {
        int sum = 0;

        sum = getNumber1() + getNumber2();

        return sum;
    }

    public void maxNum() {
        int maxNum = Math.max(getNumber1(), getNumber2());

        System.out.println("Максимальное число: " + maxNum);
    }

}
