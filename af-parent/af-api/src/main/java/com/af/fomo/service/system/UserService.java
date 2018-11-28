package com.af.fomo.service.system;

import com.af.fomo.bean.User;

/**
 * 用户业务层接口
 *
 * @author LiSong
 * @date 2018/11/28 11:09
 */
public interface UserService {

    /**
     * 根据用户id获取用户信息
     *
     * @param userId 用户id
     * @return User user
     * @author LiSong
     * @date 2018-11-28 11:11:21
     */
    public User getUserById(Integer userId);

}
