package dao;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import beans.AssetBean;

public class EmpDao {
	public ArrayList<AssetBean>ViewAsset()
	 {   
	    SessionFactory sf=new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session ss=sf.openSession();
		Criteria ct=ss.createCriteria(AssetBean.class);
		ArrayList<AssetBean> list=(ArrayList<AssetBean>)ct.list();
	    return list;
	 }

}
