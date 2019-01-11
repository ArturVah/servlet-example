package com.mainserver.webik;

import java.util.ArrayList;
import java.util.List;

public class Security {
    private static List<User> users = new ArrayList<User>() {{
        add(new User("user1", "password1", "Valodik Valodikyan"));
        add(new User("user2", "password2", "adolf Hitler"));
        add(new User("user3", "password3", "Joseph Stalin"));
    }};

    static User login(String username, String password) {
        return users
                .stream()
                .filter(u -> u.getUsername().equals(username)
                        && u.getPassword().equals(password)
                )
                .findFirst()
                .orElse(null);
    }
}

