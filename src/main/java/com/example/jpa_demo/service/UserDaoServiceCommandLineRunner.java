package com.example.jpa_demo.service;

import com.example.jpa_demo.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {

    @Autowired
    private UserDAOService service;

    /* Logger from org.slf4j.Logger */
    private static final Logger log = LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);

    @Override
    public void run(String... args) throws Exception {

        User user = new User("Jack", "Admin");
        long insert = service.insert(user);
        log.info("New User is Created : "+user);
    }
}
