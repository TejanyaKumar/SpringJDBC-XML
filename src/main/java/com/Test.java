package com;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class Test {
      
	   public static void main(String[] args) {
		    
		ApplicationContext container = new ClassPathXmlApplicationContext("beans.xml"); 
		JdbcTemplate template = container.getBean("template" , JdbcTemplate.class);
		
//		template.update("insert into employees values(?,?,?)" , 800,"suraj.sukla@gmail.com",33000);
		
//		template.update("update employees set email =? where empid =?" ,"sooraj.rathi@gmail.com" , 800);
		
//		template.update("delete from employees where empid=?",800);
		
		Employee employee = template.queryForObject("select * from employees where empid=200", new RowMapper<Employee>() {
			
			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new Employee(rs.getInt(1) , rs.getString(2) , rs.getDouble(3) );
			}
		});
		System.out.println(employee);
	}
}
