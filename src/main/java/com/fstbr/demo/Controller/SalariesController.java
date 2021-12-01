package com.fstbr.demo.Controller;

import java.util.List;
import java.util.Map;

import com.fstbr.demo.Entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.fstbr.demo.Domain.Model.Salaries;
import com.fstbr.demo.Service.Service.SalariesService;
import com.fstbr.demo.Utils.PageUtils;
import com.fstbr.demo.Utils.Query;

/**
 * 
 * 
 * @author stone001
 * @email 32108551@qq.com
 * @date 2021年12月1日 下午5:06:17
 */
 
@RestController
@RequestMapping("/api/salaries")
public class SalariesController {
	@Autowired
	private SalariesService salariesService;
	
	@GetMapping()
	String Salaries(){
	    return "api/salaries/salaries";
	}
	
	@ResponseBody
	@GetMapping("/list")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<Salaries> salariesList = salariesService.list(query);
		int total = salariesService.count(query);
		PageUtils pageUtils = new PageUtils(salariesList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	String add(){
	    return "api/salaries/add";
	}

	@GetMapping("/edit/{empNo}")
	String edit(@PathVariable("empNo") Integer empNo,Model model){
		Salaries salaries = salariesService.get(empNo);
		model.addAttribute("salaries", salaries);
	    return "api/salaries/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	public Result<? extends Object> save( Salaries salaries){
		if(salariesService.save(salaries)>0){
			return Result.success("success");
		}
		return Result.error(500, "error");
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	public Result<? extends Object> update( Salaries salaries){
		salariesService.update(salaries);
		return Result.success("success");
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	public Result<? extends Object> remove( Integer empNo){
		if(salariesService.remove(empNo)>0){
		return Result.success("success");
		}
		return Result.error(500, "error");
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	public Result<? extends Object> remove(@RequestParam("ids[]") Integer[] empNos){
		salariesService.batchRemove(empNos);
		return Result.success("success");
	}
	
}
