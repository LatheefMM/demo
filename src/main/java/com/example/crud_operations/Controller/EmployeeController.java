package com.example.crud_operations.Controller;


import com.example.crud_operations.Employee.Employee;
import com.example.crud_operations.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")

public class EmployeeController {

 @Autowired
 private EmployeeService employeeService;


 ///  employee creation
    @PostMapping
 public Employee createemployee(@RequestBody Employee employee){
      return  employeeService.saveemployee(employee);
    }


    /// get all employees
   @GetMapping
 public List <Employee>getallemployees(){
    return  employeeService.getallEmployees();
   }

   ///  get all employees by ID
 @GetMapping("/{id}")
 public  Employee getemployeebyid(@PathVariable Long id){
  return  employeeService.getEmployeeId(id);
 }

 ///  update the employee
 @PutMapping("/{id}")
public  Employee updateemployee(@PathVariable Long id,@RequestBody Employee employee){
 return employeeService.updatedEmployee(id,employee);

 }

 ///  delete the employee details
 @DeleteMapping("/{id}")
 public  String deleteemployee(@PathVariable Long id){
  employeeService.deleteemployee(id);
  return "Employee deleted successfully";
 }





}
