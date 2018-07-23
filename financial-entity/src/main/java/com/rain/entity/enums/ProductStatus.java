package com.rain.entity.enums;

/**
 * <p>功能描述</br>产品状态枚举</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName rainbow-financial
 * @date 2018/7/23 22:19
 */
public enum ProductStatus {
  AUDITING("审核中"),

  IN_SELL("销售中"),

  LOCKED("暂停销售"),

  FINISHED("已结束");

  private String desc;

  ProductStatus(String desc) {
    this.desc = desc;
  }
}
