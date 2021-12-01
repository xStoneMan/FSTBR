package com.fstbr.demo.Service.Implement;

import com.fstbr.demo.Dao.SalaryMapper;
import com.fstbr.demo.Domain.Model.Salary;
import com.fstbr.demo.Service.Service.SalaryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SalaryServiceImpl implements SalaryService {
    @Resource
    SalaryMapper salaryMapper;

    @Override
    public List<Salary> list() {
        return salaryMapper.list();
    }
}
