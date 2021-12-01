package com.fstbr.demo.Service.Service;

import com.fstbr.demo.Dao.SalaryMapper;
import com.fstbr.demo.Domain.Model.Salary;
import com.fstbr.demo.Service.Implement.ISalaryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SalaryService implements ISalaryService {
    @Resource
    SalaryMapper salaryMapper;

    @Override
    public List<Salary> list() {
        return salaryMapper.list();
    }
}
