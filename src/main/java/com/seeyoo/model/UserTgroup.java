package com.seeyoo.model;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "user_tgroup")
public class UserTgroup implements Serializable {
    private static final long serialVersionUID = -9123017259883206324L;
    @Id
    private Long id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "tgroup_id")
    private Integer tgroupId;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return tgroup_id
     */
    public Integer getTgroupId() {
        return tgroupId;
    }

    /**
     * @param tgroupId
     */
    public void setTgroupId(Integer tgroupId) {
        this.tgroupId = tgroupId;
    }
}