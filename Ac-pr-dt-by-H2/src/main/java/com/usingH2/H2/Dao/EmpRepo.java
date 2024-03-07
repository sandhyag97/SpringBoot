package com.usingH2.H2.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.usingH2.H2.Employee;
@Component
public interface EmpRepo extends CrudRepository<Employee, Integer> 
{

}
