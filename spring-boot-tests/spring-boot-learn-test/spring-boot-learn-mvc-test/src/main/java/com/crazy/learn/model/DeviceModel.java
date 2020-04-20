package com.crazy.learn.model;

import java.util.Date;

/**
 *
 * @Author guofeng@picooc.com
 * @Date 2020-04-14 
 * @Version V1.0
**/
public class DeviceModel {
    /**
    * 型号ID(手动指定)
    */
    private Integer id;

    /**
    * 设备类型id 1:秤 2:血压计
    */
    private Integer deviceType;

    /**
    * 品牌id 1:PICOOC 2:小S 3:Little S 4:FMPT
    */
    private Integer brand;

    /**
    * 数据等级id 1:高 2:中 3:低
    */
    private Integer level;

    /**
    * 链接方式id 1:蓝牙 2:蓝牙长链接 3:Wifi 4:蓝牙+Wifi 5:广播蓝牙 6:Wifi-Smartlink 7:Wifi-AP
    */
    private Integer attendMode;

    /**
    * 备注名称
    */
    private String remarkName;

    /**
    * 正视图
    */
    private String frontViewUrl;

    /**
    * 正45视图
    */
    private String frontFiveViewUrl;

    /**
    * 配称动图
    */
    private String matchBalanceUrl;

    /**
    * 下载链接
    */
    private String downloadUrl;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 修改时间
    */
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
    }

    public Integer getBrand() {
        return brand;
    }

    public void setBrand(Integer brand) {
        this.brand = brand;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getAttendMode() {
        return attendMode;
    }

    public void setAttendMode(Integer attendMode) {
        this.attendMode = attendMode;
    }

    public String getRemarkName() {
        return remarkName;
    }

    public void setRemarkName(String remarkName) {
        this.remarkName = remarkName;
    }

    public String getFrontViewUrl() {
        return frontViewUrl;
    }

    public void setFrontViewUrl(String frontViewUrl) {
        this.frontViewUrl = frontViewUrl;
    }

    public String getFrontFiveViewUrl() {
        return frontFiveViewUrl;
    }

    public void setFrontFiveViewUrl(String frontFiveViewUrl) {
        this.frontFiveViewUrl = frontFiveViewUrl;
    }

    public String getMatchBalanceUrl() {
        return matchBalanceUrl;
    }

    public void setMatchBalanceUrl(String matchBalanceUrl) {
        this.matchBalanceUrl = matchBalanceUrl;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}