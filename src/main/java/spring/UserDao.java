package spring;

import java.util.Collection;

public interface UserDao {

    void addUser(User user);

    Collection<User> findAll();
}
