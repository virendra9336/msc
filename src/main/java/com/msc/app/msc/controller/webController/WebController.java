package com.msc.app.msc.controller.webController;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.msc.app.msc.model.form.EmployeeVo;
import com.msc.app.msc.service.inf.EmployeeServiceInf;
import com.msc.app.msc.utils.Mapper;;



@Controller
public class WebController {
	private static final Logger logger = LoggerFactory.getLogger(WebController.class);
	@Autowired
	public EmployeeServiceInf employeeServiceInf;
	
	 @GetMapping("/")
	 public String main(Model model,EmployeeVo employeeVo) {
		 	model.addAttribute("name", "Virendra");
		 	model.addAttribute("address", "Sarnath Varanasi");
		 	 model.addAttribute("list", employeeServiceInf.getAll());
		 	model.addAttribute("employee", null);
	        return "welcome";
	    }
	 
	 @PostMapping("/saveemp")
	  public String saveEmp(@ModelAttribute EmployeeVo employeeVo,Model model) {
		 logger.info("Entering into saveEmp method ");
		 logger.info("Entering into saveEmp method "+employeeVo.getId());
		 employeeServiceInf.save(Mapper.converFormVoToEntity(employeeVo));
		 model.addAttribute("list", employeeServiceInf.getAll());
		 logger.info("existing into saveEmp method ");
	    return "welcome";
	  }
	 
	 @GetMapping("/update/{id}")
	  public String update(@PathVariable(value="id") long id,Model model,EmployeeVo employeeVo) {
		 logger.info("Entering into update method ");
		  model.addAttribute("employee", Mapper.converEntityToFormVo(employeeServiceInf.findById(id).getBody().getResult()));
		  model.addAttribute("list", employeeServiceInf.getAll());
		  logger.info("existing into update method ");
	    return "welcome";
	  }
	 
	 @GetMapping("/delete/{id}")
	  public String deleteById(@PathVariable(value="id") long id,Model model,EmployeeVo employeeVo) {
		 logger.info("Entering into update method ");
		 employeeServiceInf.deleteById(id);
		  model.addAttribute("list", employeeServiceInf.getAll());
		  logger.info("existing into update method ");
	    return "welcome";
	  }
	 
	 
	 
	 
}
