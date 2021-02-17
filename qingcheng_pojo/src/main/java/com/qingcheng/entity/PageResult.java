package com.qingcheng.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @Author Liguangzhe
 * @Date created in  2021/2/5
 */
public class PageResult<T> implements Serializable {
    private long total;
    private List<T> rows;

    public PageResult(long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
