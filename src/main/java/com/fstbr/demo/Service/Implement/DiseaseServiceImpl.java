package com.fstbr.demo.Service.Implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.fstbr.demo.Dao.DiseaseDao;
import com.fstbr.demo.Domain.Model.Disease;
import com.fstbr.demo.Service.Service.DiseaseService;



@Service
public class DiseaseServiceImpl implements DiseaseService {
	@Autowired
	private DiseaseDao diseaseDao;
	
	@Override
	public Disease get(Integer id){
		return diseaseDao.get(id);
	}
	
	@Override
	public List<Disease> list(Map<String, Object> map){
		return diseaseDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return diseaseDao.count(map);
	}
	
	@Override
	public int save(Disease disease){
		return diseaseDao.save(disease);
	}
	
	@Override
	public int update(Disease disease){
		return diseaseDao.update(disease);
	}
	
	@Override
	public int remove(Integer id){
		return diseaseDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return diseaseDao.batchRemove(ids);
	}
	
}
