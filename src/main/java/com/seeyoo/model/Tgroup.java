package com.seeyoo.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

public class Tgroup implements Serializable{
    private static final long serialVersionUID = 166248022638812541L;
    @Id
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "tgroup_id")
    private Integer tgroupId;

    private String name;

    private Integer lev;

    private String code;

    @Column(name = "create_time")
    private Date createTime;

    private String remark;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
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

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return lev
     */
    public Integer getLev() {
        return lev;
    }

    /**
     * @param lev
     */
    public void setLev(Integer lev) {
        this.lev = lev;
    }

    /**
     * @return code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}