package com.pinduoduo.dao.sys.impl;

import org.springframework.stereotype.Repository;

import com.pinduoduo.dao.sys.SysUserDao;
import com.pinduoduo.model.sys.SysUser;

import core.dao.BaseDao;

/**
 * @author Yang Tian
 * @email 1298588579@qq.com
 */
@Repository
public class SysUserDaoImpl extends BaseDao<SysUser> implements SysUserDao {

	public SysUserDaoImpl() {
		super(SysUser.class);
	}

}
