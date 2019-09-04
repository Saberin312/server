package com.example.demo;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collection;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Resource
	DataSource dataSource;

	@Test
	public void contextLoads() throws SQLException {
		System.out.println("数据源>>>" + dataSource.getClass());
		Connection connection = dataSource.getConnection();
		System.out.println("链接>>>>" + connection);
		System.out.println("链接地址>>>>" + connection.getMetaData().getURL());
		connection.close();
	}



}
