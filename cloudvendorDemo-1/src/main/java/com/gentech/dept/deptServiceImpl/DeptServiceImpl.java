package com.gentech.dept.deptServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gentech.dept.entity.Department;
import com.gentech.dept.exception.ResourceNotFoundException;
import com.gentech.dept.repository.DeptRepository;
import com.gentech.dept.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService {

	private DeptRepository deptRepository;

//             we have create a constructor
	public DeptServiceImpl(DeptRepository deptRepository) {
		super();
		this.deptRepository = deptRepository;
	}


//       setter method
	public void setDeptRepository(DeptRepository deptRepository) {
		this.deptRepository = deptRepository;
		
	}

	@Override
//	 Service abstract method
	public Department createDepartment(Department departdment) {
		
		return deptRepository.save(departdment);
	}


//    get
	@Override
	public List<Department> getAllDepartments() {
		
		return deptRepository.findAll();
	}
	
	
//	    particular  based id to getting but we have type the number  in url(get url)
//  public Department getDepartment(Long id)
//  {
//		Optional<Department> department = deptRepository.findById(id);
//		Department existingDept= null;
//		if(department.isPresent())
//		{
//			existingDept= department.get();
//			
//		}
//		else
//		{
//			try
//			{
//				throw new Exception("The department id " + id + " does not exist in db");
//			}catch(Exception e) 
//			{
//				System.out.println(e.getMessage());
//			}
//		}
//		return existingDept;
//  }

	@Override
	public Department getDepartment(Long id) {
		Department existingDept= deptRepository.findById(id).orElseThrow(() ->
		new ResourceNotFoundException("Department","id", id));
		return existingDept;
	}


	@Override
	public Department updateDepartment(Department department, Long id) {
		
		Department existingDept= deptRepository.findById(id).orElseThrow(() ->
		new ResourceNotFoundException("Department","id", id));
		existingDept.setDeptName(department.getDeptName());
		existingDept.setLocation(department.getLocation());
//		 save to modify in database
		deptRepository.save(existingDept);
		
		return existingDept;
	}
	
	
	
	
	
	
	
	

}
