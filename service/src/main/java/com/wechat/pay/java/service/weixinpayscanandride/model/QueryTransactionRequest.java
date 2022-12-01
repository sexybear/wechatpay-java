// Copyright 2021 Tencent Inc. All rights reserved.
//
// 公共出行平台代扣服务对外API
//
// 公共出行平台代扣服务对外API
//
// API version: 1.0.0

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.weixinpayscanandride.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/** QueryTransactionRequest */
public class QueryTransactionRequest {
  /** 商户订单号 说明：商户系统内部订单号，只能是数字、大小写字母，且在同一个商户号下唯一。该字段长度限制为字节长度限制 */
  @SerializedName("out_trade_no")
  @Expose(serialize = false)
  private String outTradeNo;
  /** 子商户号 说明：微信支付分配的子商户号，服务商模式下必传 */
  @SerializedName("sub_mchid")
  @Expose(serialize = false)
  private String subMchid;

  public String getOutTradeNo() {
    return outTradeNo;
  }

  public void setOutTradeNo(String outTradeNo) {
    this.outTradeNo = outTradeNo;
  }

  public String getSubMchid() {
    return subMchid;
  }

  public void setSubMchid(String subMchid) {
    this.subMchid = subMchid;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryTransactionRequest {\n");
    sb.append("    outTradeNo: ").append(toIndentedString(outTradeNo)).append("\n");
    sb.append("    subMchid: ").append(toIndentedString(subMchid)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
