package com.seeyoo.bean;

import com.seeyoo.model.Tgroup;
import lombok.Data;

/**
 * Created by user on 2018/10/12.
 */

@Data
public class UserTgroupBean {
    private Long id;

    private Integer userId;

    private Integer tgroupId;

    private Tgroup tgroup;

}
