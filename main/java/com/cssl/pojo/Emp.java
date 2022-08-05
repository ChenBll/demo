package com.cssl.pojo;


import java.sql.Date;


public class Emp {
	private Integer empno;
	private String ename;
	private Date hiredate;
	private Integer sal;
	private Integer dept_no;
	
	public Integer getEmpno() {
		return empno;
	}
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public Integer getSal() {
		return sal;
	}
	public void setSal(Integer sal) {
		this.sal = sal;
	}
	public Integer getDept_no() {
		return dept_no;
	}
	public void setDept_no(Integer dept_no) {
		this.dept_no = dept_no;
	}
	public Emp(String ename, Date hiredate, Integer sal, Integer dept_no) {
		super();
		this.ename = ename;
		this.hiredate = hiredate;
		this.sal = sal;
		this.dept_no = dept_no;
	}
	
	
	
	public Emp(Integer empno, String ename, Date hiredate, Integer sal, Integer dept_no) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.hiredate = hiredate;
		this.sal = sal;
		this.dept_no = dept_no;
	}
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", hiredate=" + hiredate + ", sal=" + sal + ", dept_no="
				+ dept_no + "]";
	}
	public Emp() {
		super();
	}
	
}
