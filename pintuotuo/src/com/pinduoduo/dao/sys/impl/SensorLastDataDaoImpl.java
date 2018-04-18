package com.pinduoduo.dao.sys.impl;

import org.springframework.stereotype.Repository;

import com.pinduoduo.dao.sys.SensorLastDataDao;
import com.pinduoduo.model.sys.SensorLastData;

import core.dao.BaseDao;

/**
 * @author Yang Tian
 * @email 1298588579@qq.com
 */
@Repository
public class SensorLastDataDaoImpl extends BaseDao<SensorLastData> implements SensorLastDataDao {

	public SensorLastDataDaoImpl() {
		super(SensorLastData.class);
	}

}
