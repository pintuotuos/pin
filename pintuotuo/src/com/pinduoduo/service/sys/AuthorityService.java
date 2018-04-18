package com.pinduoduo.service.sys;

import java.util.List;

import com.pinduoduo.model.sys.Authority;
import com.pinduoduo.model.sys.RoleAuthority;

import core.service.Service;

/**
 * @author Yang Tian
 * @email 1298588579@qq.com
 */
public interface AuthorityService extends Service<Authority> {

	List<Authority> queryByParentIdAndRole(Short role);

	List<Authority> queryChildrenByParentIdAndRole(Long parentId, Short role);

	String querySurfaceAuthorityList(List<RoleAuthority> queryByProerties, Long id, String buttons);

}
