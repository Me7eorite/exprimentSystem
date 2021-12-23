package com.me7eorite.entity;

import lombok.Data;

/**
 * @Author Me7eorite
 * @Date 2021/12/23 8:44
 * @Description 左侧菜单栏
 */
@Data
public class Menu {
    private Integer id;
    private Integer pid;
    private String title;
    private String href;
    private Boolean spread;
    private String target;
    private String icon;
    private Integer available;
}
