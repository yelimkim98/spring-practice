package spring;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

    @Autowired
    private UserDao userDao;

    public void addUser(User user) {
        userDao.addUser(user);
    }

    public Collection<User> findAll() {
        return userDao.findAll();
    }
}
