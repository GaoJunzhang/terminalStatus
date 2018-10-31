package com.seeyoo.mapper;

import com.seeyoo.bean.UserTgroupBean;
import com.seeyoo.model.UserTgroup;
import com.seeyoo.util.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserTgroupMapper extends MyMapper<UserTgroup> {
    public List<UserTgroup> selectByUid(@Param("userId") int userId);
    public List<UserTgroupBean> queryUserTgroupByUserId(@Param("userId") int userId);
}