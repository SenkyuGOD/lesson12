package edu.training.lesson13.decimal_counter;

public class DecimalCounter {
    private int minValue;
    private int maxValue;
    private int currentValue;

    public DecimalCounter() {
        setMinValue(0);
        setMaxValue(10);
        setCurrentValue(0);
    }

    public DecimalCounter(int minValue, int maxValue, int currentValue) {
        setMinValue(minValue);
        setMaxValue(maxValue);
        setCurrentValue(currentValue);
    }

    public int getMinValue() {
        return minValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(int currentValue) {
        this.currentValue = currentValue;
    }

    public boolean checkCurrentValueToMax() {
        if (getCurrentValue() == getMaxValue()) {
            return false;
        }
        return true;
    }

    public boolean checkCurrentValueToMin() {
        if (getCurrentValue() == getMinValue()) {
            return false;
        }
        return true;
    }

    public void increment() {
        if (checkCurrentValueToMax()) {
            setCurrentValue(getCurrentValue() + 1);
        }
    }

    public void decrement(){
        if (checkCurrentValueToMin()) {
            setCurrentValue(getCurrentValue() - 1);
        }
    }

    public void printCurrentValue() {
        System.out.println("Текущее значение на счётчике: " + getCurrentValue());
    }
}
