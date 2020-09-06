package com.example.gl.rabbit.redis.service;


import com.example.gl.rabbit.redis.entity.Company;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface CompanyService {
	//查找参建单位名称
	List<Company> getCompany(String companyId, HttpServletRequest request);

}
