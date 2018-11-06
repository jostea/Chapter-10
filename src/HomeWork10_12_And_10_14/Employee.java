package HomeWork10_12_And_10_14;

import java.util.Calendar;

public class Employee {

    private final String firstName;
    private final String secondName;
    private final String socialSecurityNumber;

    private BirthDay birthBirthDay;


    public Employee(String firstName, String secondName, String socialSecurityNumber, int day, int month, int year) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.birthBirthDay = new BirthDay(day, month, year);
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

    public BirthDay getBirthBirthDay() {
        return birthBirthDay;
    }

    @Override
    public String toString() {
        return " " + getFirstName() + " " + getSecondName() + "\n" + getSocialSecurityNumber();
    }


    public double earnings() {
        int monthAsInt = Calendar.getInstance().get(Calendar.MONTH)+1;
        if (birthBirthDay.getMonth() == monthAsInt) {
            return 100;
        } else
        return 0;
    }
}

