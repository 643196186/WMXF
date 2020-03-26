package cn.wmxf.StoreMapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import cn.wmxf.mapper.StoreMapper;

@SpringBootTest
public class StoreMapperTests {
	
	@Autowired
	private StoreMapper stroeMapper;
	
	@Test
	public void testGetRowCount() {
		int rows=
		stroeMapper.getRowCount(null);
		System.out.println("rows="+rows);
	}
}
