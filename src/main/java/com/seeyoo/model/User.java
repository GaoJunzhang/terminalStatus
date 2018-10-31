package com.seeyoo.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

public class User implements Serializable{
    private static final long serialVersionUID = 5378394499120442544L;
    @Id
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    private String name;

    private String account;

    private String password;

    private Byte type;

    private Byte status;

    private String css;

    private Byte enable;

    @Column(name = "valid_start_date")
    private Date validStartDate;

    @Column(name = "valid_end_date")
    private Date validEndDate;

    @Column(name = "login_time")
    private Date loginTime;

    @Column(name = "is_delete")
    private Byte isDelete;

    @Column(name = "delete_time")
    private Date deleteTime;

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
     * @return account
     */
    public String getAccount() {
        return account;
    }

    /**
     * @param account
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return type
     */
    public Byte getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * @return status
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * @return css
     */
    public String getCss() {
        return css;
    }

    /**
     * @param css
     */
    public void setCss(String css) {
        this.css = css;
    }

    /**
     * @return enable
     */
    public Byte getEnable() {
        return enable;
    }

    /**
     * @param enable
     */
    public void setEnable(Byte enable) {
        this.enable = enable;
    }

    /**
     * @return valid_start_date
     */
    public Date getValidStartDate() {
        return validStartDate;
    }

    /**
     * @param validStartDate
     */
    public void setValidStartDate(Date validStartDate) {
        this.validStartDate = validStartDate;
    }

    /**
     * @return valid_end_date
     */
    public Date getValidEndDate() {
        return validEndDate;
    }

    /**
     * @param validEndDate
     */
    public void setValidEndDate(Date validEndDate) {
        this.validEndDate = validEndDate;
    }

    /**
     * @return login_time
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * @param loginTime
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * @return is_delete
     */
    public Byte getIsDelete() {
        return isDelete;
    }

    /**
     * @param isDelete
     */
    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * @return delete_time
     */
    public Date getDeleteTime() {
        return deleteTime;
    }

    /**
     * @param deleteTime
     */
    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
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