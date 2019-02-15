package beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AdminLogin")
public class AdminBean {
@Id
@Column(name="ID")
int Aid;
@Column(name="password")
String pwd;
String Designation;


public int getAid() {
	return Aid;
}
public void setAid(int aid) {
	Aid = aid;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public String getDesignation() {
	return Designation;
}
public void setDesignation(String designation) {
	Designation = designation;
}
}