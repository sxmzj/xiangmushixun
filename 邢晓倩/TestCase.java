package xingxiaoqian;


import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

@SuppressWarnings("unused")
public class TestCase extends BaseTest{ 
	private static final AndroidDriver<AndroidElement> driver = null;
	GroupPage pages=new GroupPage(driver);

	@Test
	//进入我的
	public void mine() {
		pages.chatMine().click();
	}	
	@Test
	//点击头像并返回
	public void profile() {
		pages.chatProfile().click();
		pages.chatRemove().click();
	}	
	@Test
	//点击名字并返回
	public void name() {	
		pages.chatName().click();
		pages.chatRemove().click();
	}		
	@Test
	//点击空白处并返回
	public void blankSpace() {
		pages.chatBlankSpace().click();	
		pages.chatRemove().click();
	}	
	@Test
	//点击右箭头
	public void arrowhead() {
		pages.chatArrowhead().click();	
		pages.chatRemove().click();
	}
	@Test
	//点击名字
	public void name1() {	
		pages.chatName1().click();	
	}	
	@Test
	//点击黄色页面
	public void yellowPage() {
		pages.chatYellowPage().click();
	}

	@Test
	//点击第一个名片
	public void firstVisitingCard() {
		pages.chatFirstVisitingCard().click();
	}	
	@Test
	//点击第二个名片
	public void  secondVisitingCard() {
		pages. chatSecondVisitingCard().click();
	}
		
	@Test
	//点击返回
	public void remove() {
		pages.chatRemove().click();	
	}
	@Test
	
	
	//点击注销，然后勾选，然后取消
	public void logout1() {
		pages.chatLogout().click();
		pages.chatCheckBox().click();
		pages.chatNo().click();	
	}
	@Test
	//点击注销，不勾选，然后取消
	public void logout2() {
		pages.chatLogout().click();
		pages.chatNo().click();		
	}
	@Test
	//点击注销，勾选，再取消勾选
	public void logout3(){
		pages.chatLogout().click();
		pages.chatCheckBox().click();
		pages.chatCheckBox().click();
	}
	@Test
	//点击空白处退出
	public void logout4(){
		pages.chatBlankArea0().click();
	}
	@Test
	//点击右上角三个点，点击空白
	public void more1() {
		pages.chatMore().click();
		pages.chatBlankArea1().click();	
	}
	@Test
	//点击右上角三个点，点击关于
	public void more2() {
		pages.chatMore().click();
		pages.chatAbout().click();	
	}
	@Test
	//点击链接，点击空白
	public void cantenate1() {
		pages.chatCantenate().click();
		pages.chatBlankArea2().click();
		
	}
	@Test
	//点击链接，点击百度（推荐），点击仅此一次
	public void cantenate2() {
		pages.chatCantenate().click();
		pages. chatBaidu().click();
		pages.chatOnce().click();
	}
	@Test
	//点击链接，点击搜狗浏览器，点击仅此一次
	public void cantenate3() {
		pages.chatCantenate().click();
		pages.chatSougou().click();
		pages.chatOnce().click();
	}
	@Test
	//点击链接，点击浏览器，点击仅此一次
	public void cantenate4() {
		pages.chatCantenate().click();
		pages.chatLiulanqi().click();
		pages.chatOnce().click();
	}
	@Test
	//点击链接，点击搜狗浏览器，点击始终
	public void cantenate5() {
		pages.chatCantenate().click();
		pages.chatSougou().click();
		pages.chatAlltime().click();
	}
	@Test
	//点击空白部分返回                                                                                                                                                                                                                                    
	public void blankArea() {
		pages.chatBlankArea().click();
	}
	@Test
	//点击隐私条款，点击空白
	public void privacyPolicy() {
		pages.chatPrivacyPolicy().click();
		pages.chatBlankArea().click;
	}

	@Test
	//点击关闭
	public void close() {
		pages.chatClose().click();
	}
	@Test
	//点击注销，不勾选，然后确认
	public void logout5() {
		pages.chatLogout().click();
		pages.chatYes().click();		
	}
	@Test
	//重新登录，点击注销，勾选，然后确认
	public void logout6() {
		GroupPage pages=new GroupPage(driver);
		//!!!!!!
		pages.chatLogout().click();
		pages.chatCheckBox().click();
		pages.chatYes().click();	
	}
		
		
}