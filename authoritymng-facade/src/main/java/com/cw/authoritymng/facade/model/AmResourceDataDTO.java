package com.cw.authoritymng.facade.model;

import java.io.Serializable;

/**
 * @author caowei E-mail:18801796602@163.com on 2018/10/27
 * @version v1.0
 */
public class AmResourceDataDTO implements Serializable{
    private static final Long serialVersionUID = 324312321323100L;

    private Integer id;

    private Integer resourceId;

    private Integer dataId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    public Integer getDataId() {
        return dataId;
    }

    public void setDataId(Integer dataId) {
        this.dataId = dataId;
    }

    @Override
    public String toString() {
        return "AmResourceDataDTO{" +
                "id=" + id +
                ", resourceId=" + resourceId +
                ", dataId=" + dataId +
                '}';
    }
}