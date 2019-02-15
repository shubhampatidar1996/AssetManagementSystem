package dao;

import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Restrictions;
import beans.AdminBean;
import beans.AssetBean;
import beans.UsersBean;

public class MyDao 
{
 public MyDao()
 {
    SessionFactory sf=new AnnotationConfiguration().configure().buildSessionFactory();
	AdminBean a=new AdminBean();
	a.setAid(12345);
	a.setPwd("Admin");
	a.setDesignation("Admin");
	Session ss=sf.openSession();
	Transaction tt=ss.beginTransaction();
	ss.saveOrUpdate(a);
	tt.commit();
	ss.close();
 }

 public int AdminLoginCheck(int Aid,String password,String Designation)
 {  	
    SessionFactory sf=new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
    int x=0;
	Session ss=sf.openSession();
    //Transaction tt=ss.beginTransaction();
	Criteria ct=ss.createCriteria(AdminBean.class);
	ct.add(Restrictions.eq("Aid",Aid));
	ct.add(Restrictions.eq("pwd", password));
	ct.add(Restrictions.eq("Designation", Designation));
	ArrayList<AdminBean> list=(ArrayList<AdminBean>)ct.list();
    if(list.isEmpty())
      x=0;
    else
      x=1;
    ss.close();
    return x;
 }
 
 public int EmployeeLoginCheck(int eeid,String password,String Designation)
 {  	
    SessionFactory sf=new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
    int x=0;
	Session ss=sf.openSession();
	Criteria ct=ss.createCriteria(UsersBean.class);
	ct.add(Restrictions.eq("eeid", eeid));
	ct.add(Restrictions.eq("pwd", password));
	ct.add(Restrictions.eq("Designation", Designation));
	ArrayList<UsersBean> list=(ArrayList<UsersBean>)ct.list();

    if(list.isEmpty())
      x=0;
    else
      x=1;
    ss.close();
    return x;
 }

 public int ManagerLoginCheck(int mmid,String password,String Designation)
 {  	
    SessionFactory sf=new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
    int x=0;
	Session ss=sf.openSession();
    //Transaction tt=ss.beginTransaction();
	Criteria ct=ss.createCriteria(UsersBean.class);
	ct.add(Restrictions.eq("mmid", mmid));
	ct.add(Restrictions.eq("pwd", password));
	ct.add(Restrictions.eq("Designation", Designation));
	ArrayList<UsersBean> list=(ArrayList<UsersBean>)ct.list();

    if(list.isEmpty())
      x=0;
    else
      x=1;
    ss.close();
    return x;
 }

 public int SupportLoginCheck(int ssid,String password,String Designation)
 {  	
    SessionFactory sf=new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
    int x=0;
	Session ss=sf.openSession();
    //Transaction tt=ss.beginTransaction();
	Criteria ct=ss.createCriteria(UsersBean.class);
	ct.add(Restrictions.eq("ssid", ssid));
	ct.add(Restrictions.eq("pwd", password));
	ct.add(Restrictions.eq("Designation", Designation));
	ArrayList<UsersBean> list=(ArrayList<UsersBean>)ct.list();

    if(list.isEmpty())
      x=0;
    else
      x=1;
    ss.close();
    return x;
 }
 
 public int InsertUserDetails(UsersBean e)
 {    
    int x=0;
	SessionFactory sf=new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session ss=sf.openSession();
	Transaction tt=ss.beginTransaction();
	Object o=ss.save(e);
	if(o!=null)
	  x=1;
	tt.commit();
	ss.close();
	return x;
 }

 public ArrayList<UsersBean>ViewUserDetails()
 {   
    SessionFactory sf=new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session ss=sf.openSession();
	Criteria ct=ss.createCriteria(UsersBean.class);
	ArrayList<UsersBean> list=(ArrayList<UsersBean>)ct.list();
    return list;
 }
 
 public int InsertAssetsDetails(AssetBean e)
 {    
    int x=0;
	SessionFactory sf=new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session ss=sf.openSession();
	Transaction tt=ss.beginTransaction();
	Object o=ss.save(e);
	if(o!=null)
	  x=1;
	tt.commit();
	ss.close();
	return x;
 }
 
 }
