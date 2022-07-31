package com.crud.prac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.prac.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
