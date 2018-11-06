package HomeWork10_12_And_10_14;

import java.util.LinkedList;
import java.util.List;

public class PayrollSystemTest {
    public static void main(String[] args) {

        SalariedEmployee salariedEmployee =
                new SalariedEmployee("John", "Smith", "111-11-1111", 800.00, 7, 9, 1963);
        HourlyEmployee hourlyEmployee =
                new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40, 22, 7, 1974);
        CommissionEmployee commissionEmployee =
                new CommissionEmployee(
                        "Sue", "Jones", "333-33-3333", 10000,
                        .06, 11, 11, 1996);
        BasePlusCommissionEmployee basePlusCommissionEmployee =
                new BasePlusCommissionEmployee(
                        "Bob", "Lewis", "444-44-4444", 5000, .04, 300, 7, 11, 1999);

        Employee pieceWorker = new PieceWorker("Jostea", "Shneider", "883-88-8888", 475,
                6, 18, 9, 1996);

        System.out.println("Employees processed individually:");


        System.out.println(salariedEmployee + "\nearned " + salariedEmployee.earnings() + "\nBirth Day " + salariedEmployee.getBirthBirthDay());
        System.out.println();
        System.out.println(hourlyEmployee + "\nearned " + hourlyEmployee.earnings() + "\nBirth Day " + hourlyEmployee.getBirthBirthDay());
        System.out.println();
        System.out.println(commissionEmployee + "\nearned " + commissionEmployee.earnings() + "\nBirth Day " + commissionEmployee.getBirthBirthDay());
        System.out.println();
        System.out.println(basePlusCommissionEmployee + "\nearned " + basePlusCommissionEmployee.earnings() + "\nBirth Day " + basePlusCommissionEmployee.getBirthBirthDay());
        System.out.println();
        System.out.println(pieceWorker + "\nearned " + pieceWorker.earnings() + "\nBirth Day " + basePlusCommissionEmployee.getBirthBirthDay());

        List<Employee> employees = new LinkedList<>();

        employees.add(salariedEmployee);
        employees.add(hourlyEmployee);
        employees.add(commissionEmployee);
        employees.add(basePlusCommissionEmployee);
        employees.add(pieceWorker);

        System.out.printf("Employees processed polymorphically:%n%n");


        for (Employee currentEmployee : employees) {
            System.out.println();

            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;

                employee.setBaseSalary(1.10 * employee.getBaseSalary());

                System.out.println("New base salary with 10% increase is: " + employee.getBaseSalary());
            }


            System.out.println(currentEmployee.toString() + "\nearned : " + currentEmployee.earnings());
        }


//        for (int j = 0; j < employees.length; j++)
//            System.out.printf("Employee %d is a %s%n", j,
//                    employees[j].getClass().getName());
    }
}
