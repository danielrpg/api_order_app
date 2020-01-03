package com.api.service;

import com.api.model.UserInfo;
import com.api.repository.UserInfoRepository;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {

    private final UserInfoRepository userInfoRepository;

    public UserInfoService(UserInfoRepository userInfoRepository) {
        this.userInfoRepository = userInfoRepository;
    }

    public Boolean existsUserByUsername(String userName) {
        return userInfoRepository.existsByUsername(userName);
    }

    public void saveUserInfo(UserInfo userInfo) {
        userInfoRepository.save(userInfo);
    }
}
