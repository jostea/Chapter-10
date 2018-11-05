package HomeWork10_12;

public class BasePlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String secondName,
                                      String socialSecurityNumber, double grossSales,
                                      double commissionRate, double baseSalary,int day, int month, int year) {
        super(firstName, secondName, socialSecurityNumber, grossSales, commissionRate,day,month,year);
        setBaseSalary(baseSalary);
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");

        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }


    @Override
    public double earnings() {

        return getBaseSalary() + super.earnings();
    }


    @Override
    public String toString() {
        return "base-salaried " + super.toString() +
                "\n base salary " + getBaseSalary();
    }
}