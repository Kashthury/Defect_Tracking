package org.sgic.training.firstSpringProduct.service;

import java.util.List;

import org.sgic.training.firstSpringProduct.dto.EmployeeDto;
import org.springframework.web.multipart.MultipartFile;


public interface EmployeeService {

  public String saveEmployee(EmployeeDto employeeDto);


}
