package com.fitness.activityservice.service;

import com.fitness.activityservice.config.WebClientConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientException;

@Service
@Slf4j
public class UserValidationService {
    @Autowired
    private WebClient userServiceWebClient;


    public boolean validateUser(String userId){
        log.info("Calling user service for {}", userId);
        try{
            return userServiceWebClient.get()
                    .uri("/api/users/{userId}/validate", userId)
                    .retrieve()
                    .bodyToMono(Boolean.class)
                    .block();
        } catch (WebClientException e) {
            e.printStackTrace();
        }
        return false;
    }
}
