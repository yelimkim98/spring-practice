package spring;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;

public class UserDao {

    private Map<String, User> usersByEmail = new HashMap<>();

    public void addUser(User user) {
        usersByEmail.put(user.getEmail(), user);
    }

    public Collection<User> findAll() {
        return usersByEmail.values();
    }
}
