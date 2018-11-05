package HomeWork10_12;

public abstract class Employee {

    private final String firstName;
    private final String secondName;
    private final String socialSecurityNumber;

    private Date birthDate;



    public Employee(String firstName, String secondName, String socialSecurityNumber, int day, int month, int year) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.birthDate = new Date(day, month, year);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }
    @Override
    public String toString() {
        return " " + getFirstName() + " " + getSecondName() + "\n" + getSocialSecurityNumber();
    }


    public abstract double earnings();
}

