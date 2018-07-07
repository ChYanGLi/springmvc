package com.Lee.Service;

import com.Lee.Dao.UserMapper;
import com.Lee.Model.UserModel;
import com.Lee.api.QueryUserService;

import javax.annotation.Resource;

public class QueryUserServiceImp implements QueryUserService{
    @Resource
     private UserMapper userMapper;
    @Override
   public UserModel queryByName(String username) {
       UserModel userModel= userMapper.queryByName(username);
       if(userModel==null)userModel=new UserModel();
        return userModel;
    }
}
