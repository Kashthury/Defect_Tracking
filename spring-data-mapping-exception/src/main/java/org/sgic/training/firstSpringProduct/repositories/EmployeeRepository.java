package org.sgic.training.firstSpringProduct.repositories;


import org.sgic.training.firstSpringProduct.entities.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

	Employee findByFirstName(String name);

	Employee findByLastName(String name);
}
