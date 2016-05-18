package sample.mybatis.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import sample.mybatis.domain.Employee;

public interface EmployeeMapper {
	@Select("SELECT * FROM Employee WHERE id = #{employeeId}")
	public Employee getEmployee(long employeeId);

    @Insert("insert into Employee (email, empName) values(#{email}, #{empName})")
    public int addEmployee(Employee employee);
    @Select("select * from Employee LIMIT #{0},#{1} ")
    public List<Employee> getEmployees(int startIndex,int pagesize);
    @Select("select count(1) from Employee")
    public int getEmployeeCount();
}