package com.wusong.platfrom.auth.feign.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;



/**
 * javadoc MerchantBo
 * <p>
 *     商户数据
 * <p>
 * @author weng xiaoyong
 * @date 2021/9/8 10:41 AM
 * @version 1.0.0
 **/
@Getter
@Setter
@ToString
@Accessors(chain = true)
public class MerchantBo {

    /**
     * 商户id
     */
    private String merchantId;
    /**
     * 授权id
     */
    private String licenseId;

    /**
     * 商户名称
     */
    private String merchantName;

    /**
     * 商户类型
     */
    //private Map<Integer, String> merchantType;

    /**
     * 商户有效状态
     */
    private Integer merchantStatus;

    /**
     * 商户标签
     **/
    //private List<Map<String,String>> labels;

    /**
     * 创建方式
     */
    private Integer createType;

    /**
     * 授权用户总数
     */
    private Long totalUserCount;
    /**
     * 已用用户总数
     */
    private Long usedUserCount;
    /**
     * 商户有效开始时间
     */
    private String start;

    /**
     * 商户有效结束时间
     */
    private String end;

    /**
     * 商户系统权限
     */
    //private List<Map<Integer, String>> systemRole;

    /**
     * 商户类型：0 平台用户 1 外部用户
     */
    private Integer type;

    /**
     * 商户地址
     */
    private String address;

    /**
     * 法人代表
     */
    private String legalRepresentative;

    /**
     * 联系方式
     */
    private String mobile;

    /**
     * 省份
     */
    private String provinceCode;

    /**
     * 城市
     */
    private String cityCode;

    /**
     * 组织机构代码
     */
    private String organizationCode;

    /**
     * 是否支持线上支付 true:支持 false:不支持
     */
    private Integer onlinePayment;

    /**
     * 支付渠道
     */
    //private List<PaymentChannelVO> payChannel;
}
