package com.fstbr.demo.Service.Implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.fstbr.demo.Dao.SalariesDao;
import com.fstbr.demo.Domain.Model.Salaries;
import com.fstbr.demo.Service.Service.SalariesService;



@Service
public class SalariesServiceImpl implements SalariesService {
	@Autowired
	private SalariesDao salariesDao;
	
	@Override
	public Salaries get(Integer empNo){
		return salariesDao.get(empNo);
	}
	
	@Override
	public List<Salaries> list(Map<String, Object> map){
		return salariesDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return salariesDao.count(map);
	}
	
	@Override
	public int save(Salaries salaries){
		return salariesDao.save(salaries);
	}
	
	@Override
	public int update(Salaries salaries){
		return salariesDao.update(salaries);
	}
	
	@Override
	public int remove(Integer empNo){
		return salariesDao.remove(empNo);
	}
	
	@Override
	public int batchRemove(Integer[] empNos){
		return salariesDao.batchRemove(empNos);
	}
	
}
