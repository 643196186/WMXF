package cn.wmxf.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cn.wmxf.pojo.User;

@Mapper
public interface UserMapper {

	Integer getRowCount(@Param("username") String username);
	
	/**
	 * 基于条件查询用户数据，获取当前页要显示的信息
	 * @param username		查询条件：用户昵称
	 * @param startIndex	查询起始位置
	 * @param pageSize		页面显示条数
	 * @return				当前页数据
	 */
	List<User> findPageObjects(
			@Param("username") String username,
			@Param("startIndex") Integer startIndex,
			@Param("pageSize") Integer pageSize
			);
}
