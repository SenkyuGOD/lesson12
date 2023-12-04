package home.work;


public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        hour = 12;
        minute = 00;
        second = 00;
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        if (this.hour > 24) {
            this.hour = 0;
        }
        this.minute = minute;
        if (this.minute > 60) {
            this.minute = 0;
        }
        this.second = second;
        if (this.second > 60) {
            this.second = 0;
        }
    }

    public void setHour(int hour) {
        this.hour = hour;

        if (hour > 24) {
            this.hour = 0;
        }
    }

    public void setMinute(int minute) {
        this.minute = minute;

        if (minute > 60) {
            this.minute = 00;
        }
    }

    public void setSecond(int second) {
        this.second = second;

        if (second > 60) {
            this.second = 00;
        }
    }

    public void changeHour( int changeHour) {
        this.hour += changeHour;

        if (this.hour >= 24) {
            this.hour -= 24;
        }
    }

    public void changeMinute( int changeMinute) {
        this.minute +=  changeMinute;

        if (this.minute >= 60) {
            this.minute -= 60;
        }
    }

    public void changeSecond( int changeSecond) {
        this.second += changeSecond;

        if (second >= 60) {
            second -= 60;
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
}

