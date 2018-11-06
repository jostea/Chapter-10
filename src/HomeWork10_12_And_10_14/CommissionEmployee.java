package HomeWork10_12_And_10_14;

public class CommissionEmployee extends Employee {

    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String secondName,
                              String socialSecurityNumber, double grossSales, double commissionRate, int day, int month, int year) {
        super(firstName, secondName, socialSecurityNumber, day, month, year);
        setCommissionRate(commissionRate);
        setGrossSales(grossSales);
    }


    @Override
    public double earnings() {
        return getGrossSales() * getCommissionRate() + super.earnings();
    }


    @Override
    public String toString() {
        return "Commission employee " + super.toString()
                + "\nGross sales " + getGrossSales()
                + "\nCommission Rate " + getCommissionRate();
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        this.commissionRate = commissionRate;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >= 0.0");

        this.grossSales = grossSales;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }
}
