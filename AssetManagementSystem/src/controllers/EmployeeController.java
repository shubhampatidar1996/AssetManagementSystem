package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController
 { 
	 @RequestMapping("/EmpHome")
	 public String EmpHome()
	 {
	   return "EmployeeHome";
	 }
	 
	 @RequestMapping("/EmployeeProfile")
	  public String EmployeeProfile()
	  {
	   return "EmployeeProfile";	
	  }
	 
	 @RequestMapping("/ViewMyRequest")
	 public String ViewMyRequest()
	 {
	   return "ViewMyRequest";
	 }
	 
	 @RequestMapping("/MyAssets")
	 public String MyAssets()
	 {
	   return "MyAssets";
	 }
	 
	 @RequestMapping("/AssetTransfer")
	 public String AssetTransfer()
	 {
	   return "AssetTransfer";
	 }
}
