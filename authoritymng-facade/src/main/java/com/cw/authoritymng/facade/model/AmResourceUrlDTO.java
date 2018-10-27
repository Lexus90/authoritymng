package com.cw.authoritymng.facade.model;

import java.io.Serializable;

/**
 * @author caowei E-mail:18801796602@163.com on 2018/10/27
 * @version v1.0
 */
public class AmResourceUrlDTO implements Serializable{
    private static final Long serialVersionUID = 324312321323103L;

    private Integer id;

    private Integer resourceId;

    private Integer urlId;

    private Integer urlType;

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

    public Integer getUrlId() {
        return urlId;
    }

    public void setUrlId(Integer urlId) {
        this.urlId = urlId;
    }

    public Integer getUrlType() {
        return urlType;
    }

    public void setUrlType(Integer urlType) {
        this.urlType = urlType;
    }

    @Override
    public String toString() {
        return "AmResourceUrlDTO{" +
                "id=" + id +
                ", resourceId=" + resourceId +
                ", urlId=" + urlId +
                ", urlType=" + urlType +
                '}';
    }
}