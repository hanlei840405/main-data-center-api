package com.xiaoqiaoli.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created by hanlei6 on 2016/8/1.
 */
@Data
public class Pager<T> implements Serializable {
    private List<T> data;

    private int start;

    private int length;

    private int draw;

    private long recordsTotal;

    private long recordsFiltered;

    public int getStartRow() {
        return (start) * length;
    }

    public int getDraw() {
        return start + 1;
    }
}
