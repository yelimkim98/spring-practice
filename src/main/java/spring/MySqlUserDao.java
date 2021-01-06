package spring;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MySqlUserDao implements UserDao {

    private Map<String, User> usersByEmail = new HashMap<>();

    @Override
    public void addUser(User user) {
        usersByEmail.put(user.getEmail(), user);
    }

    @Override
    public Collection<User> findAll() {
        return usersByEmail.values();
    }
}
