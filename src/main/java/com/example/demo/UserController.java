package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    private final String RANDOM_USER_API_BASE_URL = "https://randomuser.me/api/";

    @GetMapping("/{seed}")
    public RandomUser getRandomUser(@PathVariable String seed) {
        String apiUrl = RANDOM_USER_API_BASE_URL + "?seed=" + seed;
        return new RestTemplate().getForObject(apiUrl, RandomUser.class);
    }
}
