package collections.arraylist;

import oopconcept.inheritance.office.Employee;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetPractice {

    public static void main(String[] args) {

        TreeSet<Employee> employees = new TreeSet<>();

        Employee employee1 = new Employee(
                "Ram",
                "Programmer",
                LocalDate.of(2022, Month.FEBRUARY, 1),
                5000,
                1
        );

        Employee employee2 = new Employee(
                "Hari",
                "QA",
                LocalDate.of(2023, Month.FEBRUARY, 1),
                3000,
                4
        );

        employees.add(employee1);
        employees.add(employee2);

        System.out.println(employees);

//        Collections.sort(employees);
//
//        System.out.println(employees);

//        Comparator<Employee> nameComparator = new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        };
//
//        Collections.sort(employees,nameComparator);
//
//
//        System.out.println(employees);
    }
}
