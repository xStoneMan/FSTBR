package com.fstbr.demo.Controller;

import com.fstbr.demo.Domain.Model.Salary;
import com.fstbr.demo.Entity.Result;
import com.fstbr.demo.Service.Implement.ISalaryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/")
public class IndexApi {

    @Resource
    ISalaryService salaryService;

    @GetMapping("/index")
    public Result<? extends Object> Index() {
        List<Salary> salaries = salaryService.list();
        return Result.success(salaries);
    }
}
