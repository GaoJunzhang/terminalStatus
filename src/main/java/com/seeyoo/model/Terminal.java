package com.seeyoo.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

public class Terminal implements Serializable{
    private static final long serialVersionUID = -5830378467126356457L;
    @Id
    private Integer id;

    @Column(name = "tgroup_id")
    private Integer tgroupId;

    private String mac;

    private String name;

    @Column(name = "server_ip")
    private String serverIp;

    @Column(name = "server_mac")
    private String serverMac;

    private String dev;

    private String cpu;

    private String memory;

    private String disk;

    @Column(name = "layout_name")
    private String layoutName;

    private Integer volume;

    @Column(name = "osd_password")
    private String osdPassword;

    @Column(name = "conn_server_addr")
    private String connServerAddr;

    @Column(name = "dwn_server_addr")
    private String dwnServerAddr;

    private String timing;

    private String day;

    private String week;

    private String holiday;

    private String protocol;

    private String version;

    @Column(name = "system_version")
    private String systemVersion;

    @Column(name = "imd_update_time")
    private Date imdUpdateTime;

    @Column(name = "connect_status")
    private Short connectStatus;

    @Column(name = "connect_time")
    private Date connectTime;

    @Column(name = "disconnect_time")
    private Date disconnectTime;

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
     * @return mac
     */
    public String getMac() {
        return mac;
    }

    /**
     * @param mac
     */
    public void setMac(String mac) {
        this.mac = mac;
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
     * @return server_ip
     */
    public String getServerIp() {
        return serverIp;
    }

    /**
     * @param serverIp
     */
    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    /**
     * @return server_mac
     */
    public String getServerMac() {
        return serverMac;
    }

    /**
     * @param serverMac
     */
    public void setServerMac(String serverMac) {
        this.serverMac = serverMac;
    }

    /**
     * @return dev
     */
    public String getDev() {
        return dev;
    }

    /**
     * @param dev
     */
    public void setDev(String dev) {
        this.dev = dev;
    }

    /**
     * @return cpu
     */
    public String getCpu() {
        return cpu;
    }

    /**
     * @param cpu
     */
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    /**
     * @return memory
     */
    public String getMemory() {
        return memory;
    }

    /**
     * @param memory
     */
    public void setMemory(String memory) {
        this.memory = memory;
    }

    /**
     * @return disk
     */
    public String getDisk() {
        return disk;
    }

    /**
     * @param disk
     */
    public void setDisk(String disk) {
        this.disk = disk;
    }

    /**
     * @return layout_name
     */
    public String getLayoutName() {
        return layoutName;
    }

    /**
     * @param layoutName
     */
    public void setLayoutName(String layoutName) {
        this.layoutName = layoutName;
    }

    /**
     * @return volume
     */
    public Integer getVolume() {
        return volume;
    }

    /**
     * @param volume
     */
    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    /**
     * @return osd_password
     */
    public String getOsdPassword() {
        return osdPassword;
    }

    /**
     * @param osdPassword
     */
    public void setOsdPassword(String osdPassword) {
        this.osdPassword = osdPassword;
    }

    /**
     * @return conn_server_addr
     */
    public String getConnServerAddr() {
        return connServerAddr;
    }

    /**
     * @param connServerAddr
     */
    public void setConnServerAddr(String connServerAddr) {
        this.connServerAddr = connServerAddr;
    }

    /**
     * @return dwn_server_addr
     */
    public String getDwnServerAddr() {
        return dwnServerAddr;
    }

    /**
     * @param dwnServerAddr
     */
    public void setDwnServerAddr(String dwnServerAddr) {
        this.dwnServerAddr = dwnServerAddr;
    }

    /**
     * @return timing
     */
    public String getTiming() {
        return timing;
    }

    /**
     * @param timing
     */
    public void setTiming(String timing) {
        this.timing = timing;
    }

    /**
     * @return day
     */
    public String getDay() {
        return day;
    }

    /**
     * @param day
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * @return week
     */
    public String getWeek() {
        return week;
    }

    /**
     * @param week
     */
    public void setWeek(String week) {
        this.week = week;
    }

    /**
     * @return holiday
     */
    public String getHoliday() {
        return holiday;
    }

    /**
     * @param holiday
     */
    public void setHoliday(String holiday) {
        this.holiday = holiday;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * @param protocol
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param version
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * @return system_version
     */
    public String getSystemVersion() {
        return systemVersion;
    }

    /**
     * @param systemVersion
     */
    public void setSystemVersion(String systemVersion) {
        this.systemVersion = systemVersion;
    }

    /**
     * @return imd_update_time
     */
    public Date getImdUpdateTime() {
        return imdUpdateTime;
    }

    /**
     * @param imdUpdateTime
     */
    public void setImdUpdateTime(Date imdUpdateTime) {
        this.imdUpdateTime = imdUpdateTime;
    }

    public Short getConnectStatus() {
        return connectStatus;
    }

    public void setConnectStatus(Short connectStatus) {
        this.connectStatus = connectStatus;
    }

    /**
     * @return connect_time
     */
    public Date getConnectTime() {
        return connectTime;
    }

    /**
     * @param connectTime
     */
    public void setConnectTime(Date connectTime) {
        this.connectTime = connectTime;
    }

    /**
     * @return disconnect_time
     */
    public Date getDisconnectTime() {
        return disconnectTime;
    }

    /**
     * @param disconnectTime
     */
    public void setDisconnectTime(Date disconnectTime) {
        this.disconnectTime = disconnectTime;
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