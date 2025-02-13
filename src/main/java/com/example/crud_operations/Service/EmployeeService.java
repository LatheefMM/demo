package com.example.crud_operations.Service;


import com.example.crud_operations.Employee.Employee;
import com.example.crud_operations.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    /// create employee
    public Employee saveemployee(Employee employee){
        return  employeeRepository.save(employee);
    }
    /// retrieve all data from stored in database
    public List<Employee> getallEmployees() {
        return  employeeRepository.findAll();
    }

    ///  get employee id only

    public Employee getEmployeeId(Long id){
        return  employeeRepository.findById(id).orElse(null);
    }

    ///  update employee details
    public Employee updatedEmployee(Long id, Employee newEmployeedata){
        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        if (optionalEmployee.isPresent()){
            Employee existingemployee = optionalEmployee.get();
            existingemployee.setName(newEmployeedata.getName());
            existingemployee.setDepartment(newEmployeedata.getDepartment());
            existingemployee.setEmail(newEmployeedata.getEmail());
            return  employeeRepository.save(existingemployee);
        }
        else {
            return  null;
        }

    }

    ///  delete employee details by id

    public void deleteemployee(Long id){
        employeeRepository.deleteById(id);
    }


}
