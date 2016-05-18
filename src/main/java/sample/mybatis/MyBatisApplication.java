package sample.mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyBatisApplication{

	public static void main(String[] args) throws Exception {
		SpringApplication.run(MyBatisApplication.class, args);
	}

	/*@Override
	public void run(String... args) {
        System.out.println("Adding User");
        empService.addEmployee(new Employee("dude@dude.com", "thedude"));
         empService.addEmployee(new Employee("dude@dude.com", "thedude"));
        empService.addEmployee(new Employee("dude@dude.com", "thedude"));
        empService.addEmployee(new Employee("dude@dude.com", "thedude"));
        System.out.println("Getting User");
        List<Employee> emps = empService.getEmployees(1, 10);
        for (Employee employee : emps) {
			System.out.println(employee.getEmpName());
		}
	}*/

}
