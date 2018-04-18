package com.pinduoduo.service.sys.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pinduoduo.dao.sys.DepartmentDao;
import com.pinduoduo.model.sys.Department;
import com.pinduoduo.service.sys.DepartmentService;

import core.service.BaseService;

/**
 * @author Yang Tian
 * @email 1298588579@qq.com
 */
@Service
public class DepartmentServiceImpl extends BaseService<Department> implements DepartmentService {

	private DepartmentDao departmentDao;

	@Resource
	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
		this.dao = departmentDao;
	}

}
