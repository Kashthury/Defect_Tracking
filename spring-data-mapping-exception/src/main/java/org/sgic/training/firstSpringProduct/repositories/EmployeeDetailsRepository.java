package org.sgic.training.firstSpringProduct.repositories;


import org.sgic.training.firstSpringProduct.entities.EmployeeDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDetailsRepository extends CrudRepository<EmployeeDetails, Long> {

}
