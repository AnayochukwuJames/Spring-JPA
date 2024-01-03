package com.example.springjpa.controller;

import com.example.springjpa.model.Employee;
import com.example.springjpa.model.EmployeePage;
import com.example.springjpa.model.EmployeeSearchCriteria;
import com.example.springjpa.service.EmployeeService;
//import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//@RequiredArgsConstructor
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("get-employee")
    public ResponseEntity <Page<Employee>> getEmployee(EmployeePage employeePage,
                                                       EmployeeSearchCriteria employeeSearchCriteria){
        return new ResponseEntity<>(employeeService.getEmployees(employeePage, employeeSearchCriteria), HttpStatus.OK);
    }
@PostMapping("add-employee")
   public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
    return new ResponseEntity<>(employeeService.addEmployee(employee), HttpStatus.OK);
   }

}
