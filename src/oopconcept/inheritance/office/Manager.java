package oopconcept.inheritance.office;

import java.time.LocalDate;

public class Manager extends Person{

    private double bonus;

    public Manager(String name, String jobResponsibility, LocalDate joiningDate, double salary) {
        super(name, jobResponsibility, joiningDate, salary);
        System.out.println("Manager Constructor");
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        double totalSalary = super.getSalary()  + bonus;
        return totalSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "bonus=" + bonus +
                ",name=" + super.getName() +
                ",basicSalary=" + super.getSalary() +
                ",joiningDate=" + super.getJoiningDate() +
                ",jobResponsibility=" + super.getJobResponsibility() +
                ",totalSalary=" + (super.getSalary() + bonus )+
                '}';
    }
}
