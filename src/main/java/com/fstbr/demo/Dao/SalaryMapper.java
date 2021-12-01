package com.fstbr.demo.Dao;

import com.fstbr.demo.Domain.Model.Salary;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SalaryMapper {
//    @Select("select emp_no, from_date, salary, to_date from salaries")
    List<Salary> list();
}