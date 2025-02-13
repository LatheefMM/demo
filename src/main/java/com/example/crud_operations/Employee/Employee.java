package com.example.crud_operations.Employee;


import jakarta.persistence.*;

@Entity
@Table(name = "Employees")



public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;


    private  String name;
    private  String email;
    private String department;

    ///  constructors
    public   Employee() {}

    public  Employee(String name,String department,String email){
        this.name = name;
        this.department=department;
        this.email = email;
    }

    /// Getters and Setters

    public  Long getId(){
        return  id;
    }

    public  void  setId(Long id){
        this.id = id;
    }

    public void  setName(String name){
        this.name = name;
    }
    public String getName(){
        return  name;
    }

    public  void  setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return  email;
    }

    public void  setDepartment(String department){
        this.department = department;
    }
    public String getDepartment(){
        return department;
    }
}
