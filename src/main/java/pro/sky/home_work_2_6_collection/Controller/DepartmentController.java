package pro.sky.home_work_2_6_collection.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.home_work_2_6_collection.Employee;
import pro.sky.home_work_2_6_collection.Service.DepartmentService;

import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/departments")


public class DepartmentController {
    private  DepartmentService departmentService;
    @GetMapping("max-salary")
    public Employee getEmployeeWithMaxSalary(@RequestParam("departmentId") Integer departmentId){
        return departmentService.getEmployeeWithMaxSalary(departmentId);
    }
    @GetMapping("/min-salary")
    public Employee getEmployeeWithMinSalary(@RequestParam("departmentId") Integer departmentId){
        return departmentService.getEmployeeWithMinSalary(departmentId);
    }
    @GetMapping("/all")
    public Map<Integer, List<Employee>> getGroupeByDepartmentEmployees(
            @RequestParam(name = "departmentId", required = false) Integer departmentId){
        return departmentService.getGroupedByDepartmentEmployees(departmentId);
    }
}
