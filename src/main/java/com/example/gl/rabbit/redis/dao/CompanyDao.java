package com.example.gl.rabbit.redis.dao;


import com.example.gl.rabbit.redis.entity.Company;

import java.util.List;

public interface CompanyDao {
	//获取参建单位ID及名称
	List<Company> getCompany(String projectId);
	//新增参建单位

}
