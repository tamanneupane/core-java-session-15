package oopconcept.inheritance.office;

import java.time.LocalDate;
import java.util.ArrayList;

public class OfficeApp {

    public static void main(String[] args) {
        Employee employee = new Employee(
                "ABC",
                "Programmer",
                LocalDate.now(),
                5000,
                1
        );

        Employee employee1 = new Employee(
                "ABC",
                "Programmer",
                LocalDate.now(),
                5000,
                1
        );

        Manager manager = new Manager(
                "BCD",
                "Customer Service",
                LocalDate.now(),
                8000
        );
        manager.setBonus(2000);

        System.out.println("Employee ABC Salary : " + employee.getSalary());
        System.out.println("Manager BCD Salary : " + manager.getSalary());

        System.out.println(employee);
        System.out.println(manager);

        System.out.println(employee.equals(employee1));

        System.out.println(employee);
        System.out.println(employee1);

        //Person person = new Person("ABC", "",LocalDate.now(), 5000);



    }
}
