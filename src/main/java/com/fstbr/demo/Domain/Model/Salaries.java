package com.fstbr.demo.Domain.Model;

import java.io.Serializable;
import java.util.Date;
import com.alibaba.fastjson.JSONObject;



/**
 * 
 * 
 * @author stone001
 * @email 32108551@qq.com
 * @date 2021年12月1日 下午5:06:17
 */
public class Salaries implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer empNo;
	//
	private Integer salary;
	//
	private Date fromDate;
	//
	private Date toDate;

	/**
	 * 设置：
	 */
	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}
	/**
	 * 获取：
	 */
	public Integer getEmpNo() {
		return empNo;
	}
	/**
	 * 设置：
	 */
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	/**
	 * 获取：
	 */
	public Integer getSalary() {
		return salary;
	}
	/**
	 * 设置：
	 */
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	/**
	 * 获取：
	 */
	public Date getFromDate() {
		return fromDate;
	}
	/**
	 * 设置：
	 */
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	/**
	 * 获取：
	 */
	public Date getToDate() {
		return toDate;
	}
}
