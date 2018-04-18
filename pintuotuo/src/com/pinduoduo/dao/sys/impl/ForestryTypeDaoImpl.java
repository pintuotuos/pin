package com.pinduoduo.dao.sys.impl;

import org.springframework.stereotype.Repository;

import com.pinduoduo.dao.sys.ForestryTypeDao;
import com.pinduoduo.model.sys.ForestryType;

import core.dao.BaseDao;

/**
 * @author Yang Tian
 * @email 1298588579@qq.com
 */
@Repository
public class ForestryTypeDaoImpl extends BaseDao<ForestryType> implements ForestryTypeDao {

	public ForestryTypeDaoImpl() {
		super(ForestryType.class);
	}

}
