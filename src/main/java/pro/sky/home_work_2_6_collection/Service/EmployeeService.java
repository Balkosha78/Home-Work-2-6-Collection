package pro.sky.home_work_2_6_collection.Service;


import pro.sky.home_work_2_6_collection.Employee;

import java.util.Collection;

public interface EmployeeService {
    Employee add(String firstName, String lastName);

    Employee remove(String firstName, String lastName);

    Employee find(String firstName, String lastName);

    Collection<Employee> findAll();

}
