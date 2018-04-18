package com.pinduoduo.dao.sys.impl;

import org.springframework.stereotype.Repository;

import com.pinduoduo.dao.sys.DepartmentDao;
import com.pinduoduo.model.sys.Department;

import core.dao.BaseDao;

/**
 * @author Yang Tian
 * @email 1298588579@qq.com
 */
@Repository
public class DepartmentDaoImpl extends BaseDao<Department> implements DepartmentDao {

	public DepartmentDaoImpl() {
		super(Department.class);
	}

}
