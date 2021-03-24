package com.deusnex.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deusnex.springboot.cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	//That's it....no code required
}
