package com.edu.www;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

@SuppressWarnings("unused")
public class TestCase extends BaseTest{ 
	private static final AndroidDriver<AndroidElement> driver = null;
	GroupPage pages=new GroupPage(driver);

    @Test
    //转发一条消息
    public void test0() throws InterruptedException {
        
        webtest.open("http://localhost/");
        webtest.click("id =product-xxd");
//        webtest.type("name=user", ReadProperties.getPropertyValue("admin"));
//        webtest.type("name=pwd", ReadProperties.getPropertyValue("123456"));
//        webtest.click("id=submit");
               	 
      		 Thread.sleep(1000);
    }
    @Test
    //
    public void test1() throws InterruptedException {
    	//点击参数设置
    	webtest.click("xpath=/html/body/div[1]/div[1]/div/div[2]/div[2]/h2/a");
    }
    @Test
    //点击参数
    public void test2() throws InterruptedException {
    	webtest.click("xpath=/html/body/nav/ul[2]/li[2]/a");
    }
    @Test
    //重新生成密钥
    public void test3() throws InterruptedException {
       webtest.click("xpath=/html/body/div/div/form/table/tbody/tr[2]/td[2]/a")
    }
    //切换字体
    @Test
    public void test4() throws InterruptedException {
        webtest.click("xpath=/html/body/div/div/form/table/tbody/tr[3]/td[1]/select");
        webtest.click("xpath=/html/body/div/div/form/table/tbody/tr[3]/td[1]/select/option[2]");
        webtest.click("xpath=/html/body/div/div/form/table/tbody/tr[3]/td[1]/select");
        webtest.click("xpath=/html/body/div/div/form/table/tbody/tr[3]/td[1]/select/option[3]")
        Thread.sleep(1000);
        //试试不点击字体直接点击繁体字
        webtest.click("xpath=/html/body/div/div/form/table/tbody/tr[3]/td[1]/select/option[2]");
        Thread.click(2000);
    }
    @Test
    //点击
    public void test5() throws InterruptedException {
        webtest.click("id=pollingInterval");
        Thread.sleep(2000);
    }
    @Test
    public void test6() throws InterruptedException {
    	webtest.click("id=chatPort");
    	Thread.sleep(2000);
    }
    @Test
    //
    public void testEnter() throws UiObjectNotFoundException, InterruptedException {
    	webtest.click("id=commonPort");
        Thread.sleep(2000);
    }
    @Test
    //
    public void test7() throws InterruptedException {
    	webtest.click("id=uploadFileSize");
        Thread.sleep(2000);
    }
    @Test
    //注销
    public void test8() throws InterruptedException {
    	webtest.click("id=tokenLifetime");
        Thread.sleep(1000);
    }
    @Test
    public void test9(){
    	webtest.click("id=tokenAuthwindow");
    	Thread.click(2000);
    }
    @Test
    public void test10() throws InterruptedException {
    	webtest.click("id=aesoff");
    	Thread.sleep(1000);
    	webtest.click("id=aeson");
        Thread.sleep(2000);
    }
    @Test
    public void test11() throws UiObjectNotFoundException, InterruptedException {
    	webtest.click("id=httpson");
    	Thread.sleep(1000);
    	webtest.click("id=httpsoff");
        Thread.sleep(2000);
    }
    @Test
    public void test12() throws UiObjectNotFoundException, InterruptedException {
    	webtest.click("id=debug1");
    	Thread.sleep(1000);
    	webtest.click("id=debug0");
        Thread.sleep(2000);
    }
    @Test
    public void test13() throws UiObjectNotFoundException, InterruptedException {
    	webtest.click("id=logLevel0");
    	Thread.sleep(1000);
    	webtest.click("id=logLevel1");
        Thread.sleep(2000);
    }
    @Test
    //点击首页
    public void test14() throws InterruptedException {
    	webtest.click("xpath=/html/body/nav/ul[2]/li[1]/a");
    }
    @Test
    //点击刷新1
    public void test15() throws InterruptedException {
    	webtest.click("xpath=html/body/div/div[1]/div/div[1]/div[1]/div/div/button/i");
    	Thread.sleep(1000);
    }
    @Test
    //点击刷新2
    public void test16() throws InterruptedException {
    	webtest.click("xpath=html/body/div/div[1]/div/div[2]/div[1]/div/button/i");
    	Thread.sleep(1000);
    }
    @Test
    //点击
    public void test17() throws InterruptedException {
    	webtest.click("xpath=html/body/div/div[1]/div/div[3]/div/div[2]/div/table/tbody/tr/td/table/tbody/tr[4]/td/a");
    	Thread.sleep(1000);
    }
    @Test
    public void test18() throws InterruptedException {
    	webtest.click("class=btn btn-primary center-block");
    	Thread.sleep(1000);
    }
    @Test
    public void test19() throws InterruptedException {
    	webtest.click("class=btn btn-primary loadInModal");
    	Thread.sleep(1000);
    }
    @Test
    public void test20() throws InterruptedException {
    	webtest.click("class=form-control file-control");
    	Thread.sleep(1000);
    }
    @Test
    public void test21() throws InterruptedException {
    	Thread.sleep(1000);
    	webtest.click("class=close");
    	Thread.sleep(1000);
    }
    
//    	
//    	mDevice.findObject(new UiSelector().className("android.widget.EditText").
//                textContains("服务器")).legacySetText("http://10.7.90.92:11443");
//        Thread.sleep(3000);
//        mDevice.findObject(new UiSelector().className("android.widget.EditText")
//                .textContains("账号")).legacySetText("admin");
//        Thread.sleep(3000);
//        mDevice.findObject(new UiSelector().className("android.widget.EditText")
//                .textContains("密码")).legacySetText("123456");
//        Thread.sleep(3000);
//        mDevice.click(528,634);
    }
}
