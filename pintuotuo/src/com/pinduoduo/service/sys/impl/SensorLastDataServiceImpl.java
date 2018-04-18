package com.pinduoduo.service.sys.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pinduoduo.dao.sys.SensorLastDataDao;
import com.pinduoduo.model.sys.SensorLastData;
import com.pinduoduo.service.sys.SensorLastDataService;

import core.service.BaseService;

/**
 * @author Yang Tian
 * @email 1298588579@qq.com
 */
@Service
public class SensorLastDataServiceImpl extends BaseService<SensorLastData> implements SensorLastDataService {

	private SensorLastDataDao sensorLastDataDao;

	@Resource
	public void setSensorLastDataDao(SensorLastDataDao sensorLastDataDao) {
		this.sensorLastDataDao = sensorLastDataDao;
		this.dao = sensorLastDataDao;
	}

}
