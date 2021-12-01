package com.fstbr.demo.Domain.Model;

import java.io.Serializable;
import java.util.Date;
import com.alibaba.fastjson.JSONObject;



/**
 * 疾病表
 * 
 * @author stone001
 * @email 32108551@qq.com
 * @date 2021年12月1日 下午5:06:17
 */
public class Disease implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//父级ID
	private Integer parentId;
	//层级
	private Integer level;
	//0：无效 1：有效
	private Integer status;
	//疾病
	private String diseaseName;
	//添加时间
	private Date createTime;
	//创建人
	private Integer creator;
	//修改时间
	private Date updateTime;
	//修改人
	private Integer updator;

	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：父级ID
	 */
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	/**
	 * 获取：父级ID
	 */
	public Integer getParentId() {
		return parentId;
	}
	/**
	 * 设置：层级
	 */
	public void setLevel(Integer level) {
		this.level = level;
	}
	/**
	 * 获取：层级
	 */
	public Integer getLevel() {
		return level;
	}
	/**
	 * 设置：0：无效 1：有效
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：0：无效 1：有效
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：疾病
	 */
	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}
	/**
	 * 获取：疾病
	 */
	public String getDiseaseName() {
		return diseaseName;
	}
	/**
	 * 设置：添加时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：添加时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：创建人
	 */
	public void setCreator(Integer creator) {
		this.creator = creator;
	}
	/**
	 * 获取：创建人
	 */
	public Integer getCreator() {
		return creator;
	}
	/**
	 * 设置：修改时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：修改时间
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * 设置：修改人
	 */
	public void setUpdator(Integer updator) {
		this.updator = updator;
	}
	/**
	 * 获取：修改人
	 */
	public Integer getUpdator() {
		return updator;
	}
}
