package com.rain.entity.enums;

/**
 * <p>功能描述</br>订单状态</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName rainbow-financial
 * @date 2018/7/23 22:27
 */
public enum OrderStatus {
  INIT("初始化"),
  PROCESS("处理中"),
  SUCCESS("成功"),
  FAIL("失败");

  private String desc;

  OrderStatus(String desc) {
    this.desc = desc;
  }
}
