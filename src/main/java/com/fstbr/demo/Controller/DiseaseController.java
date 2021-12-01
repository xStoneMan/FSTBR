package com.fstbr.demo.Controller;

import java.util.List;
import java.util.Map;

import com.fstbr.demo.Entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.fstbr.demo.Domain.Model.Disease;
import com.fstbr.demo.Service.Service.DiseaseService;
import com.fstbr.demo.Utils.PageUtils;
import com.fstbr.demo.Utils.Query;

/**
 * 疾病表
 * 
 * @author stone001
 * @email 32108551@qq.com
 * @date 2021年12月1日 下午5:06:17
 */
 
@RestController
@RequestMapping("/api/disease")
public class DiseaseController {
	@Autowired
	private DiseaseService diseaseService;
	
	@GetMapping()
	String Disease(){
	    return "api/disease/disease";
	}
	
	@ResponseBody
	@GetMapping("/list")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<Disease> diseaseList = diseaseService.list(query);
		int total = diseaseService.count(query);
		PageUtils pageUtils = new PageUtils(diseaseList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	String add(){
	    return "api/disease/add";
	}

	@GetMapping("/edit/{id}")
	String edit(@PathVariable("id") Integer id,Model model){
		Disease disease = diseaseService.get(id);
		model.addAttribute("disease", disease);
	    return "api/disease/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	public Result<? extends Object> save( Disease disease){
		if(diseaseService.save(disease)>0){
			return Result.success("success");
		}
		return Result.error(500, "error");
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	public Result<? extends Object> update( Disease disease){
		diseaseService.update(disease);
		return Result.success("success");
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	public Result<? extends Object> remove( Integer id){
		if(diseaseService.remove(id)>0){
		return Result.success("success");
		}
		return Result.error(500, "error");
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	public Result<? extends Object> remove(@RequestParam("ids[]") Integer[] ids){
		diseaseService.batchRemove(ids);
		return Result.success("success");
	}
	
}
