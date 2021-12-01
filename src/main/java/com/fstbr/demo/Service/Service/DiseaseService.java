package com.fstbr.demo.Service.Service;

import com.fstbr.demo.Domain.Model.Disease;

import java.util.List;
import java.util.Map;

/**
 * 疾病表
 * 
 * @author stone001
 * @email 32108551@qq.com
 * @date 2021年12月1日 下午5:06:17
 */
public interface DiseaseService {
	
	Disease get(Integer id);
	
	List<Disease> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(Disease disease);
	
	int update(Disease disease);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
