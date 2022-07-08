package org.mikhaildavydov.spring.mvc_hibernate_aop.service;

import org.mikhaildavydov.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id); // метод возвращает работника чтобы view employee-info не было пустым (было заполненно работником из базы)

    public void deleteEmployee(int id);
}
