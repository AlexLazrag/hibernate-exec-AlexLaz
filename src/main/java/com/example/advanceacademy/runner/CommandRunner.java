package com.example.advanceacademy.runner;

import com.example.advanceacademy.entity.User;
import com.example.advanceacademy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandRunner implements CommandLineRunner {
    @Autowired
    UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {
        User user =User.builder()
                .firstName("Ivan")
                .lastName("Petkov")
                .email("user@gmail.com")
                .password("12345678")
                .build();

        userRepository.save(user);
    }
}
