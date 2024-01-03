package com.example.springjpa.service;

import com.example.springjpa.model.Employee;
import com.example.springjpa.model.EmployeePage;
import com.example.springjpa.model.EmployeeSearchCriteria;
import com.example.springjpa.repository.EmployeeCriteriaRepository;
import com.example.springjpa.repository.EmploymentRepository;
//import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
//@RequiredArgsConstructor
public class EmployeeService {
    private final EmploymentRepository employmentRepository;
    private final EmployeeCriteriaRepository employeeCriteriaRepository;

    public EmployeeService(EmploymentRepository employmentRepository, EmployeeCriteriaRepository employeeCriteriaRepository) {
        this.employmentRepository = employmentRepository;
        this.employeeCriteriaRepository = employeeCriteriaRepository;
    }

    public Page<Employee> getEmployees(EmployeePage employeePage, EmployeeSearchCriteria employeeSearchCriteria) {
        return employeeCriteriaRepository.findAllWithFilters(employeePage, employeeSearchCriteria);
    }

    public Employee addEmployee(Employee employee){
       return employmentRepository.save(employee);
}
}
