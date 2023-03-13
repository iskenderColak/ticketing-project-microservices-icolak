package com.icolak.service;

import com.icolak.dto.UserResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// @FeignClient(value = "user-service",url = "http://localhost:9090")

@FeignClient(value = "user-service") // Hey Eureka! I want an instance from user service
                        // I don't care which instance, any instance from user-service
public interface UserClientService {

    @GetMapping("/api/v1/user/{username}")
    UserResponseDTO getUserDTOByUserName(@PathVariable("username") String username);
}
