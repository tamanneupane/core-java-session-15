package oopconcept.inheritance.office;

import java.time.LocalDate;

public class Person {
    private String name;
    private String jobResponsibility;
    private LocalDate joiningDate;
    private double salary;

//    public Person() {
//        System.out.println("Person Constructor");
//    }


    public Person(String name, String jobResponsibility, LocalDate joiningDate, double salary) {
        this.name = name;
        this.jobResponsibility = jobResponsibility;
        this.joiningDate = joiningDate;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobResponsibility() {
        return jobResponsibility;
    }

    public void setJobResponsibility(String jobResponsibility) {
        this.jobResponsibility = jobResponsibility;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
