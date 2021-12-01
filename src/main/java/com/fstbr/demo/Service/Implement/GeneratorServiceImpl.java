package com.fstbr.demo.Service.Implement;

import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Map;

import com.fstbr.demo.Dao.GeneratorMapper;
import com.fstbr.demo.Service.Service.GeneratorService;
import com.fstbr.demo.Utils.GenUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GeneratorServiceImpl implements GeneratorService {
	@Autowired
	GeneratorMapper generatorMapper;

	@Override
	public List<Map<String, Object>> list() {
		List<Map<String, Object>> list = generatorMapper.list();
		return list;
	}

	@Override
	public void generatorCode(String[] tableNames) {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		for(String tableName : tableNames){
			//查询表信息
			Map<String, String> table = generatorMapper.get(tableName);
			//查询列信息
			List<Map<String, String>> columns = generatorMapper.listColumns(tableName);
			//生成代码
			GenUtils.generatorCode(table, columns);
		}
		outputStream.toByteArray();
	}

}
