package pl.cdv.klasy;

import java.util.LinkedList;
import java.util.List;

public class UserService {

    private User[] users;

    public UserService(User[] users) {
        this.users = users;
    }

    public User findUserByLogin(String login) {
        for (User user : users) {
            if (user.login.equals(login)) {

                return user;
            }

        }
        return  null;
    }

    public List<User> findUserByPartLogin(String login) {

        List<User> users = new LinkedList<>();

        for (User user : this.users) {
            if (user.login.contains(login)) {

                users.add(user);
                return users;
            }

        }
        return null;
    }
}
