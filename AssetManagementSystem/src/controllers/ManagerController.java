package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ManagerController {
	@RequestMapping("/ManagerHome")
	 public String EmpHome()
	 {
	   return "ManagerHome";
	 }
}

