package com.fstbr.demo.Dao;

import com.fstbr.demo.Domain.Model.Salaries;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author stone001
 * @email 32108551@qq.com
 * @date 2021年12月1日 下午5:06:17
 */
@Mapper
public interface SalariesDao {

	Salaries get(Integer empNo);
	
	List<Salaries> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(Salaries salaries);
	
	int update(Salaries salaries);
	
	int remove(Integer emp_no);
	
	int batchRemove(Integer[] empNos);
}
