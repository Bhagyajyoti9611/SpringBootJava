package com.gentech.emp.controller;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gentech.emp.dto.EmployeeDto;
import com.gentech.emp.service.EmployeeService;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {
	//http://localhost:8087/swagger-ui/index.html(url for swagger-ui)
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	@PostMapping
	public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto){
		return new ResponseEntity<EmployeeDto>(employeeService.createEmployee(employeeDto),HttpStatus.CREATED);
	}
	@GetMapping("{id}")
	public ResponseEntity<EmployeeDto> getEmployee(@PathVariable("id") long id){
		return new ResponseEntity<EmployeeDto>(employeeService.getEmployee(id),HttpStatus.OK);
	}
	@PutMapping("{id}")
	public ResponseEntity<EmployeeDto> modifyEmployee(@PathVariable("id") long id,@RequestBody EmployeeDto employeedto){
		return new ResponseEntity<EmployeeDto>(employeeService.updateEmployee(id, employeedto),HttpStatus.OK);
	}
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteById(@PathVariable("id") long id){
		employeeService.deleteEmployee(id);
		return new ResponseEntity<String>("the employee with id"+id+"has deleted successfully",HttpStatus.OK);

	}
	@GetMapping
	public ResponseEntity<List<EmployeeDto>> getAllEmployees(){
		return new ResponseEntity<List<EmployeeDto>>(employeeService.getAllEmployee(),HttpStatus.OK);
	}

	@GetMapping("/filterByName")
	public ResponseEntity<EmployeeDto> getEmployeefilterbyName(@RequestParam("name") String name  ){
		return new ResponseEntity<EmployeeDto>(employeeService.getEmployeeByName(name),HttpStatus.OK);

	}
	//http://localhost:8081/api/v1/employee/filterByCityName?name=mandya
	@GetMapping("/filterByCityName")
	public ResponseEntity<List<EmployeeDto>> getEmployeefilterbyCityName(@RequestParam("name") String name  ){
		return new ResponseEntity<List<EmployeeDto>>(employeeService.getEmployeeByCityName(name),HttpStatus.OK);

	}
	@GetMapping("/filterByEmail")
	public ResponseEntity<EmployeeDto> getEmployeefilterbyEmail(@RequestParam("email") String email  ){
		return new ResponseEntity<EmployeeDto>(employeeService.getEmployeeByEmail(email),HttpStatus.OK);

	}

	@GetMapping("/filterBySalary")
	public ResponseEntity<List<EmployeeDto>> getEmployeefilterbySalary(@RequestParam("salary") double salary  ){
		return new ResponseEntity<List<EmployeeDto>>(employeeService.getEmployeeBySalary(salary),HttpStatus.OK);

	}

	@GetMapping("/filterByAge")
	public ResponseEntity<List<EmployeeDto>> getEmployeefilterbyAge(@RequestParam("age") int age  ){
		return new ResponseEntity<List<EmployeeDto>>(employeeService.getEmployeeByAge(age),HttpStatus.OK);

	}

	@GetMapping("/filterByJob")
	public ResponseEntity<List<EmployeeDto>> getEmployeefilterbyJob(@RequestParam("job") String job  ){
		return new ResponseEntity<List<EmployeeDto>>(employeeService.getEmployeeByJob(job),HttpStatus.OK);

	}
	
	//http://localhost:8081/api/v1/employee/filterByJobAndCity?job=developer&city=mandya
	@GetMapping("/filterByJobAndCity")
	public ResponseEntity<List<EmployeeDto>> getEmployeefilterbyJobAndCityName(@RequestParam("job") String job,@RequestParam("city") String  city)
	{
		return new ResponseEntity<List<EmployeeDto>>(employeeService.getEmployeesByJobAndCityName(job, city),HttpStatus.OK);
	}
	
	//http://localhost:8081/api/v1/employee/keyword?job=developer
	@GetMapping("/keyword")
	public ResponseEntity<List<EmployeeDto>> getEmployeeByJobkeyword(@RequestParam("job") String job){

		return new ResponseEntity<List<EmployeeDto>>(employeeService.getEmployeesByJobKeyword(job),HttpStatus.OK);
	}
	//http://localhost:8081/api/v1/employee/salary?salary=34000.0
	@GetMapping("/salary")
	public ResponseEntity<List<EmployeeDto>> getEmployeeBysalary(@RequestParam("salary") double salary){
		return new ResponseEntity<List<EmployeeDto>>(employeeService.getEmployeesDetailsBySalary(salary),HttpStatus.OK);
		
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteById(@PathVariable Long id){
		employeeService.deleteEmployeeById(id);
		return new ResponseEntity<String>("the employee id "+id+" deleted",HttpStatus.OK);
	}

	@GetMapping("/pagination")
	public ResponseEntity<List<EmployeeDto>> getAllEmployeesPerPagewise(@RequestParam("pagenumber") int pagenumber,
			              @RequestParam("pagesize") int pagesize)
	{
		return new ResponseEntity<List<EmployeeDto>>(employeeService.getAllEmployeesForPagination(pagenumber,pagesize), HttpStatus.OK);
	}
	@GetMapping("/sort")
	public ResponseEntity<List<EmployeeDto>> getAllEmployeesBySorting()
	{
		return new ResponseEntity<List<EmployeeDto>>(employeeService.getAllEmployeesWithSorting(), HttpStatus.OK);
	}


}