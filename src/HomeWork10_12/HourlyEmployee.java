package HomeWork10_12;

public class HourlyEmployee extends Employee {

    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String secondName, String socialSecurityNumber, double wage, double hours,int day, int month, int year) {
        super(firstName, secondName, socialSecurityNumber,day,month,year);
        setHours(hours);
        setWage(wage);
    }

    public void setWage(double wage) {
        if (wage < 0.0)
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");
        this.wage = wage;
    }

    public void setHours(double hours) {
        if ((hours < 0.0) || (hours > 168.0))
            throw new IllegalArgumentException(
                    "Hours worked must be >= 0.0 and <= 168.0");
        this.hours = hours;
    }

    public double getHours() {
        return hours;
    }

    public double getWage() {
        return wage;
    }

    @Override
    public double earnings() {
        if (getHours() <= 40) {
            return getWage() * getHours();
        } else {
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
        }
    }


    @Override
    public String toString() {
        return "Hourly employee" + super.toString() + "\nHourly wage:" + getWage() +
                "\nHours worked" + getHours();
    }
}
