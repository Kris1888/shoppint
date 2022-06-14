package com.shopping.dao.entity;

import lombok.Data;

import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author Kris_Y
 * @date 2022年06月13日 16:38
 */

@Data
@Table(name = "voucher")
public class Voucher implements Serializable {

    /**
     * 店铺优惠券id
     */
    private Integer id;

    /**
     * 店铺id
     */
    private Integer shopId;

    /**
     * 优惠券名称
     */
    private String title;

    /**
     * 满多少钱
     */
    private BigDecimal fullMoney;

    /**
     * 减多少钱
     */
    private BigDecimal amount;

    /**
     * 开始时间
     */
    private LocalDateTime startTime;

    /**
     * 结束时间
     */
    private LocalDateTime endTime;

    /**
     * 所需积分
     */
    private Integer point;

    /**
     * 发行数量
     */
    private Integer count;

    /**
     * 领取数量
     */
    private Integer receiveNum;

    /**
     * 添加时间
     */
    private LocalDateTime addtime;

    /**
     * 优惠券类型
     */
    private Integer type; 

    /**
     * 删除状态
     */
    private Integer del;

    /**
     * 产品 ID
     */
    private Integer proid;
}
