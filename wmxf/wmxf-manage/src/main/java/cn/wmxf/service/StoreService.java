package cn.wmxf.service;

import cn.wmxf.pojo.Store;
import cn.wmxf.vo.PageObject;


public interface StoreService {

	PageObject<Store> findPageObjects(String shopname, Integer pageCurrent);
	
	
	
}
