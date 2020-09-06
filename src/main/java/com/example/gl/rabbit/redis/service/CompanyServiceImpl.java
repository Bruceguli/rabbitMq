package com.example.gl.rabbit.redis.service;

import com.example.gl.rabbit.lehuBase.AnyException;
import com.example.gl.rabbit.redis.dao.CompanyDao;
import com.example.gl.rabbit.redis.entity.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService{

	@Autowired
	private CompanyDao companyDao;
	//查询参建单位名称
	@Override
	public List<Company> getCompany(String projectId, HttpServletRequest request) {
		//String companyId = projectDao.getProjectId(projectId);
		if(projectId==null&&projectId==""){
			throw new AnyException("请先选择项目");
		}
		List<Company> company = companyDao.getCompany(projectId);
		return company;
	}



}
