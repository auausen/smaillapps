package com.codeforsort.jpapagingsorting.repository;

import com.codeforsort.jpapagingsorting.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}
