package cn.wmxf.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cn.wmxf.pojo.Store;

@Mapper
public interface StoreMapper{

	Integer getRowCount(String shopname);

	List<Store> findPageObjects(String shopname, Integer startIndex, Integer pageSize);

}
