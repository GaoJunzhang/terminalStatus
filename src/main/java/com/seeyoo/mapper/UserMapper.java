package com.seeyoo.mapper;

import com.seeyoo.model.User;
import com.seeyoo.util.MyMapper;
import org.apache.ibatis.annotations.Param;

public interface UserMapper extends MyMapper<User> {
   User selectByAccount(@Param("account")String account);
}