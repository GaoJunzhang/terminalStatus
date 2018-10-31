package com.seeyoo.service;

import com.seeyoo.bean.UserTgroupBean;
import com.seeyoo.model.UserTgroup;

import java.util.List;

/**
 * Created by user on 2018/10/12.
 */
public interface UserTgroupService extends IService<UserTgroup> {
    public List<UserTgroup> selectGroupByUid(int userId);
    public List<UserTgroupBean> queryUserTgroupByUserId(int userId);
}
