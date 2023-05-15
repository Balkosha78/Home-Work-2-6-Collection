package pro.sky.home_work_2_6_collection.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.home_work_2_6_collection.Employee;
import pro.sky.home_work_2_6_collection.Service.EmployeeService;
import java.util.Map;
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("/add")
    public Employee addEmployee(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName,
                                @RequestParam("salary") Integer salary, @RequestParam("department") Integer department) {
        return employeeService.add(firstName, lastName, salary, department);
    }
    @GetMapping("/remove")
    public void removeEmployee(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {
        employeeService.remove(firstName, lastName);
    }
    @GetMapping("/find")
    public Employee findEmployee(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {
        return employeeService.find(firstName, lastName);
    }
    @GetMapping
    public Map<String, Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
}





