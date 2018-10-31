package com.seeyoo.service;

import com.github.pagehelper.PageInfo;
import com.seeyoo.model.Terminal;

import java.util.List;

/**
 * Created by user on 2018/10/12.
 */
public interface TerminalService extends IService<Terminal>{
    public PageInfo<Terminal> selectTerminaByTgroupId(List<Integer> tgroupIds, int start, int length);
}
