package com.ms.user.services;

import com.ms.user.models.UserModel;
import com.ms.user.producers.UserProducer;
import com.ms.user.respository.UserReposiroty;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    final UserReposiroty userReposiroty;
    final UserProducer userProducer;

    public UserService(UserReposiroty reposiroty, UserProducer userProducer) {
        this.userReposiroty = reposiroty;
        this.userProducer = userProducer;
    }

    @Transactional
    public UserModel saveUser(UserModel userModel) {
        userModel = userReposiroty.save(userModel);
        userProducer.publishMessageEmail(userModel);
        return userModel;
    }


}
