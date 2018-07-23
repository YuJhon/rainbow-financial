package com.rain.entity.enums;

/**
 * <p>功能描述</br>订单状态</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName rainbow-financial
 * @date 2018/7/23 22:24
 */
public enum OrderType {
  APPLY("申购"),
  REDEEM("赎回");

  private String desc;

  OrderType(String desc) {
    this.desc = desc;
  }
}
