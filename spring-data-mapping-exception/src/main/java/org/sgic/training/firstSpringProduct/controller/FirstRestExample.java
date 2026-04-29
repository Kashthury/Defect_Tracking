package org.sgic.training.firstSpringProduct.controller;

import org.sgic.training.firstSpringProduct.dto.EmployeeDto;
import org.sgic.training.firstSpringProduct.service.EmployeeService;
import org.sgic.training.firstSpringProduct.util.RestURIs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class FirstRestExample {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/hello-first")
    public ResponseEntity<Object> getEmployee() {

        return ResponseEntity.ok("Hello From First Rest API!!!");
    }


    @GetMapping(RestURIs.EMPLOYEE)
    public ResponseEntity<Object> getEmployeeById(@RequestParam String firstName, String lastName) {

        return ResponseEntity.ok("Hello From First Rest API!!!");
    }

    @PostMapping("/employee")
    public ResponseEntity<Object> saveEmployee( @RequestBody EmployeeDto employeeDto) {
        //logger.info("email id not present");
        employeeService.saveEmployee(employeeDto);
         return ResponseEntity.ok("Saved Successfully!");
       // logger.info("email id not present");
    }


    @RequestMapping("/hello")
    public Map<String, String> callAsyncMethod() {
        Map map = new HashMap<Integer, String>();
        map.put("message", "Hello");

        map.put("message1", "Hello-world");
        return map; // returns empty braces
    }

}


