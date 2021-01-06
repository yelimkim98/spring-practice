import java.util.Collection;

public class UserService {

    private UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public void addUser(User user) {
        userDao.addUser(user);
    }

    public Collection<User> findAll() {
        return userDao.findAll();
    }
}
