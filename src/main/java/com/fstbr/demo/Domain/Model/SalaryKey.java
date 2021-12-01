package com.fstbr.demo.Domain.Model;

import java.util.Date;

public class SalaryKey {
    private Integer empNo;

    private Date fromDate;

    public SalaryKey(Integer empNo, Date fromDate) {
        this.empNo = empNo;
        this.fromDate = fromDate;
    }

    public SalaryKey() {
        super();
    }

    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }
}