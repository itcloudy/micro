package com.hechihan.micro.apps.upms.entity;

import java.util.Date;
import javax.persistence.*;

public class Company {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 公司名称
     */
    private String name;

    /**
     * 母公司
     */
    @Column(name = "parent_id")
    private Integer parentId;

    /**
     * 省份
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 区县
     */
    private String district;

    /**
     * 街道
     */
    private String street;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 创建者
     */
    @Column(name = "create_uid")
    private Integer createUid;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 更新者
     */
    @Column(name = "update_uid")
    private Integer updateUid;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取公司名称
     *
     * @return name - 公司名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置公司名称
     *
     * @param name 公司名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取母公司
     *
     * @return parent_id - 母公司
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 设置母公司
     *
     * @param parentId 母公司
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取省份
     *
     * @return province - 省份
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置省份
     *
     * @param province 省份
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取城市
     *
     * @return city - 城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置城市
     *
     * @param city 城市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取区县
     *
     * @return district - 区县
     */
    public String getDistrict() {
        return district;
    }

    /**
     * 设置区县
     *
     * @param district 区县
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * 获取街道
     *
     * @return street - 街道
     */
    public String getStreet() {
        return street;
    }

    /**
     * 设置街道
     *
     * @param street 街道
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取创建者
     *
     * @return create_uid - 创建者
     */
    public Integer getCreateUid() {
        return createUid;
    }

    /**
     * 设置创建者
     *
     * @param createUid 创建者
     */
    public void setCreateUid(Integer createUid) {
        this.createUid = createUid;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取更新者
     *
     * @return update_uid - 更新者
     */
    public Integer getUpdateUid() {
        return updateUid;
    }

    /**
     * 设置更新者
     *
     * @param updateUid 更新者
     */
    public void setUpdateUid(Integer updateUid) {
        this.updateUid = updateUid;
    }
}