package com.hessian.remote.dist;

/**
 * OTA任务
 * @author zhangzhao
 *
 */
public interface OtaServiceForHessian {
	
	//再次推送升级信息
	public boolean  OtaTaskProcessSend();
	
	//升级成功删除任务
	public boolean OtaTaskProcessDel();

}
