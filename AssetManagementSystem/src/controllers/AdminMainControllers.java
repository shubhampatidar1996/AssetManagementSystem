package controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import beans.UsersBean;
import dao.MyDao;

@Controller
//@SessionAttributes("email")

public class AdminMainControllers
{
 MyDao m=null;
 AdminMainControllers()
 {
  if(m==null)
	m=new MyDao();	
 }
 
 @RequestMapping("/")
 public String Home()
 {
   return "AdminLogin";
 }
 
 @RequestMapping("/AdminHome")
 public String AdminHome()
 {
   return "AdminHome";
 }

 @RequestMapping("/AdminLoginCheck")
  public ModelAndView adminCheck(HttpServletRequest request,@RequestParam String email,@RequestParam String pwd,@RequestParam String Designation)
  {
   ModelAndView mv=null; 
   if(Designation.equals("Admin"))
   {
    int x=m.AdminLoginCheck(email,pwd,Designation);
    System.out.println(x);
    if(x==1 && Designation.equals("Admin"))
    {
     mv=new ModelAndView("AdminHome") ;
 	 mv.addObject("email",email);
 	 HttpSession session=request.getSession();
 	 session.setAttribute("email", email);
     return mv;    
    }
   }
    if(Designation.equals("Employee"))
    {
     int x=m.EmployeeLoginCheck(email,pwd,Designation);
     if(x==1 && Designation.equals("Employee"))
     {
      mv=new ModelAndView("EmployeeHome") ;
 	  mv.addObject("email",email);
 	  HttpSession session=request.getSession();
 	  session.setAttribute("email", email);
      return mv;    
     }
    }
    if(Designation.equals("Manager"))
    {
	 int x=m.ManagerLoginCheck(email,pwd,Designation);
	 if(x==1 && Designation.equals("Manager"))
	 {
	  mv=new ModelAndView("ManagerHome");
	  mv.addObject("email",email);
	  HttpSession session=request.getSession();
	  session.setAttribute("email", email);
	  return mv;    
	 }
 	}
    if(Designation.equals("Support"))
    {
	 int x=m.SupportLoginCheck(email,pwd,Designation);
	 if(x==1 && Designation.equals("Support"))
	 {
	  mv=new ModelAndView("SupportHome");
	  mv.addObject("email",email);
	  HttpSession session=request.getSession();
	  session.setAttribute("email", email);
	  return mv;    
	 }
 	}
    else
    {
	 mv=new ModelAndView("AdminLogin","msg","Login Failed..Try Again");
	}
	 return mv;
 }
    
 @RequestMapping("/InsertUser")
  public String userInsert()
  {
   return "InsertUser";	
  }
 
 @RequestMapping("/InsertUserDetails")
  public ModelAndView empinsert(@ModelAttribute UsersBean e)//Model Attribute annotation as method parameter
  {
    MyDao m=new MyDao();
 	ModelAndView mv=null;
 	int x= m.InsertUserDetails(e);
 	if(x==1)
 	{
 	 mv=new ModelAndView("InsertUser","msg","Data Inserted Successfully") ;  
    }
    else
    {
 	 mv=new ModelAndView("InsertUser","msg","Data Not Inserted") ;
    }
 	return mv;
  }
 
 @RequestMapping("/Logout")
  public String logout(HttpServletRequest request)
 {
  HttpSession httpSession = request.getSession();
  httpSession.invalidate();
  return "AdminLogin";
 }
 
 @RequestMapping("/ViewUserDetails")
  public ModelAndView viewUserDetails(@ModelAttribute UsersBean e)//Model Attribute annotation as method parameter
  {
   MyDao m=new MyDao();
   ModelAndView mv=null;
   ArrayList<UsersBean> list= m.ViewUserDetails();
   mv=new ModelAndView("ViewUserDetails");
   mv.addObject("LIST",list);
   return mv;    
  }    
}