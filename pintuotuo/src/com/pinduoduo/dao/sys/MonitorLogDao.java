package com.pinduoduo.dao.sys;

import java.util.List;

import com.pinduoduo.model.sys.MonitorLog;

import core.dao.Dao;

/**
 * @author Yang Tian
 * @email 1298588579@qq.com
 */
public interface MonitorLogDao extends Dao<MonitorLog> {

	List<MonitorLog> querySensorMonitorLog();

}
