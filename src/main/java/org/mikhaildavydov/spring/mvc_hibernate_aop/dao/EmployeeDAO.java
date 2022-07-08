package org.mikhaildavydov.spring.mvc_hibernate_aop.dao;

import org.mikhaildavydov.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

     public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
