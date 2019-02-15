package controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import beans.AssetBean;
import beans.UsersBean;
import dao.EmpDao;
import dao.MyDao;

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
	 
	 @RequestMapping("/CreateReq")
	 public ModelAndView CreateRequest(@ModelAttribute AssetBean e)
	 {
		   EmpDao m=new EmpDao();
		   ArrayList<AssetBean> list= m.ViewAsset();
		  
		   ModelAndView mv=null;
		   
		   mv=new ModelAndView("EmpCreateRequest");
		   mv.addObject("LIST",list);
		   return mv;    
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
