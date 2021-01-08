import config.AppConfiguration;
import java.time.LocalDateTime;
import java.util.Collection;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import spring.User;
import spring.UserService;

public class Test {

    public static void main(String[] args) {
        // 컨테이너 초기화
        AbstractApplicationContext appContext =
            new AnnotationConfigApplicationContext(AppConfiguration.class);
        System.out.println("time after create application context : " + LocalDateTime.now().toString());

        // 어느 정도의 시간동안 프로그램 정지
        sleepForFewSeconds();
        System.out.println("time after sleep for a few seconds : " + LocalDateTime.now().toString());

        // 컨테이너에서 Bean 객체를 구해서 사용
        UserService userService = appContext.getBean("userService", UserService.class);

        User user = new User("test@email.com", "name", "password");
        userService.addUser(user);

        printUsers(userService.findAll());

        // 컨테이너 종료
        appContext.close();
    }

    private static void sleepForFewSeconds() {
        for (int i = 0; i < 10_000_000; i++) {
        }
    }

    private static void printUsers(Collection<User> users) {
        for (User user : users) {
            System.out.println(user.getEmail() + "\t" + user.getName());
        }
    }
}
