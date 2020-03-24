package cn.wmxf.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
//配置类就是xml配置文件
@Configuration
public class MPConFig {
	
	//MP分页操作需要通过MP分页拦截器才能生效
	@Bean
	public PaginationInterceptor paginationInterceptor() {
		return new PaginationInterceptor();
	}
}
