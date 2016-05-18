package sample.mybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sample.mybatis.domain.Employee;
import sample.mybatis.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/getEmployee", method = RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getEmployees(@RequestParam(defaultValue="1") int pageNo, @RequestParam(defaultValue="10") int pageSize) {
		return employeeService.getEmployees(pageNo, pageSize);
	}
}