package com.me7eorite.entity;

import com.me7eorite.base.baseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @Author Me7eorite
 * @Date 2021/12/21 20:50
 * @Description 设备模型
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Equipment extends baseEntity {
    private int id; //编号
    private String name;//设备名
    private String tid;//设备型号
    private String norms;//规格
    private String price;//价格
    private int num;//数量
    private Date date;//购买日期
    private String Factory;//生产厂家
    private String usePeriod;//使用时间
    private int status; //设备状态 0购买中 1使用中 2.报修中 3.报废
    private String badDesc;//报废记录
    private BadEquipment badStatus; //报修信息

}
