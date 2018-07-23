package com.rain.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>功能描述</br>订单</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName rainbow-financial
 * @date 2018/7/23 22:11
 */
public class OrderDO {

  private String orderId;

  private String chanId;

  private String chanUserId;

  private String orderType;

  private String productId;

  private BigDecimal amount;

  private String outerOrderId;

  private String remark;

  private Date createAt;

  private Date updateAt;
}
