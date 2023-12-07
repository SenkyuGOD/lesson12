package edu.training.lesson13.time;

public class Main {
    public static void main(String[] args) {
        Time time1 = new Time();
        time1.printTime();
        time1.changeHour(12);
        time1.printTime();

        Time time2 = new Time(14, 48, 50);
        time2.changeSecond(12000);
        time2.printTime();
        time2.changeMinute(-178);
        time2.printTime();
    }
}
