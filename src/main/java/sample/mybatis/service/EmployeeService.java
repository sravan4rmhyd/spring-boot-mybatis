package sample.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sample.mybatis.domain.Employee;
import sample.mybatis.persistence.EmployeeMapper;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    public int addEmployee(Employee emp) {
        return employeeMapper.addEmployee(emp);
    }

    public Employee getEmployee(int empId) {
        return employeeMapper.getEmployee(empId);
    }
    public List<Employee> getEmployees(int pageNo, int pageSize)
    {
    	int startIndex =(pageNo-1)*pageSize;
    	return employeeMapper.getEmployees(startIndex, pageSize);
    }
    public int getEmployeeCount()
    {
    	return employeeMapper.getEmployeeCount();
    }
}
