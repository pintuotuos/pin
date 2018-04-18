package com.pinduoduo.dao.sys;

import java.util.List;

import com.pinduoduo.model.sys.Forestry;

import core.dao.Dao;

/**
 * @author Yang Tian
 * @email 1298588579@qq.com
 */
public interface ForestryDao extends Dao<Forestry> {
	
	List<Object[]> queryExportedForestry(Long[] ids);

}
