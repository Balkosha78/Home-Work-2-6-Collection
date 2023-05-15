package pro.sky.home_work_2_6_collection.Service;
import org.springframework.stereotype.Service;
import pro.sky.home_work_2_6_collection.Employee;
import pro.sky.home_work_2_6_collection.Exception.EmployeeAlreadyAddedException;
import pro.sky.home_work_2_6_collection.Exception.EmployeeNotFoundException;
import pro.sky.home_work_2_6_collection.Exception.EmployeeStoragelsFullException;
import java.util.*;
    @Service
    public class EmployeeServiceImpl implements EmployeeService {
    private final int EMPLOYEES_STORAGE_SIZE = 5;
    private final Map<String, Employee> employees = new HashMap<>();
    @Override
    public Employee add(String firstName, String lastName, Integer salary, Integer department) {
        String employeeKey = getEmployeeKey(firstName, lastName);
        if (employees.containsKey(getEmployeeKey(firstName, lastName))) {
            throw new EmployeeAlreadyAddedException("Такой сотрудник уже есть в базе");
        }
        if (employees.size() == EMPLOYEES_STORAGE_SIZE) {
        throw new EmployeeStoragelsFullException("База переполнена");
        }
        employees.put(employeeKey, new Employee(firstName, lastName, salary, department));
        return employees.get(employeeKey);
    }
    @Override
    public void remove(String firstName, String lastName) {
        String employeeKey = getEmployeeKey(firstName, lastName);
        if (!employees.containsKey(employeeKey)) {
            throw new EmployeeNotFoundException("Сотрудника нет в базе");
        }
        employees.remove(employeeKey);
    }
    @Override
    public Employee find(String firstName, String lastName) {
        String employeeKey = getEmployeeKey(firstName, lastName);
        if (!employees.containsKey(employeeKey)) {
            throw new EmployeeNotFoundException("Сотрудника нет в базе");
        }
            return employees.get(employeeKey);
        }
    @Override
    public Map<String, Employee> getAllEmployees(){
        return employees;
    }
    private String getEmployeeKey(String firstName, String lastName){
        return firstName + lastName;
    }
}
