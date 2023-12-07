package edu.training.lesson13.decimal_counter;

public class Main {
    public static void main(String[] args) {
        DecimalCounter counter1 = new DecimalCounter();
        counter1.printCurrentValue();
        counter1.increment();
        counter1.printCurrentValue();
        counter1.decrement();
        counter1.printCurrentValue();


        DecimalCounter counter2 = new DecimalCounter(-5, 5, -4);
        counter2.printCurrentValue();
        counter2.decrement();
        counter2.decrement();
        counter2.printCurrentValue();
    }
}
