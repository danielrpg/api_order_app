package com.api.repository;

import com.api.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {

    Boolean existsByUsername(String username);

    UserInfo findByUsername(String username);
}
