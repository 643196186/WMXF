package cn.wmxf.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.wmxf.mapper.StoreMapper;
import cn.wmxf.pojo.Store;
import cn.wmxf.service.StoreService;
import cn.wmxf.util.Assert;
import cn.wmxf.util.PaginationProperties;
import cn.wmxf.vo.PageObject;

@Service
public class StoreServiceImpl implements StoreService{
	
	@Autowired
	private StoreMapper storeMapper;
	@Autowired
	private PaginationProperties paginationProperties;		//引入展示多少条记录
	
	@Override
	public PageObject<Store> findPageObjects(String shopname, Integer pageCurrent) {
		//1.参数校验
				//if(pageCurrent==null||pageCurrent<1)
					//throw new IllegalArgumentException("页码值不正确");
				Assert.isArgumentValid(pageCurrent==null||pageCurrent<1, "页码值不正确");
				//2.基于用户名查询总记录数并校验
				Integer rowCount=storeMapper.getRowCount(shopname);
				//if(rowCount==0)
					//throw new ServiceException("没有找到对应记录");
				Assert.isServiceValid(rowCount==0, "没有找到对应记录");
				//3.查询当前页记录
				Integer pageSize=paginationProperties.getPageSize();//页面大小
				Integer startIndex=paginationProperties.getStartIndex(pageCurrent);
				List<Store> records=
				storeMapper.findPageObjects(shopname, startIndex, pageSize);
				//4.封装查询结果并返回
				return new PageObject<>(rowCount, records, pageSize, pageCurrent);
	}
	
}
