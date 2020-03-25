package cn.wmxf.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.experimental.Accessors;

@TableName("shop_info")
@Data
@Accessors(chain=true)
public class Store extends BasePojo{

	private Integer id;
	private String tag;
	private String shopname;//商品名称',
	private String contactMobile;//联系电话',
	private Integer beginTime;//营业开始时间',
	private Integer endTime;//营业结束时间',
	private String storeImg;//餐厅相册',
	private String logoImg;//logo图片',
	private String address;//餐厅地址',
	private String notice;//商家公告',
	private Float score;//平均评分',
	private String sendTime;//'配送时间',
	private BigDecimal floorSendCost;//起送消费',
	private Integer brandId;//品牌',
	private Integer cityId;//城市-站',
	private Integer redianId;//热地区',
	private Integer caixiId;//菜系',
	private Integer nearId;//地址标识',
	private Integer sales;//销量',
	private BigDecimal sendCost;//配送费',
	private Integer onlinePayment;//在线支付',
	private Integer FreeDelivery;//免费配送',
	private Integer activityId;//参与的活动',

}
