package pro.sky.home_work_2_6_collection.Service;

import org.springframework.stereotype.Service;
import pro.sky.home_work_2_6_collection.Employee;
import pro.sky.home_work_2_6_collection.Exception.EmployeeAlreadyAddedException;
import pro.sky.home_work_2_6_collection.Exception.EmployeeNotFoundException;

import java.util.*;


@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final Map<String, Employee> employees;

    public EmployeeServiceImpl() {
        this.employees = new HashMap<>();
    }

    @Override
    public Employee add(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employees.containsKey(employee.getFullName())) {
            throw new EmployeeAlreadyAddedException("База переполнена");
        }
        employees.put(employee.getFullName(), employee);
        return employee;
    }

    @Override
    public Employee remove(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employees.containsKey(employee.getFullName())) {
            return employees.put(employee.getFullName(), employee);

        }
        throw new EmployeeNotFoundException("Сотрудника нет в базе");
    }

    @Override
    public Employee find(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employees.containsKey(employee.getFullName())) {
            return employees.get(employee.getFullName());
        }
        throw new EmployeeNotFoundException("Сотрудника нет в базе");
    }

    @Override
    public Collection<Employee> findAll() {
        return Collections.unmodifiableCollection(employees.values());
    }
}
