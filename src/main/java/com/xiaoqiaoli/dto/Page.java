package com.xiaoqiaoli.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created by hanlei6 on 2016/8/1.
 */
@Data
public class Page<T> implements Serializable{
    private List<T> rows;

    private int current;

    private int rowCount;

    private int total;

    public int getStartRow() {
        return (current - 1) * rowCount;
    }
}
