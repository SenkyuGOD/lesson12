package edu.training.lesson13.time;

public class Time {
    private final int MAX_HOUR = 24;
    private final int MIN_HOUR = 0;
    private final int MAX_MINUTE = 60;
    private final int MIN_MINUTE = 0;
    private final int MAX_SECOND = 60;
    private final int MIN_SECOND = 0;
    private int hour;
    private int minute;
    private int second;

    public Time() {
        setHour(9);
        setMinute(45);
        setSecond(30);
    }

    public Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (MIN_HOUR < hour || hour < MAX_HOUR) {
            this.hour = hour;
        } else {
            this.hour = 0;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (MIN_MINUTE < minute || MAX_MINUTE < minute) {
            this.minute = minute;
        } else {
            this.minute = 0;
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (MIN_SECOND < second || MAX_SECOND < second) {
            this.second = second;
        } else {
            this.second = 0;
        }
    }

    public void makeTheHourValid() {
        if (getHour() > MAX_HOUR) {
            while (getHour() > MAX_HOUR) {
                setHour(getHour() - MAX_HOUR);
            }
        }
    }

    public void makeTheMinuteValid() {
        if (getMinute() > MAX_MINUTE) {
            int addHour = 0;
            while (getMinute() > MAX_MINUTE) {
                setMinute(getMinute() - MAX_MINUTE);
                addHour++;
            }
            setHour(getHour() + addHour);
            makeTheHourValid();
        }
    }

    public void makeTheSecondValid() {
        if (getSecond() > MAX_SECOND) {
            int addMinute = 0;
            while (getSecond() > MAX_SECOND) {
                setSecond(getSecond() - MAX_SECOND);
                addMinute++;
            }
            setMinute(getMinute() + addMinute);
            makeTheMinuteValid();
        }
    }

    public void changeHour(int hour) {
        if (hour < MIN_HOUR) {
            return;
        }

        setHour(getHour() + hour);

        makeTheHourValid();
    }

    public void changeMinute(int minute) {
        if (minute < MIN_MINUTE) {
            return;
        }

        setMinute(getMinute() + minute);

        makeTheMinuteValid();
    }

    public void changeSecond(int second) {
        if (second < MIN_SECOND) {
            return;
        }

        setSecond(getSecond() + second);

        makeTheSecondValid();
    }

    public void printTime() {
        System.out.println("Ваше установленное время: " + getHour() + ":" + getMinute() + ":" + getSecond());
    }
}
