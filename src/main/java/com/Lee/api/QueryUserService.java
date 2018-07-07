package com.Lee.api;

import com.Lee.Model.UserModel;
import org.apache.ibatis.annotations.Param;

public interface QueryUserService {
    UserModel queryByName(@Param("userName") String username);
}
