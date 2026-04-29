package org.sgic.training.firstSpringProduct.service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;


import jakarta.transaction.Transactional;
import org.sgic.training.firstSpringProduct.dto.EmployeeDto;
import org.sgic.training.firstSpringProduct.entities.Employee;
import org.sgic.training.firstSpringProduct.repositories.EmployeeRepository;
import org.sgic.training.firstSpringProduct.util.Utills;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;



@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	private final Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

	@Override
	public String saveEmployee(EmployeeDto employeeDto) {

		logger.info("Save employee started");

		logger.info("Employee save validation started");
		Employee employee = new Employee();
		employee.setFirstName(employeeDto.getFirstName());

		employee.setLastName(employeeDto.getLastName());
		Utills.stringValidation(employeeDto.getLastName());
		String userName=employeeDto.getEmailId().substring(1,4);
		employee.setEmail(userName);
		employeeRepository.save(employee);
		logger.info("email id not present");
		return ("Saved Successfully");

	}

}
