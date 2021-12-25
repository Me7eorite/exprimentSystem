package com.me7eorite.entity;

import com.me7eorite.base.baseEntity;

/**
 * @Author Me7eorite
 * @Date 2021/12/22 23:37
 * @Description
 */
public class BadEquipment extends baseEntity {
    private int id;//编号
    private double fixPrice; //修理价格
    private String fixFactory;//修理厂家
    private int status;//修理状态 1.修理中 2.修理成功
}
