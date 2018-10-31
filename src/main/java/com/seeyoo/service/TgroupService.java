package com.seeyoo.service;

import com.seeyoo.model.Tgroup;

import java.util.List;

/**
 * Created by user on 2018/10/12.
 */
public interface TgroupService extends IService<Tgroup> {
    public List<Tgroup> selectAllGroupByCodes(List<String> codes);

    public List<Tgroup> queryGroupById(List<Integer> ids);
}
