package com.cw.authoritymng.facade.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author caowei E-mail:18801796602@163.com on 2018/10/27
 * @version v1.0
 */
public class AmRoleUserDTO implements Serializable{
    private static final Long serialVersionUID = 324312321323106L;

    private Integer id;

    private Integer roleId;

    private Integer userId;

    private Integer disable;

    private Date expireDate;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getDisable() {
        return disable;
    }

    public void setDisable(Integer disable) {
        this.disable = disable;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
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

    @Override
    public String toString() {
        return "AmRoleUserDTO{" +
                "id=" + id +
                ", roleId=" + roleId +
                ", userId=" + userId +
                ", disable=" + disable +
                ", expireDate=" + expireDate +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}