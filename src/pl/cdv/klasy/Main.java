package pl.cdv.klasy;

import java.util.List;

public class Main {

    public static void main(String[] args) {
       /* User[] users = new User[4];

        users[0] = new User("login", "pas", "email@email", 24 );
        users[1] = new User("loaaaa", "pasaaaa", "emailaaaaa@email", 24 );
        users[2] = new User("lobbbb", "pasbbbb", "emailbbbbb@email", 24 );
        users[3] = new User("locccc", "pascccc", "emailccccc@email", 24 );

        UserService userService = new UserService(users);

        List<User> filteredUsers = userService.findUserByPartLogin("lo");

        System.out.println(filteredUsers);*/

        Car car = new Car("opel", "green", new Engine("electric"));
        Car car2 = new Car("toyota", "blue", new Engine("hybrid"));

        System.out.println(car.engine);
        System.out.println(car2.engine);
}
}