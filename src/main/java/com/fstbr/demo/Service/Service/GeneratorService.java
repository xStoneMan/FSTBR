package com.fstbr.demo.Service.Service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

/**
 * 
 */
@Service
public interface GeneratorService {
	List<Map<String, Object>> list();

	void generatorCode(String[] tableNames);
}
