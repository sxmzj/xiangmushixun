package com.edu.www;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

@SuppressWarnings("unused")
public class test extends BaseTest{ 
	private static final AndroidDriver<AndroidElement> driver = null;
	Page pages=new Page(driver);

		@Test
		//聊天模块
		public void Chat() {
			pages.chat().click();
		}
	
		@Test
		//新建二人讨论组
		public void addchat1() {
			pages.add().click();
			pages.select1().click();
			pages.determine().click();		
		}	
	
		@Test
		//新建三人讨论组
		public void addchat2() {
			pages.add().click();
			pages.select1().click();
			pages.select2().click();
			pages.text();
			pages.determine().click();		
		}	
	
		@Test
		//新建四人讨论组
		public void addchat3() {
			pages.add().click();
			pages.select1().click();
			pages.select2().click();
			pages.select3().click();
			pages.text();
			pages.determine().click();		
		}	
	
		@Test
		//点击聊天模块
		public void Phone() {
			pages.phone().click();
		}

		@Test
		//收藏联系人
		public void Collection1() {
			pages.phone().click();
			pages.opt().click();
			pages.collection1().click();
		}
	
		@Test
		//取消收藏联系人
		public void Cancel() {
			pages.chat().chat();
			pages.opt1().click();
			pages.opt2().click();
			pages.cancel().click();
		}
	
		@Test
		//查看收藏联系人的资料
		public void Find() {
			pages.chat().chat();
			pages.opt1().click();
			pages.opt2().click();
			pages.find().click();
		}
	
		@Test
		//发送信息
		public void Sendmessage() throws InterruptedException {
			pages.phone().chat();
			pages.opt().click();
			pages.chat1().click();
			pages.text();
			pages.send1().click();
		}
	
		@Test
		//发送图片
		public void send() throws InterruptedException{
			pages.group().click();
			pages.opt4().click();
			pages.photo().click();
			pages.picture().click();
			pages.opt3().click();
		}
	
		@Test
		//讨论组模块
		public void Group() {
			pages.group().click();
		}

		@Test
		//收藏讨论组
		public void Collection() {
			pages.group().click();
			pages.opt4().click();
			pages.opt5().click();
			pages.collection2().click();
		}
	
		@Test
		//查看成员列表
		public void Find1() {
			pages.group().click();
			pages.opt4().click();
			pages.opt5().click();
			pages.see().click();
		}
	
		@Test
		//重命名讨论组
		public void Rename() {
			pages.group().click();
			pages.opt4().click();
			pages.opt5().click();
			pages.rename().click();
			pages.rename1().click();
		}
	
		@Test
		//取消重命名
		public void Cancel1() {
			pages.group().click();
			pages.opt4().click();
			pages.opt5().click();
			pages.rename().click();
			pages.cancel1().click();
		}
	
		@Test
		//在讨论组发送信息
		public void send1() throws InterruptedException{
			pages.group().click();
			pages.opt4().click();
			pages.text();
			pages.send1().click();			
		}
	
		@Test
		//在讨论组发送图片
		public void send2() throws InterruptedException{
			pages.group().click();
			pages.opt4().click();
			pages.photo().click();
			pages.picture().click();
			pages.opt3().click();	
		}
	
		@Test
		//退出讨论组
		public void Quit() {
			pages.group().click();
			pages.select4().click();
			pages.sign().click();
			pages.quit().click();
			pages.confirm().click();
		}
	
		@Test
		//取消退出讨论组
		public void Quit1() {
			pages.group().click();
			pages.select4().click();
			pages.sign().click();
			pages.quit().click();
			pages.cancel2().click();
		}
	
		//点击成员头像
		public void Photo() {
			pages.group().click();
			pages.select4().click();
			pages.photo1().click();
		}
	
		@Test
		//我的模块
		public void Mine() {
			pages.mine().click();
		}
		//注销
	
		@Test
		//确认
		public void cancellation() {
			pages.mine().click();
			pages.opt6().click();
			pages.confirm().click();
		}
	
		@Test
		//取消
		public void Quit1() {
			pages.mine().click();
			pages.opt6().click();
			pages.confirm().click();
		}
	
		@Test
		//查看成员信息
		public void Find2() {
			pages.mine().click();
			pages.see1().click();
		}
	
	
	
	
	
	
	
	

	
	
	
	
	

	
	
	

	
	



}