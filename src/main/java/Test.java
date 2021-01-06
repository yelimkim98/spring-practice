import config.AppConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.User;
import spring.UserService;

public class Test {

    public static void main(String[] args) {
        ApplicationContext appContext =
            new AnnotationConfigApplicationContext(AppConfiguration.class);
        UserService userService =
            appContext.getBean("userService", UserService.class);

        userService.addUser(new User("test@email.com", "name", "password"));

        for (User user : userService.findAll()) {
            System.out.println(user.getEmail() + "\t" + user.getName());
        }
    }
}
