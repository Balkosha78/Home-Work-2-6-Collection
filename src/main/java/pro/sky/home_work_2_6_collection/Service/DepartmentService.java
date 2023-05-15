package pro.sky.home_work_2_6_collection.Service;
import pro.sky.home_work_2_6_collection.Employee;
import java.util.List;
import java.util.Map;
public interface DepartmentService {
    Employee getEmployeeWithMaxSalary(Integer departmentId);
    Employee getEmployeeWithMinSalary(Integer departmentId);
    Map<Integer, List<Employee>> getGroupedByDepartmentEmployees(Integer departmentId);
}
