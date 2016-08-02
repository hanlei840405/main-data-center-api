package com.xiaoqiaoli.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by hanlei6 on 2016/7/25.
 */
@Data
public class OrganizationDTO implements Serializable {

    private Long id;

    private String code;

    private String name;

    private String fullName;

    private String fullPath;

    private int level;

    private String status;

}
