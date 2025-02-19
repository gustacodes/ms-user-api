package com.ms.user.respository;

import com.ms.user.models.UserModel;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserReposiroty extends JpaRepository<UserModel, UUID> {

}
