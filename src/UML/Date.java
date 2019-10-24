package UML;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        if (! isVerify(day, month, year)) {
            throw new IllegalArgumentException("Date is not valid!");
        }

        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDay(int day, int month, int year) {
        if (! isVerify(day, month, year)) {
            throw new IllegalArgumentException("day/moth/year is not valid!");
        }

        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        String day = "" + this.day;
        String month = "" + this.month;
        String year = "" + this.year;

        if (day.length() == 1) {
            day = "0" + day;
        }

        if (month.length() == 1) {
            month = "0" + month;
        }

        switch (year.length()) {

            case 1:
                year = "000" + year;
                break;

            case 2:
                year = "00" + year;
                break;

            case 3:
                year = "0" + year;
                break;
            default:
        }

        return day + "/" + month + "/" + year;
    }

    @Override
    public boolean equals (Object other) {
        if (other == null) return false;

        if (! (other instanceof Date)) return false;

        Date date = (Date) other;
        return this.year == date.year && this.month == date.month && this.day == date.day;
    }

    private static boolean isVerify(int day, int month, int year) {
        int[] arrDayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeapYear(year)) {
            arrDayOfMonth[1] = 29;
        }

        return day >= 1 && day <= arrDayOfMonth[month - 1];
    }

    private static boolean isLeapYear(int year) {
        if ( year % 400 == 0 ) { return true; }

        if (year % 100 == 0) { return false; }

        if ( year % 4 == 0) { return true; }

        return false;
    }

}

