package HomeWork10_12_And_10_14;

public class BirthDay {
    private int day;
    private int month;
    private int year;
    private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public BirthDay(int day, int month, int year) {
        setMonth(month);
        setDay(day);
        setYear(year);

    }

    public void setMonth(int month) {
        if (month <= 0 || month > 12)
            throw new IllegalArgumentException("month (" + month + ") must be 1-12");

        this.month = month;
    }

    public void setDay(int day) {

        if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29))) {
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
        }
        if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
        }

        this.day = day;
    }



    public void setYear(int year) {

        if (year < 0) {
            throw new IllegalArgumentException("Year must be higher then 0");
        }
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return getDay() + "/" + getMonth() + "/" + getYear();
    }
}
