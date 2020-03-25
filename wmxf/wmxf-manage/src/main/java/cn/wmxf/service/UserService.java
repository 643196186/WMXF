package cn.wmxf.service;

import cn.wmxf.pojo.User;
import cn.wmxf.vo.PageObject;

public interface UserService {

	/**
	 * 基于分页条件查询用户信息
	 * @param username		查询条件
	 * @param pageCurrent	当前页码
	 * @return
	 */
	PageObject<User> findPageObjects(String username, Integer pageCurrent);
}