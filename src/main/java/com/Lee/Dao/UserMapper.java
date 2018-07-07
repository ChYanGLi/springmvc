package com.Lee.Dao;
import com.Lee.Model.UserModel;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    public UserModel queryByName(@Param("userName") String userName);
}
