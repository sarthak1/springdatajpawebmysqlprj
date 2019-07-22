package com.springdatajpawebmysqlprj.repository;

import org.springframework.data.repository.CrudRepository;

import com.springdatajpawebmysqlprj.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
