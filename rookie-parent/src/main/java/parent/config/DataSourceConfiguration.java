package parent.config;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created by Administrator on 2017-3-7.
 */
@Configuration
@PropertySource("classpath:application.properties")
public class DataSourceConfiguration {
    @Value("${jdbc.driverClassName}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;
    @Bean
    public DataSource dataSource() throws Exception {
        Properties props = new Properties();
        props.put("driverClassName", driver);
        props.put("url", url);
        props.put("username", username);
        props.put("password", password);
        return DruidDataSourceFactory.createDataSource(props);
    }
}
