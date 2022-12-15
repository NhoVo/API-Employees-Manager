package com.demo.API.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.API.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
