package pro.sky.home_work_2_6_collection;
import java.util.Objects;
public class Employee {
    private final String firstName;
    private final String lastName;
    private final Integer salary;
    private final Integer department;
    public Employee(String firstName, String lastName, Integer salary, Integer department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.department = department;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public Integer getSalary() {
        return salary;
    }
    public Integer getDepartment() {
        return department;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return firstName.equals(employee.firstName) && lastName.equals(employee.lastName) && salary.equals(employee.salary) && department.equals(employee.department);
    }
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, salary, department);
    }
    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                '}';
    }
}
