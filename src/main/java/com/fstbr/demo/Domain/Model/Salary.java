package com.fstbr.demo.Domain.Model;

import java.util.Date;

public class Salary extends SalaryKey {
    private Integer salary;

    private Date toDate;

    public Salary(Integer empNo, Date fromDate, Integer salary, Date toDate) {
        super(empNo, fromDate);
        this.salary = salary;
        this.toDate = toDate;
    }

    public Salary() {
        super();
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }
}