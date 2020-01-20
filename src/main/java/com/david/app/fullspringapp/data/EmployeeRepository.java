package com.david.app.fullspringapp.data;

import com.david.app.fullspringapp.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}
