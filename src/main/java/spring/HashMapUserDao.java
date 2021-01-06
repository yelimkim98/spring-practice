package spring;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;

public class HashMapUserDao implements UserDao {

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
