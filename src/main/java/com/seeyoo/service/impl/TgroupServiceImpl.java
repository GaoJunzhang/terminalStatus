package com.seeyoo.service.impl;

import com.seeyoo.mapper.TgroupMapper;
import com.seeyoo.model.Tgroup;
import com.seeyoo.service.TgroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Created by user on 2018/10/12.
 */
@Service("tgroupService")
public class TgroupServiceImpl extends BaseService<Tgroup> implements TgroupService {
    @Autowired
    private TgroupMapper tgroupMapper;

    public List<Tgroup> selectAllGroupByCodes(List<String> codes) {
        Example example = new Example(Tgroup.class);
        if (codes.size() > 0) {
            for (int i = 0; i < codes.size(); i++) {
                Example.Criteria criteria = example.createCriteria();
                criteria.andLike("code",  codes.get(i) + "%");
                example.or(criteria);
            }
        }
        List<Tgroup> tgroups = selectByExample(example);
        return tgroups;
    }

    public List<Tgroup> queryGroupById(List<Integer> ids) {
        Example example = new Example(Tgroup.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andIn("id",ids);
        List<Tgroup> tgroups = selectByExample(example);
        return tgroups;
    }
}
