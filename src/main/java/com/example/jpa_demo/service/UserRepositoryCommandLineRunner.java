package com.example.jpa_demo.service;

import com.example.jpa_demo.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

    @Autowired
    UserRepository repo;

    /* Logger from org.slf4j.Logger */
    private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);

    @Override
    public void run(String... args) throws Exception {

            User user = new User("Jill", "Programmer");
            repo.save(user);
            log.info("New User is Created : "+user);

            Optional<User> userWithIdOne= repo.findById(1L);
            log.info("User With ID 1: "+userWithIdOne);

        List<User> list = repo.findAll();
        log.info("List of All User: "+list);
    }
}
