import config.AppConfiguration;
import java.util.Collection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.User;
import spring.UserService;

public class Test {

    public static void main(String[] args) {
        UserService userService = getUserServiceBean();

        User user = new User("test@email.com", "name", "password");
        userService.addUser(user);

        printUsers(userService.findAll());
    }

    private static UserService getUserServiceBean() {
        ApplicationContext appContext =
            new AnnotationConfigApplicationContext(AppConfiguration.class);

        return appContext.getBean("userService", UserService.class);
    }

    private static void printUsers(Collection<User> users) {
        for (User user : users) {
            System.out.println(user.getEmail() + "\t" + user.getName());
        }
    }
}
