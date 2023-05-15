package pro.sky.home_work_2_6_collection.Service;
import pro.sky.home_work_2_6_collection.Employee;
import java.util.Collection;
import java.util.Map;
public interface EmployeeService {
    Employee add(String firstName, String lastName, Integer salary, Integer department);
    void  remove(String firstName, String lastName);
    Employee find(String firstName, String lastName);
    Map<String, Employee> getAllEmployees();
}
