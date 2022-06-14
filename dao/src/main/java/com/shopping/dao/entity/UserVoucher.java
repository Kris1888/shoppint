package com.shopping.dao.entity;

import lombok.Data;

import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author Kris_Y
 * 优惠券领取记录表
 * @date 2022年06月13日 16:38
 */

@Data
@Table(name = "lr_user_voucher")
public class UserVoucher implements Serializable {

    private Integer id;

    private Integer uid;

    private Integer vid;

    private Integer shopId;

    private BigDecimal fullMoney;

    private BigDecimal amount;

    private LocalDate startTime;

    private LocalDate endTime;

    private LocalDate addtime;

    private Integer status;
}
