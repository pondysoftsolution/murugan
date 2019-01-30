package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	EmployeeDAO employeeDAO;

	@GetMapping("get")
	public Map getData() {
		Map map = new HashMap<>();
		/*Employee employee =null;
		employee.setAge(10);
		employee.setEmployeeName("Murugna");
		employee = employeeDAO.save(employee);
		map.put("Employee", employee);
		*/
		
		Citizen citizen = new Citizen();
		citizen.setAmount(300);
		citizen.setRangeId("D1");
		citizen.setName("uuu");
		employeeDAO.save(citizen);
	
		Citizen citizen1 = new Citizen();
		citizen1.setAmount(700);
		citizen1.setRangeId("D2");
		citizen1.setName("rrr");
		employeeDAO.save(citizen1);
		
		
		
		map.put("success", "success");
		return map;
	}

}
