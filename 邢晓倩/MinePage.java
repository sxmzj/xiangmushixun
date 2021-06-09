package xingxiaoqian;

import edu.util.Action;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class MinePage {
	private AndroidDriver<AndroidElement> driver;
	Action action;
	
	public MinePage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new Action(null);
	}
	//点击我的
	public AndroidElement chatMine() {
		return driver.findElementByXPath("//android.view.View[@content-desc='我的']");
    }
    //点击头像
	public AndroidElement chatProfile() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc='创建聊天']");
	}
	//点击返回
	public AndroidElement chatRemove() {
		return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/"
				+ "android.view.View/android.view.View[2]/android.view.View/android.view.View[7]");
	}
	//点击名字
	public AndroidElement chatName() {
		return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/"
				+ "android.view.View/android.view.View[2]/android.view.View/android.view.View[5]");
	}
	//点击用户框的任意空白处
	public AndroidElement chatBlankSpace() {
		return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/");
	}
	//点击右箭头
	public AndroidElement chatArrowhead() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc='右箭头']");
	}
	//点击名字
	public AndroidElement chatName1() {
		return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/"
				+ "android.view.View/android.view.View[2]/android.view.View/android.view.View[9]");
	}
	//点击黄色页面
	public AndroidElement chatYellowPage() {
		return driver.findElementByXPath("//android.view.View/android.widget");
	}
	//点击第一个名片
	public AndroidElement chatFirstVisitingCard() {
		return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/"
				+ "android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]");
	}
	//点击第二个名片
	public AndroidElement chatSecondVisitingCard() {
		return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/"
				+ "android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]");
	}
	
	
	//点击注销
	public AndroidElement chatLogout() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc='注销']");
	}
	//点击勾选框
	public AndroidElement chatCheckBox() {
		return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/"
				+ "android.view.View[1]/android.view.View[1]");
	}
	//点击取消
	public AndroidElement chatNo() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc='取消']");
	}
	//点击注销处的空白处
		public AndroidElement chatBlankArea0() {
			return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/");
		}
	//点击页面右上角三个点
	public AndroidElement chatMore() {
		return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/"
				+ "android.view.View[1]/android.view.View[1]/android.view.View[2]");
	}
	//点击空白
	public AndroidElement chatBlankArea1() {
		return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/"
				+ "android.view.View[1]/android.view.View[1]/android.widget.Button[2]");
	}
	//点击关于
	public AndroidElement chatAbout() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc='关于']");
	}
	
	//点击链接
	public AndroidElement chatCantenate() {
		return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/"
				+ "android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.Button[1]");
	}
	//点击空白(链接)
	public AndroidElement chatBlankArea2() {
		return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/");
	}
	//点击百度（推荐）
	public AndroidElement chatBaidu() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc='百度']");
	}
	//点击仅此一次
		public AndroidElement chatOnce() {
			return driver.findElementByXPath("//android.widget.Button[@content-desc='仅此一次']");
	}
	//点击搜狗浏览器
	public AndroidElement chatSougou() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc='搜狗浏览器']");
	}
	//点击浏览器
	public AndroidElement chatLiulanqi() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc='浏览器']");
	}
	//点击始终
	public AndroidElement chatAlltime() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc='始终']");
	}
	//点击弹出框以外的任何地方
	public AndroidElement chatBlankArea() {
		return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/"
				+ "android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.Button[1]");
	}
	//点击隐私条款
	public AndroidElement chatPrivacyPolicy(){
		return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/"
				+ "android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.Button[2]");
	}
	//点击关闭
	public AndroidElement chatClose() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc='关闭']");
	}
	//点击注销后点击确认
	public AndroidElement chatYes() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc='注销']"
				+ "android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.Button[1]");
	}
}