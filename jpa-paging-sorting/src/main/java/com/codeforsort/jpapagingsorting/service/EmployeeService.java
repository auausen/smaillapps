package com.codeforsort.jpapagingsorting.service;

import com.codeforsort.jpapagingsorting.model.Employee;
import com.codeforsort.jpapagingsorting.repository.EmployeeCriteriaRepository;
import com.codeforsort.jpapagingsorting.repository.EmployeeRepository;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeCriteriaRepository employeeCriteriaRepository;

    public EmployeeService(EmployeeRepository employeeRepository,
                           EmployeeCriteriaRepository employeeCriteriaRepository) {
        this.employeeRepository = employeeRepository;
        this.employeeCriteriaRepository = employeeCriteriaRepository;
    }

    public Page<Employee>
}
