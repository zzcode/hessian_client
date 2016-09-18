/**
 * 
 */
package com.hessian.remote.dist;

/**
 * @author lideqiang
 * 
 */
public enum MessageCode {
//	is_sa
	// OTA
	MESSAGE_OTA_1601(1601,1600,0,1,0,""), //(type_id,parent_id,status,is_notice,is_sava,msg_content) 
	//系统消息
	MESSAGE_SYSTEM_1101(1101,1100,0,1,1,"您有一笔v2元的消费，点击查看订单详情！"), //支付消息  您有一笔v1元的消费，点击查看账单详情！
	//系统消息
	MESSAGE_SYSTEM_1102(1102,1100,0,1,1,"账号v1想要绑定您的冰箱，是否同意?"), //手机 绑定冰箱 
	//补货提醒
	MESSAGE_GOODS_1201(1201,1200,0,1,1,""),
	//物流通知
	MESSAGE_ARRARANGE_1301(1301,1300,0,1,1,"您的订单:v1已发货，放心购物从海尔壹家开始。"), //您的订单:v1已到达朝阳分拣点，放心购物从海尔壹家开始。
	//优惠提醒
	MESSAGE_SALE_1401(1401,1400,0,1,1,""),
	//消息留言
	MESSAGE_WORDS_1501(1501,1500,0,1,1,""),	
	//订单消息
	MESSAGE_ORDERS_1701(1701,1700,0,1,1,"您的订单:v2已支付成功，放心购物从海尔馨厨开始。"),
	MESSAGE_ORDERS_1702(1702,1700,0,1,1,"您的订单:v2已发货，放心购物从海尔馨厨开始。"),
	MESSAGE_ORDERS_1703(1703,1700,0,1,1,"您的订单:v2派送中，请保持手机畅通。");
	
	
	private final int type_id;
	private final int parent_id;
	private final int status;
	/**是否通知 (0:不通知；1：通知)**/
	private final int is_notice;
	/**是否保存消息(0:不保存；1：保存)**/
	private final int is_save;
	/**消息模板**/
	private final String msg_content;


	private MessageCode(final int type_id,final int parent_id,final int status,final int is_notice,final int is_save,final String msg_content) {
		this.type_id = type_id;
		this.parent_id = parent_id;
		this.status = status;
		this.is_notice = is_notice;
		this.is_save = is_save;
		this.msg_content=msg_content;
	}

	public int getIs_save() {
		return is_save;
	}


	public int getType_id() {
		return type_id;
	}


	public int getParent_id() {
		return parent_id;
	}

	public int getStatus() {
		return status;
	}


	public int getIs_notice() {
		return is_notice;
	}

	public String getMsg_content() {
		return msg_content;
	}


}
