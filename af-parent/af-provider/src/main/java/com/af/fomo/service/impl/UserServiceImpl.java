package com.af.fomo.service.impl;

import com.af.fomo.bean.User;
import com.af.fomo.service.system.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户业务处理
 *
 * @author LiSong
 * @date 2018/11/28 11:11
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    /**
     * @see com.af.fomo.service.system.UserService#getUserById(Integer)
     */
    @Override
    public User getUserById(Integer userId) {
        User user = new User();
        user.setUserId(1);
        user.setUsername("LiSong");
        user.setNickname("aliveFox");
        return user;
    }
}
