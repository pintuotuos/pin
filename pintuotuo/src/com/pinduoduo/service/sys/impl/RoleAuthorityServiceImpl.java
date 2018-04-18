package com.pinduoduo.service.sys.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pinduoduo.dao.sys.RoleAuthorityDao;
import com.pinduoduo.model.sys.RoleAuthority;
import com.pinduoduo.service.sys.RoleAuthorityService;

import core.service.BaseService;

/**
 * @author Yang Tian
 * @email 1298588579@qq.com
 */
@Service
public class RoleAuthorityServiceImpl extends BaseService<RoleAuthority> implements RoleAuthorityService {

	private RoleAuthorityDao roleAuthorityDao;

	@Resource
	public void setRoleAuthorityDao(RoleAuthorityDao roleAuthorityDao) {
		this.roleAuthorityDao = roleAuthorityDao;
		this.dao = roleAuthorityDao;
	}

}
