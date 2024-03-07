
package com.usingH2.H2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.usingH2.H2.Dao.EmpRepo;

@Controller
public class EmployeeController 
{
	
	@Autowired
	EmpRepo repo;
	
@RequestMapping("/")
public String index()
{
	return "index";
}

@RequestMapping("/addEmployee")
public String addEmployee(Employee emp)
{
	repo.save(emp);
	

	return "add";
}

@RequestMapping("/getEmployee")
public ModelAndView getEmployee(@RequestParam int eid)
{
	ModelAndView mv=new ModelAndView("home");
	Employee emp=repo.findById(eid).orElse(new Employee());
	mv.addObject(emp);
	

	return mv;
}
}
