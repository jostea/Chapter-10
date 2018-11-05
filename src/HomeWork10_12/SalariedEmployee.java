package HomeWork10_12;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary, int day, int month, int year) {
        super(firstName, lastName, socialSecurityNumber, day, month, year);

        setWeeklySalary(weeklySalary);
    }


    @Override
    public double earnings() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {

        if (weeklySalary < 0.0) {
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        }
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }


    @Override
    public String toString() {
        return "salaried employee: " + super.toString() + "\nWeekly Salary: " + getWeeklySalary();
    }
}
