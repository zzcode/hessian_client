package com.hessian.remote;

import java.net.MalformedURLException;
import java.util.HashMap;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.caucho.hessian.client.HessianProxyFactory;
import com.hessian.remote.dist.MessageCode;
import com.hessian.remote.dist.MessageServiceForHessian;
import com.hessian.remote.dist.OtaServiceForHessian;
import com.smarthaier.server.remote.hessian.PayLogicService;

public class TestHessian {

	 @Autowired
	 PayLogicService service;
	 @Autowired
	 OtaServiceForHessian otaservice;
	 @Test
    public void testService() throws MalformedURLException {
        ApplicationContext context = new ClassPathXmlApplicationContext("hessian/hessian-client.xml");
        PayLogicService hello = (PayLogicService) context.getBean("hessianClient");
        System.out.println(hello.queryPayRes("201606180126000218"));
    }
	public static void main(String[] args) throws MalformedURLException { 
        String url = "http://192.168.97.115:9090/messageService.hs"; 
        HessianProxyFactory factory = new HessianProxyFactory(); 
        MessageServiceForHessian hello = (MessageServiceForHessian) factory.create(MessageServiceForHessian.class, url); 
        HashMap<String, Object> hashmap=new HashMap<String, Object>();
        hashmap.put("userId", 123L);
        hashmap.put("orderId", 123L);
        hashmap.put("messageCode", "MESSAGE_ORDERS_1701");
        hello.sendMessage(hashmap);
	} 
}
