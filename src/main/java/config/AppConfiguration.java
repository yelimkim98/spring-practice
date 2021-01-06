package config;

import org.springframework.context.annotation.Bean;
import spring.HashMapUserDao;
import spring.MySqlUserDao;
import spring.UserDao;
import spring.UserService;

public class AppConfiguration {

    @Bean
    public UserDao hashMapUserDao() {
        return new HashMapUserDao();
    }

    @Bean
    public UserDao mySqlUserDao() {
        return new MySqlUserDao();
    }

    @Bean
    public UserService userService() {
        return new UserService();
    }
}
