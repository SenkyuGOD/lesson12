package home.work;

public class DecimalCounter {
    private int minValue;
    private int maxValue;
    private int currentValue;

    public DecimalCounter() {
        this.minValue = 0;
        this.maxValue = 10;
        this.currentValue = 0;

    }

    public DecimalCounter (int minValue, int maxValue) {
        this.minValue = minValue;
        this.maxValue =maxValue;
        this.currentValue = minValue;
    }

    public void increment() {
        if(currentValue < maxValue) {
            currentValue++;
        } else {
            System.out.println("Счетчик достиг максимального значения");
        }
    }

    public void decrement() {
        if (currentValue > minValue) {
            currentValue--;
        } else {
            System.out.println("Счётчик достиг минимального значения");
        }
    }

    public int getCurrentValue() {
        return currentValue;
    }
}
