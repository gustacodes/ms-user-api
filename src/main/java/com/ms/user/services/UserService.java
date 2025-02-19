package com.ms.user.services;

import com.ms.user.models.UserModel;
import com.ms.user.respository.UserReposiroty;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    final UserReposiroty reposiroty;

    public UserService(UserReposiroty reposiroty) {
        this.reposiroty = reposiroty;
    }

    @Transactional
    public UserModel saveUser(UserModel userModel) {
        return reposiroty.save(userModel);
    }


}
