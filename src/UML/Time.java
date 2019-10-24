package UML;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        if (! isVerify(hour, minute, second)) {
            throw new IllegalArgumentException("Time is not valid!");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int second, int minute) {
        if (! isVerify(hour, minute, second)) {
            throw new IllegalArgumentException("Time is not valid!");
        }

        this.hour = hour;
        this.second = second;
        this.minute = minute;
    }

    @Override
    public String toString() {
        String hour = "" + this.hour;
        String minute = "" + this.minute;
        String second = "" + this.second;

        if (hour.length() == 1) {
            hour = "0" + hour;
        }

        if (minute.length() == 1) {
            minute = "0" + minute;
        }

        if (second.length() == 1) {
            second = "0" + second;
        }

        return hour + ":" + minute + ":" + second;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) return false;

        if (! (other instanceof Time)) return false;

        final Time time = (Time) other;
        return this.hour == time.hour && this.minute == time.minute && this.second == time.second;
    }

    public Time nextSecond() {
        if (this.second < 59) {
            this.second ++;
            return this;
        }

        this.second = 0;
        if (this.minute < 59) {
            minute ++;
            return this;
        }

        this.minute = 0;
        if (this.hour == 23) {
            hour = 0;
            return this;
        }

        hour ++;

        return this;
    }

    public Time previousSecond() {
        if (this.second > 0) {
            this.second --;
            return this;
        }

        this.second = 59;
        if (this.minute > 0) {
            minute --;
            return this;
        }

        this.minute = 59;
        if (this.hour == 0) {
            this.hour = 23;
            return this;
        }

        hour --;
        return this;
    }

    private static boolean isVerify(int hour, int minute, int second) {
        return (hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59 && second >= 0 && second <= 59);
    }
}
