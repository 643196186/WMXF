package cn.wmxf.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wmxf.config.PaginationProperties;
import com.wmxf.util.Assert;

import cn.wmxf.mapper.UserMapper;
import cn.wmxf.pojo.User;
import cn.wmxf.service.UserService;
import cn.wmxf.vo.PageObject;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private PaginationProperties paginationProperties;
	
	@Override
	public PageObject<User> findPageObjects(String username, Integer pageCurrent) {
		//参数有效性验证
		Assert.isArgumentValid(pageCurrent==null || pageCurrent<1, "参数值不正确");
		//查询总记录数并校验
		Integer rowCount = userMapper.getRowCount(username);
		Assert.isServiceValid(rowCount==0, "没有找到对应记录");
		//查询当前页信息
		int pageSize=paginationProperties.getPageSize();	//获取页面数据条数
		int startIndex=paginationProperties.getStartIndex(pageCurrent);		//获取从第几个开始查
		List<User> records = userMapper.findPageObjects(username, startIndex, pageSize);
		
		return new PageObject<>(rowCount, records, pageSize, pageCurrent);
	}

}
