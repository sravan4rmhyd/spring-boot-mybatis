package sample.mybatis;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import static org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType.H2;

@Configuration
@MapperScan(basePackages="sample.mybatis.persistence")
public class DatabaseConfig {

    @Bean
    public DataSource dataSource() {
    	/*BasicDataSource dataSource = new BasicDataSource();
    	dataSource.setUrl("jdbc:mysql://localhost:3306/sample");
    	dataSource.setUsername("root");
    	dataSource.setPassword("root");
    	dataSource.setDriverClassName("com.mysql.jdbc.Driver");
    	return dataSource;*/
    	return new EmbeddedDatabaseBuilder().setType(H2).build();
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        return sessionFactory.getObject();
    }

}
