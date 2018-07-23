package com.rain.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>功能描述</br>产品</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName rainbow-financial
 * @date 2018/7/23 22:11
 */
public class ProductDO {

  private String id;

  private String name;

  /**
   * @see com.rain.entity.enums.ProductStatus
   */
  private String status;

  /**
   * 起投资金
   **/
  private BigDecimal thresholdAmount;
  /**
   * 投资步长
   **/
  private BigDecimal stepAmount;
  /**
   * 锁定期
   **/
  private Integer lockTerm;
  /**
   * 收益率
   **/
  private BigDecimal rewardRate;

  private String remark;

  private Date createAt;

  private Date updateAt;

  private String createUser;

  private String updateUser;
}
