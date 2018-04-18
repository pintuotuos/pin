package com.pinduoduo.service.sys;

import java.util.List;

import com.pinduoduo.model.sys.Config;

import core.service.Service;

/**
 * @author Yang Tian
 * @email 1298588579@qq.com
 */
public interface ConfigService extends Service<Config> {

	List<Config> getConfigList(List<Config> resultList);

}
