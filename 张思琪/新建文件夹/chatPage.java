package edu.com.zy;

import edu.basetest.BaseTest;
import edu.util.BaseAction;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class chatPage {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	
	public chatPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}
	//聊天
	public AndroidElement chat() {
		return driver.findElementByXPath("//android.view.View[@content-desc='聊天\n" +
				"聊天\n" +
				"第 1 个标签，共 4 个']");
	}
	//讨论组
	public AndroidElement chatGroup() {
		return driver.findElementByXPath("//android.view.View[@content-desc='讨论组\n" +
				"讨论组\n" +
				"第 2 个标签，共 4 个']");
	}
	//联系人
	public AndroidElement contact(){
		return driver.findElementByXPath("//android.view.View[@content-desc='联系人\n" +
				"联系人\n" +
				"第 3 个标签，共 4 个']");
	}
	//我的
	public AndroidElement mine(){
		return driver.findElementByXPath("//android.view.View[@content-desc='我的\n" +
				"我的\n" +
				"第 4 个标签，共 4 个']");
	}
	//添加
	public AndroidElement addGroup() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc='创建聊天']");
	}
	//第一个人张三
	public AndroidElement firstPerson() {
		return driver.findElementByXPath("//android.view.View[@content-desc='张\n" +
				"张三']");
	}
	//第二个人
	public AndroidElement secondPerson() {
		return driver.findElementByXPath("//android.view.View[@content-desc='李\n" +
				"李四']");
	}
	//确定
	public AndroidElement right() {
		return driver.findElementByXPath("//android.view.View/android.widget.Button[2]");
	}
	//删除
	public AndroidElement delete() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc='删除']");
	}
	//讨论组名称
	public AndroidElement text() {
		return driver.findElementByXPath("//android.widget.EditText[@text='输入讨论组名称']");
	}
	//创建
	public AndroidElement build() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc='创建']");
	}
	//返回
	public AndroidElement Return() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc='返回']");
	}
	//系统
	public AndroidElement system() {
		return driver.findElementByXPath("//android.view.View[@content-desc='系统\n" +
				"所有人']");
	}
	//cs1讨论组
	public AndroidElement firstGroup() {
		return driver.findElementByXPath("//android.view.View[@content-desc='群\n" +
				"cs1']");
	}
	//消息栏
	public AndroidElement message() {
		return driver.findElementByXPath("//android.widget.EditText[@text='发送消息']");
	}
	//发送
	public AndroidElement send() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc='发送']");
	}
	//图片
	public AndroidElement photo() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc='发送其他内容']");
	}
	//发送的消息
	public AndroidElement sendmessage() {
		return driver.findElementByXPath("//android.view.View[@content-desc='111111']");
	}
	//复制
	public AndroidElement copy() {
		return driver.findElementByXPath("//android.view.View[@content-desc='复制']");
	}
	//分享
	public AndroidElement share() {
		return driver.findElementByXPath("//android.view.View[@content-desc='分享...']");
	}
	//转发
	public AndroidElement forward() {
		return driver.findElementByXPath("//android.view.View[@content-desc='转发']");
	}
	//最近聊天(转发)
	public AndroidElement recentchat() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc='最近聊天']");
	}
	//讨论组(转发)
	public AndroidElement chatgoup() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc='讨论组']");
	}
	//联系人(转发)
	public AndroidElement forcontact() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc='联系人']");
	}
	//发送的图片
	public AndroidElement sendphoto() {
		return driver.findElementByXPath("//android.view.View[@content-desc='6月7日 10:35\n" +
				"zsq']/android.widget.ImageView[1]");
	}
	//自己的头像
	public AndroidElement oneself() {
		return driver.findElementByXPath("//android.view.View[@content-desc='zsq']/android.view.View[2]");
	}
	//菜单
	public AndroidElement menu() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc='显示菜单']");
	}
	//收藏
	public AndroidElement Collection() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc='收藏']");
	}
	//取消收藏
	public AndroidElement Cancel() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc='取消收藏']");
	}
	//成员列表
	public AndroidElement list() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc='成员列表']");
	}
	//自己
	public AndroidElement zsq() {
		return driver.findElementByXPath("//android.view.View[@content-desc='Z\n" +
				"zsq\n" +
				"[在线]']");
	}
	//成员张三
	public AndroidElement zhangsan() {
		return driver.findElementByXPath("//android.view.View[@content-desc='张\n" +
				"张三\n" +
				"[离线]']");
	}
	//成员李四
	public AndroidElement lisi() {
		return driver.findElementByXPath("//android.view.View[@content-desc='李\n" +
				"李四\n" +
				"[离线]']");
	}
	//收藏成员
	public AndroidElement collection() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc='取消收藏']");
	}
	//取消收藏成员
	public AndroidElement cancel() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc='收藏']");
	}
	//一对一聊天
	public AndroidElement startchat() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc='开聊']");
	}
	//重命名
	public AndroidElement rename() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc='重命名']");
	}
	//确认重命名
	public AndroidElement makerename() {
		return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[3]/android.view.View[1]/android.widget.EditText[1]/android.widget.Button[2]");
	}
	//取消重命名
	public AndroidElement rename() {
		return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[3]/android.view.View[1]/android.widget.EditText[1]/android.widget.Button[1]");
	}
	//照片
	public AndroidElement picture() {
		return driver.findElementByXPath("//android.view.View[@content-desc='照片']");
	}
	//拍照
	public AndroidElement takephoto() {
		return driver.findElementByXPath("//android.view.View[@content-desc='拍照']");
	}
/*
	public AndroidElement admire() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]");
	}
	
	public AndroidElement firstGroup() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]");
	}
	
	public AndroidElement secondGroup() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]");
	}
	
	public AndroidElement thirdGroup() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]");
	}
	
	public AndroidElement fiveGroup() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[5]");
	}
	
	public AndroidElement sevenGroup() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[7]");
	}
	
	public AndroidElement firstPeople() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View[1]");
	}
	
	public AndroidElement thirdPeople() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View[3]");
	}
	
	public AndroidElement fivePeople() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View[5]");
	}
	
	public AndroidElement text() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText");
	}
	
	public AndroidElement photo() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button[1]");
	}
	
	public AndroidElement send() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button[2]");
	}
	
	public AndroidElement more() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]");
	}
	
	public AndroidElement collectGroup() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]");
	}
	
	public AndroidElement cancelcollectGroup() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]");
	}
	
	public AndroidElement memberlist(){
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]");
	}
	
	public AndroidElement rename() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]");
	}
	
	public AndroidElement sync() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]");
	}
	
	public AndroidElement exit() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]");
	}
	
	public AndroidElement build() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText/android.widget.Button[2]");
	}

	public AndroidElement picture() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button[1]");
	}
	
	public AndroidElement choosePicture() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]");
	}
	
	public AndroidElement takephoto() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]");
	}
	
	public AndroidElement openPicture() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.ImageView[2]");
		
	}
	
	public AndroidElement pictures() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView");
	}
	
	public AndroidElement oneself() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]");
	}
	
	public AndroidElement another() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View");
	}
	////android.widget.Button[@content-desc='ע��']
	public AndroidElement download1() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[4]/android.widget.Button");
	}
	
	public AndroidElement download2() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[5]/android.widget.Button");
	}
	
	public AndroidElement download3() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[6]/android.widget.Button");
	}
	
	public AndroidElement download4() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[7]/android.widget.Button");
	}

	public void sendPhotoByChoose() throws InterruptedException {
		action.click(picture());
		Thread.sleep(1000);
		action.click(choosePicture());
		Thread.sleep(1000);
		action.click(openPicture());
		Thread.sleep(1000);
	}
	
	
	public void sendPhotoByTake() throws InterruptedException {
		action.click(picture());
		Thread.sleep(1000);
		action.click(takephoto());
		Thread.sleep(1000);
		action.click(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]"));
		Thread.sleep(10000);
		action.click(driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"ȷ��\"]"));
		Thread.sleep(1000);
	}
*/

	

}
