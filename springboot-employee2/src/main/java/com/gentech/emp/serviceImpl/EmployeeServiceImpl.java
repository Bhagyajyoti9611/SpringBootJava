package com.gentech.emp.serviceImpl;

import java.util.List;

import java.util.stream.Collectors;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.gentech.emp.dto.EmployeeDto;
import com.gentech.emp.entity.Employee;
import com.gentech.emp.mapper.Employeemapper;
import com.gentech.emp.repository.EmployeeRepository;
import com.gentech.emp.service.EmployeeService;

@Service

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public EmployeeDto createEmployee(EmployeeDto employeedto) {
		Employee employee = Employeemapper.mapToEmployee(employeedto);
		Employee saveEmployee = employeeRepository.save(employee);

		return Employeemapper.mapToEmployeeDto(saveEmployee);
	}

	@Override
	public EmployeeDto getEmployee(long id) {
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("the employee id" + id + "does not exist"));
		return Employeemapper.mapToEmployeeDto(employee);
	}

	@Override
	public EmployeeDto updateEmployee(long id, EmployeeDto employeedto) {
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("the employee id" + id + "does not exist"));

		employee.setEmpName(employeedto.getEmpName());
		employee.setJobName(employeedto.getJobName());
		employee.setAge(employeedto.getAge());

		employee.setSalary(employeedto.getSalary());
		employee.setEmailId(employeedto.getEmailId());
		employee.setCityName(employeedto.getCityName());
		Employee saveEmployee = employeeRepository.save(employee);

		return Employeemapper.mapToEmployeeDto(saveEmployee);
	}

	@Override
	public void deleteEmployee(long id) {
		employeeRepository.findById(id)
		.orElseThrow(() -> new RuntimeException("the employee id" + id + "does not exist"));
		employeeRepository.deleteById(id);

	}

	@Override
	public List<EmployeeDto> getAllEmployee() {
		return employeeRepository.findAll().stream().map((employee) -> Employeemapper.mapToEmployeeDto(employee))
				.collect(Collectors.toList());

	}

	@Override
	public EmployeeDto getEmployeeByName(String name) {
		Employee employee = employeeRepository.findByEmpName(name);

		return Employeemapper.mapToEmployeeDto(employee);
	}

	@Override
	public List<EmployeeDto> getEmployeeByCityName(String name) {
		return employeeRepository.findByCityName(name).stream()
				.map((employee) -> Employeemapper.mapToEmployeeDto(employee)).collect(Collectors.toList());
	}

	@Override
	public EmployeeDto getEmployeeByEmail(String email) {
		Employee employee = employeeRepository.findByEmailId(email);

		return Employeemapper.mapToEmployeeDto(employee);

	}

	@Override
	public List<EmployeeDto> getEmployeeByAge(int age) {
		return employeeRepository.findByAge(age).stream().map((employee) -> Employeemapper.mapToEmployeeDto(employee))
				.collect(Collectors.toList());

	}

	@Override
	public List<EmployeeDto> getEmployeeBySalary(double salry) {
		return employeeRepository.findBySalary(salry).stream()
				.map((employee) -> Employeemapper.mapToEmployeeDto(employee)).collect(Collectors.toList());

	}

	@Override
	public List<EmployeeDto> getEmployeeByJob(String job) {
		return employeeRepository.findByJobName(job).stream()
				.map((employee) -> Employeemapper.mapToEmployeeDto(employee)).collect(Collectors.toList());
	}

	@Override
	public List<EmployeeDto> getEmployeesByJobAndCityName(String job, String city) {
		return employeeRepository.findAllByJobNameAndCityName(job, city).stream()
				.map((employee) -> Employeemapper.mapToEmployeeDto(employee)).collect(Collectors.toList());

	}

	@Override
	public List<EmployeeDto> getEmployeesByJobKeyword(String keyword) {
		return employeeRepository.findAllByJobNameContaining(keyword).stream()
				.map((employee) -> Employeemapper.mapToEmployeeDto(employee)).collect(Collectors.toList());

	}

	@Override
	public List<EmployeeDto> getEmployeesDetailsBySalary(double salary) {
		return employeeRepository.getEmployeesBySalary(salary).stream()
				.map((employee) -> Employeemapper.mapToEmployeeDto(employee)).collect(Collectors.toList());

	}

	@Override
	public void deleteEmployeeById(Long id) {
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("the employee id" + id + "does not exist"));
		employeeRepository.deleteEmployeeById(id);

	}

	@Override
	public List<EmployeeDto> getAllEmployeesForPagination(int pagenumber, int pagesize) {
//		Sort sort= Sort.by(Sort.Direction.DESC, "id");       this is page and sorting 
		Pageable pages = PageRequest.of(pagenumber, pagesize, Direction.DESC,"id");

		return employeeRepository.findAll(pages).getContent().stream()
				.map((employee) -> Employeemapper.mapToEmployeeDto(employee)).collect(Collectors.toList());
	}

	@Override
	public List<EmployeeDto> getAllEmployeesWithSorting() {
		Sort sort= Sort.by(Sort.Direction.DESC, "id");
		return employeeRepository.findAll(sort).parallelStream().toList().stream()
				.map((employee) -> Employeemapper.mapToEmployeeDto(employee)).collect(Collectors.toList());


	}



}
