package com.edu.www;


import edu.util.Action;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class GroupPage {
	private AndroidDriver<AndroidElement> driver;
	Action action;
	
	public GroupPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new Action(null);
	}
	//点击模块
	public AndroidElement chatGroup() {
		return driver.findElementByXPath("//android.view.View[@content-desc='讨论组讨论组第 2 个标签，共 4 个']");
}
//创建讨论组
	public AndroidElement addGroup() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc='创建聊天']");
	}
	//点击确认按钮
	public AndroidElement admire() {
		return driver.findElementByXPath("//android.view.View/android.widget.Button[2]");
	}
	//选择第一个用户
	public AndroidElement firstGroup() {
		return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/"
				+ "android.widget.FrameLayout[1]/android.view.View/android.view.View/"
				+ "android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]");
	}
	//2
	public AndroidElement secondGroup() {
		return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/"
				+ "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/"
				+ "android.view.View[1]/android.view.View[1]/android.view.View[5]/android.view.View[1]/android.view.View[3]");
	}
	//3
	public AndroidElement thirdGroup() {
		return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/"
				+ "android.widget.FrameLayout[1]/android.view.View/android.view.View/android.view.View/"
				+ "android.view.View/android.view.View[2]/android.view.View/android.view.View[5]");
	}
	//4
	public AndroidElement fourGroup() {
		return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/"
				+ "android.widget.FrameLayout[1]/android.view.View/android.view.View/android.view.View/"
				+ "android.view.View/android.view.View[2]/android.view.View/android.view.View[7]");
	}
	//5
	public AndroidElement fiveGroup() {
		return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/"
				+ "android.widget.FrameLayout[1]/android.view.View/android.view.View/android.view.View/"
				+ "android.view.View/android.view.View[2]/android.view.View/android.view.View[9]");
	}
	//选择第一个讨论组
	public AndroidElement firstPeople() {
		return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/"
				+ "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/"
				+ "android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]");
	}
	//选择第二个讨论组
	public AndroidElement thirdPeople() {
		return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/"
				+ "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/"
				+ "android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[3]");
	}
	//第三个讨论组
	public AndroidElement fivePeople() {
		return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/"
				+ "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/"
				+ "android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/"
				+ "android.view.View[1]/android.view.View[5]");
	}
	//消息输入框
	public AndroidElement text() {
		return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/"
				+ "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/"
				+ "android.view.View[1]/android.view.View[1]/android.widget.EditText[1]");
	}
	//讨论组点击图片按钮，选择拍照
	public AndroidElement photo() {
		return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/"
				+ "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/"
				+ "android.view.View[1]/android.view.View[1]/android.view.View[2]");
	}
	//讨论组发送消息确定按钮
	public AndroidElement send() {
		return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/"
				+ "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/"
				+ "android.view.View[1]/android.view.View[1]/android.widget.Button[2]");
	}
	//讨论组点击更多选项
	public AndroidElement more() {
		return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/"
				+ "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/"
				+ "android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.Button[2]");
	}
	//点击收藏
	public AndroidElement collectGroup() {
		return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/"
				+ "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/"
				+ "android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.Button[1]");
	}
	//点击取消收藏
	public AndroidElement cancelcollectGroup() {
		return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/"
				+ "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/"
				+ "android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.Button[1]");
	}
	//点击查看成员列表
	public AndroidElement memberlist(){
		return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/"
				+ "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/"
				+ "android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.Button[2]");
	}
	//点击重命名
	public AndroidElement rename() {
		return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/"
				+ "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/"
				+ "android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.Button[3]");
	}
	//暂时没有定位成功（消息同步）
	public AndroidElement sync() {
		return driver.findElementByXPath("//android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/"
				+ "android.view.View/android.view.View/android.view.View[4]");
	}
	//退出讨论组
	public AndroidElement exit() {
		return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/"
				+ "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/"
				+ "android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.Button[1]");
	}
	//讨论组确定按钮
	public AndroidElement build() {
		return driver.findElementByXPath("//android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/"
				+ "android.view.View/android.widget.EditText/android.widget.Button[2]");
	}
	//选择图片
	public AndroidElement picture() {
		return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/"
				+ "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/"
				+ "android.view.View[1]/android.view.View[1]/android.view.View[1]");
	}
	//
	public AndroidElement choosePicture() {
		return driver.findElementByXPath("//android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/"
				+ "android.view.View/android.view.View[1]");
	}
	//
	public AndroidElement takephoto() {
		return driver.findElementByXPath("//android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/"
				+ "android.view.View/android.view.View[2]");
	}
	//
	public AndroidElement openPicture() {
		return driver.findElementByXPath("//android.widget.FrameLayout/android.widget.FrameLayout/"
				+ "android.widget.FrameLayout/android.widget.RelativeLayout/androidx.drawerlayout.widget.DrawerLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/"
				+ "android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.ImageView[2]");
		
	}
	//
	public AndroidElement pictures() {
		return driver.findElementByXPath("//android.widget.FrameLayout/android.widget.FrameLayout/"
				+ "android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/"
				+ "android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.ListView/"
				+ "android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView");
	}
	//点击自己头像
	public AndroidElement oneself() {
		return driver.findElementByXPath("//android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/"
				+ "android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]");
	}
	//点击成员头像
	public AndroidElement another() {
		return driver.findElementByXPath("//android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/"
				+ "android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View");
	}
	//文件下载按钮1
	public AndroidElement download1() {
		return driver.findElementByXPath("//android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/"
				+ "android.view.View/android.view.View[2]/android.view.View/android.view.View[4]/android.widget.Button");
	}
	//点击下载文件按钮2
	public AndroidElement download2() {
		return driver.findElementByXPath("//android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/"
				+ "android.view.View/android.view.View[2]/android.view.View/android.view.View[5]/android.widget.Button");
	}
	//点击下载文件按钮3
	public AndroidElement download3() {
		return driver.findElementByXPath("//android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/"
				+ "android.view.View/android.view.View[2]/android.view.View/android.view.View[6]/android.widget.Button");
	}
	//点击下载件按钮4
	public AndroidElement download4() {
		return driver.findElementByXPath("//android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/"
				+ "android.view.View/android.view.View[2]/android.view.View/android.view.View[7]/android.widget.Button");
	}
	//发送图片到讨论组聊天界面
	public void sendPhotoByChoose() throws InterruptedException {
		action.click(picture());
		Thread.sleep(1000);
		action.click(choosePicture());
		Thread.sleep(1000);
		action.click(openPicture());
		Thread.sleep(1000);
	}
	
	//文件内点击图片
	public void sendPhotoByTake() throws InterruptedException {
		action.click(picture());
		Thread.sleep(1000);
		action.click(takephoto());
		Thread.sleep(1000);
		action.click(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/"
				+ "android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]"));
		Thread.sleep(10000);
		action.click(driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"确定\"]"));
		Thread.sleep(1000);
	}


	

}
