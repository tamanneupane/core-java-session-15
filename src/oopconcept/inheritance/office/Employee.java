package oopconcept.inheritance.office;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Objects;

public class Employee extends Person implements Comparable<Employee> {

    private long employeeId;

    public Employee(String name, String jobResponsibility, LocalDate joiningDate, double salary, long employeeId){
        super(name, jobResponsibility, joiningDate, salary);
        this.employeeId = employeeId;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeId == employee.employeeId && this.getName().equals(employee.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, this.getName());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ",name=" + super.getName() +
                ",salary=" + super.getSalary() +
                ",joiningDate=" + super.getJoiningDate() +
                ",jobResponsibility=" + super.getJobResponsibility() +
                '}';
    }

    @Override
    public void printDescription() {

    }

    //-1
    // 0
    // 1

    @Override
    public int compareTo(Employee o) {
        //return this.getName().compareTo(o.getName());
        //return Long.compare(this.getEmployeeId(), o.getEmployeeId());
        //return Double.compare(this.getSalary(), o.getSalary());
        return o.getJoiningDate().compareTo(this.getJoiningDate());
    }
}
