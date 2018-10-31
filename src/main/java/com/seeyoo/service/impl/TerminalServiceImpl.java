package com.seeyoo.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.seeyoo.model.Terminal;
import com.seeyoo.model.Tgroup;
import com.seeyoo.service.TerminalService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Created by user on 2018/10/12.
 */
@Service("terminalService")
public class TerminalServiceImpl extends BaseService<Terminal> implements TerminalService {
    public PageInfo<Terminal> selectTerminaByTgroupId(List<Integer> tgroupIds,int start,int length){
        int page = start / length + 1;
        Example example = new Example(Tgroup.class);
        Example.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(tgroupIds)){

            criteria.andIn("tgroupId",tgroupIds);
        }
        PageHelper.startPage(page, length);
        List<Terminal> terminals = selectByExample(example);
        return new PageInfo<>(terminals);
    }
}
