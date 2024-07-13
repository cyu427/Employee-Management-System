package com.employeemanager.employeemanagertutorial.repository;

import com.employeemanager.employeemanagertutorial.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
