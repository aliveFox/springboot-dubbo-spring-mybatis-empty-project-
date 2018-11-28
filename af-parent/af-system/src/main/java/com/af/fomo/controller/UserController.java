package com.af.fomo.controller;

import com.af.fomo.bean.User;
import com.af.fomo.service.system.UserService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * 用户控制层
 *
 * @author LiSong
 * @date 2018/11/28 11:35
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/userData.shtml",produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String getUserData() {
        JSONObject result = new JSONObject();
        User user = userService.getUserById(1);
        result.put("user",user);
        return JSON.toJSONString(result, SerializerFeature.WriteDateUseDateFormat);
    }



}
