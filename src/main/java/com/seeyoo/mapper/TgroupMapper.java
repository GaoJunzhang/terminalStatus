package com.seeyoo.mapper;

import com.seeyoo.model.Tgroup;
import com.seeyoo.util.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TgroupMapper extends MyMapper<Tgroup> {
    public List<Tgroup> selectAllGroup(@Param("codes") List codes);
}