package com.crazy.learn.configuration;

import com.crazy.learn.interceptor.LoginInterceptor;
import com.crazy.learn.interceptor.RiskInterceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.sql.DataSource;

/**
 * @Author guofeng@picooc.com
 * @Date 2020-04-13
 * @Version V1.0
 **/
@Configuration
@MapperScan("com.crazy.learn.mapper")
public class WebConfiguration implements WebMvcConfigurer {




	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**");
		registry.addInterceptor(new RiskInterceptor()).addPathPatterns("/risk/**");
	}

//	@Bean
//	public SqlSessionFactory sqlSessionFactory(@Qualifier("dataSource") DataSource dataSource) throws Exception {
//		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//		bean.setDataSource(dataSource);
//		bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml"));
//		return bean.getObject();
//	}
//
//	@Bean
//	public DataSourceTransactionManager transactionManager(@Qualifier("dataSource") DataSource dataSource) {
//		return new DataSourceTransactionManager(dataSource);
//	}
//
//	@Bean
//	public SqlSessionTemplate financeSqlSessionTemplate(SqlSessionFactory sqlSessionFactory) throws Exception {
//		return new SqlSessionTemplate(sqlSessionFactory);
//	}
}
