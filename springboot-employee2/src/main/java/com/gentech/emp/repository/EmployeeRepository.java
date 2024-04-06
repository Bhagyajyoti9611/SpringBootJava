package com.gentech.emp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gentech.emp.dto.EmployeeDto;
import com.gentech.emp.entity.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>,PagingAndSortingRepository<Employee, Long> {
	
	//findermethod
   Employee findByEmpName(String name);
   List<Employee> findByCityName(String name);
   //if a need give more than one city  then use finAllByCityName;
   List<Employee> findByAge(int age);
   Employee findByEmailId(String emailId);
   List<Employee> findBySalary(double salary);
   List<Employee> findByJobName(String jobName);
   //select * from employee where jobname=" "
   List<Employee> findAllByJobNameAndCityName(String job,String city);
 
   //select * from employee where jobName like "%dev%";
    List<Employee> findAllByJobNameContaining(String keyword);
    
    
   
   //jpqlmethod
    @Query("FROM Employee WHERE salary=:salary")
    List<Employee> getEmployeesBySalary(double salary);
    
    @Modifying
    @Transactional
    @Query("DELETE FROM Employee WHERE id=:id")
    Integer deleteEmployeeById(Long id);
    List<EmployeeDto> getAllEmployeesForPagination(int pagenumber, int pagesize);
    List<EmployeeDto> getAllEmployeesWithSorting();
    		
   
   

}
