package com.desiby.springpayroll.service;

import java.util.Optional;

import com.desiby.springpayroll.model.Employee;

public interface EmployeeService {

    Iterable<Employee> findAllEmployees();
    Optional<Employee> getEmployeeById(Long id);
    Employee saveEmployee(Employee employee);
    void deleteEmployee(Employee empId);
}
