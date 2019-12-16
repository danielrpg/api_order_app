package com.api.controller;

import com.api.exception.ValidationException;
import com.api.model.UserInfo;
import com.api.repository.UserInfoRepository;
import com.api.util.URLConstants;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserInfoController {

    private final UserInfoRepository userInfoRepository;

    public UserInfoController(UserInfoRepository userInfoRepository) {
        this.userInfoRepository = userInfoRepository;
    }

    @PostMapping( value = URLConstants.USER_URL)
    public Boolean create(@RequestBody Map<String, String> body){
        String username = body.get("username");
        boolean userExists = userInfoRepository.existsByUsername(username);
        if (userExists){
            throw new ValidationException("Username already existed");
        }
        String password = body.get("password");
        String encodedPassword = new BCryptPasswordEncoder().encode(password);
        String fullName = body.get("fullname");
        userInfoRepository.save(new UserInfo(username, encodedPassword, fullName));
        return true;
    }

}
