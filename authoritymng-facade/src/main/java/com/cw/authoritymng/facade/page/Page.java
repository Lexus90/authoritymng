package com.cw.authoritymng.facade.page;

import java.io.Serializable;
import java.util.List;

/**
 * @author caowei E-mail:18801796602@163.com on 2018/10/28
 * @version v1.0
 */
public class Page<T> implements Serializable{
    private static final long serialVersionUID = 73247324723432L;
    private List<T> list;
    private long total;
    private int current;
    private int pageSize;

    public Page(int current, int pageSize) {
        this.current = current;
        this.pageSize = pageSize;
    }

    public Page(List<T> list, long total) {
        this.list = list;
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
