package com.fstbr.demo.Controller;

import com.alibaba.fastjson.JSON;
import com.fstbr.demo.Entity.Result;
import com.fstbr.demo.Service.Service.GeneratorService;
import com.fstbr.demo.Utils.GenUtils;
import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/api/generator")
@RestController
public class GeneratorController {
	String prefix = "common/generator";
	@Autowired
	GeneratorService generatorService;

	@GetMapping()
	String generator() {
		return prefix + "/list";
	}

	@ResponseBody
	@GetMapping("/list")
	List<Map<String, Object>> list() {
		List<Map<String, Object>> list = generatorService.list();
		return list;
	};

	@PostMapping("/generatorAll")
	public Result<String> generateCode() {
		List<Map<String, Object>> list = generatorService.list();

		// 获取所有表
		String[] tableNames = new String[list.size()];
		for (int i = 0; i < list.size(); ++i) {
			tableNames[i] = String.valueOf(list.get(i).get("tableName"));
		}

		generatorService.generatorCode(tableNames);
		return Result.success("success");
	}

	@RequestMapping("/code/{tableName}")
	public Result<String> code(HttpServletRequest request, HttpServletResponse response,
							   @PathVariable("tableName") String tableName) throws IOException {
		String[] tableNames = new String[] { tableName };
		generatorService.generatorCode(tableNames);

		return Result.success("success");
	}

	@RequestMapping("/batchCode")
	public Result<String> batchCode(HttpServletRequest request, HttpServletResponse response, String tables) throws IOException {
		String[] tableNames = new String[] {};
		tableNames = JSON.parseArray(tables).toArray(tableNames);
		generatorService.generatorCode(tableNames);
		return Result.success("success");
	}

	@GetMapping("/edit")
	public String edit(Model model) {
		Configuration conf = GenUtils.getConfig();
		Map<String, Object> property = new HashMap<>(16);
		property.put("author", conf.getProperty("author"));
		property.put("email", conf.getProperty("email"));
		property.put("package", conf.getProperty("package"));
		property.put("autoRemovePre", conf.getProperty("autoRemovePre"));
		property.put("tablePrefix", conf.getProperty("tablePrefix"));
		model.addAttribute("property", property);
		return prefix + "/edit";
	}

	@ResponseBody
	@PostMapping("/update")
	Result<Object> update(@RequestParam Map<String, Object> map) {
		try {
			PropertiesConfiguration conf = new PropertiesConfiguration("generator.properties");
			conf.setProperty("author", map.get("author"));
			conf.setProperty("email", map.get("email"));
			conf.setProperty("package", map.get("package"));
			conf.setProperty("autoRemovePre", map.get("autoRemovePre"));
			conf.setProperty("tablePrefix", map.get("tablePrefix"));
			conf.save();
		} catch (ConfigurationException e) {
			return Result.error(500, "保存配置文件出错");
		}
		return Result.success("success");
	}
}
