package home.work;

public class Test2 {
    private int firstNumber;
    private int secondNumber;

    public Test2() {
        firstNumber = 12;
        secondNumber = 14;
    }

    public Test2(int _firstNumber, int _secondNumber) {
        setFirstNumber(_firstNumber);

        setSecondNumber(_secondNumber);
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(int _firstNumber) {
        firstNumber =_firstNumber;
    }

    public void setSecondNumber(int _secondNumber) {
        secondNumber = _secondNumber;
    }
}
