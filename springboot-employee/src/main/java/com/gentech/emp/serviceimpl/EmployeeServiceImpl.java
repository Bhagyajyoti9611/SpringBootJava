package com.gentech.emp.serviceimpl;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import com.gentech.emp.dto.EmployeeDto;
import com.gentech.emp.entity.Employee;
import com.gentech.emp.mapper.EmployeeMapper;
import com.gentech.emp.repository.EmployeeRepository;
import com.gentech.emp.services.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeRepository employeeRepositopry;

	public EmployeeServiceImpl(EmployeeRepository employeeRepositopry) {
		super();
		this.employeeRepositopry = employeeRepositopry;
	}

	@Override
	public EmployeeDto createEmployee(EmployeeDto employeeDto) {
		Employee employee=EmployeeMapper.mapToEmployee(employeeDto);
		Employee savedEmployee=employeeRepositopry.save(employee);
		return EmployeeMapper.mapToEmployeeDto(savedEmployee);
	}

	@Override
	public EmployeeDto getEmployee(Long id) {
		Employee employee=employeeRepositopry.findById(id).orElseThrow(() ->
		 new RuntimeException("The Employee id "+id+" does not exist!!!"));
		
		return EmployeeMapper.mapToEmployeeDto(employee);
	}

	@Override
	public EmployeeDto updateEmployee(Long id, EmployeeDto employeeDto) {
		Employee employee=employeeRepositopry.findById(id).orElseThrow(() ->
		 new RuntimeException("The Employee id "+id+" does not exist!!!"));
		
		
		employee.setEmployeeFirstName(employeeDto.getEmployeeFirstName());
		employee.setEmployeeLastName(employeeDto.getEmployeeLastName());
		employee.setJobName(employeeDto.getJobName());
		employee.setEmailId(employeeDto.getEmailId());
		employee.setAge(employeeDto.getAge());
		employee.setContactNumber(employeeDto.getContactNumber());
		employee.setSalary(employeeDto.getSalary());
		employee.setDepartmentName(employeeDto.getDepartmentName());
		employee.setCityName(employeeDto.getCityName());
		employee.setAddress(employeeDto.getAddress());
		
		Employee savedEmployee=employeeRepositopry.save(employee);
		
		return EmployeeMapper.mapToEmployeeDto(savedEmployee);
	}

	@Override
	public EmployeeDto deleteEmployee(Long id) {
		Employee employee=employeeRepositopry.findById(id).orElseThrow(() ->
		 new RuntimeException("The Employee id "+id+" does not exist!!!"));
		
		EmployeeDto employeeDto=EmployeeMapper.mapToEmployeeDto(employee);
		employeeRepositopry.deleteById(id);
		return employeeDto;
	}

	@Override
	public List<EmployeeDto> getAllEmployees() {
		return employeeRepositopry.findAll().stream().map(
				(employee) -> EmployeeMapper.mapToEmployeeDto(employee))
		.collect(Collectors.toList());
		
	}

	@Override
	public EmployeeDto updateEmployeePartially(Long id, Map<String, Object> fields) {
		
		Employee employee=employeeRepositopry.findById(id).orElseThrow(() ->
		 new RuntimeException("The Employee id "+id+" does not exist!!!"));
		
		
		fields.forEach((key, value) ->{
			Field field = ReflectionUtils.findField(Employee.class, key);
			field.setAccessible(true);
			ReflectionUtils.setField(field, employee, value);
		});
		
		Employee savedEmployee=employeeRepositopry.save(employee);
		return EmployeeMapper.mapToEmployeeDto(savedEmployee);
	}

}
