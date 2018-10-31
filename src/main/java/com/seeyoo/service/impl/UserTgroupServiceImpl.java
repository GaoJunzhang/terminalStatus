package com.seeyoo.service.impl;

import com.seeyoo.bean.UserTgroupBean;
import com.seeyoo.mapper.UserTgroupMapper;
import com.seeyoo.model.Tgroup;
import com.seeyoo.model.UserTgroup;
import com.seeyoo.service.UserTgroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Created by user on 2018/10/12.
 */
@Service("userTgroupService")
public class UserTgroupServiceImpl extends BaseService<UserTgroup> implements UserTgroupService {
    @Autowired
    private UserTgroupMapper userTgroupMapper;

    public List<UserTgroup> selectGroupByUid(int userId) {
        Example example = new Example(Tgroup.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userId", userId);
        List<UserTgroup> userTgroups = selectByExample(example);
        return userTgroups;
    }

    public List<UserTgroupBean> queryUserTgroupByUserId(int userId){
        return userTgroupMapper.queryUserTgroupByUserId(userId);
    }
}
