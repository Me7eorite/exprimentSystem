package com.me7eorite.entity;

import lombok.Data;

/**
 * @Author Me7eorite
 * @Date 2021/12/23 16:54
 * @Description 将数据保存到
 */
@Data
public class DataGridView {
    private Integer code = 0;
    private String msg = "";
    private Long count;
    private Object data;

    public DataGridView(Object data) {
        this.data = data;
    }

}
