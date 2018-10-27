package com.cw.authoritymng.facade.model;

import java.io.Serializable;

/**
 * @author caowei E-mail:18801796602@163.com on 2018/10/27
 * @version v1.0
 */
public class AmResourceUiDTO implements Serializable {
    private static final Long serialVersionUID = 324312321323102L;

    private Integer id;

    private Integer resourceId;

    private Integer uiId;

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

    public Integer getUiId() {
        return uiId;
    }

    public void setUiId(Integer uiId) {
        this.uiId = uiId;
    }

    @Override
    public String toString() {
        return "AmResourceUiDTO{" +
                "id=" + id +
                ", resourceId=" + resourceId +
                ", uiId=" + uiId +
                '}';
    }
}