package com.amit.ems.mapper;

import com.amit.ems.dto.EmployeeDto;
import com.amit.ems.entity.Employee;

public class EmployeeMapper {
    public static EmployeeDto mapToemployeeDTO(Employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }
    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
          employeeDto.getId(),
          employeeDto.getFirstname(),
           employeeDto.getLastname(),
           employeeDto.getEmail()
        );
    }
}
