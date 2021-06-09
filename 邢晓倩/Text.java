package com.example.myxuanxuan.xuanxuan;

import android.os.RemoteException;
import android.util.Log;
import android.view.KeyEvent;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObject2;
import androidx.test.uiautomator.UiObjectNotFoundException;
import androidx.test.uiautomator.UiSelector;

import org.junit.BeforeClass;
import org.junit.Test;


public class XuanxuanTest1 {
    static  UiDevice mDevice;

    @BeforeClass
    public static void initDevice() throws RemoteException, InterruptedException {
   //获取设备，连接模拟器
        mDevice=UiDevice.getInstance
                (InstrumentationRegistry.
                        getInstrumentation());
        if(mDevice.isScreenOn()){
            mDevice.wakeUp();

        }
        mDevice.pressHome();
        int width=mDevice.getDisplayWidth();
        int height=mDevice.getDisplayHeight();
        Log.w("Width:", String.valueOf(width));
        Log.w("Height:", height+"");
        mDevice.pressKeyCode(KeyEvent.KEYCODE_0);
        Thread.sleep(8000);
        UiObject2 xuanxuan1=mDevice.findObject(By.text("喧喧"));
        xuanxuan1.click();
        Thread.sleep(3000);
    }
 
    @Test
    //查看个人信息后返回
    public void testTransmit() throws InterruptedException {
        mDevice.click(1200,782);
        Thread.sleep(1000);
        mDevice.click(100,360);
        mDevice.click(50,88);
        Thread.sleep(1000);

        mDevice.click(250,360);
        Thread.sleep(1000);
        mDevice.click(50，80);
        Thread.sleep(1000);
    }
    @Test
    //关于
    public void testPho() throws InterruptedException {
        mDevice.click(1360,50);
        Thread.sleep(1000);
        mDevice.click(1360,50);
        Thread.sleep(1000);
       
        mDevice.click(660,600);
        Thread.sleep(1000);
       
        mDevice.click(890,770);
        Thread.sleep(1000);
    }
    @Test
//第一个浏览器
    public void testPho2() throws InterruptedException {
       mDevice.click(1360,50);
        Thread.sleep(1000);
        mDevice.click(1360,50);
        Thread.sleep(1000);
       
        mDevice.click(660,600);
        Thread.sleep(1000);
       
        mDevice.click(800,770);
        Thread.sleep(1000);
        mDevice.click(800,770);
    }
    
    @Test
//第二个浏览器
    public void testMemberlist() throws InterruptedException {
        mDevice.click(800,770);
        Thread.sleep(1000);
        mDevice.click(800,770);
    }
@Test
//第三个浏览器
    public void testMemberlist() throws InterruptedException {
        mDevice.click(800,770);
        Thread.sleep(1000);
        mDevice.click(800,782);
    }
    
    @Test
    //注销，不清除数据
    public void testCancel() throws InterruptedException {
        mDevice.click(1200,782);
       
        mDevice.click(32,400);
        Thread.sleep(1000);
       
        mDevice.click(1112,598);
    }
    @Test
    public void testlog(){
        mDevice.click(528,634);
    }
    @Test
//注销，清除数据
    public void testCancel2() throws InterruptedException {
        mDevice.click(1200,782);
      
        mDevice.click(32,400);
        Thread.sleep(1000);
     
        mDevice.click(1112,598);
        Thread.sleep(1000);
        mDevice.click(976,274);
        Thread.sleep(1000);
        mDevice.click(976,390);
        Thread.sleep(1000);
        mDevice.click(976,506);
        Thread.sleep(1000);
        mDevice.click(976,506);
    }
    @Test
    public void testLogin() throws UiObjectNotFoundException, InterruptedException {
        mDevice.findObject(new UiSelector().className("android.widget.EditText").
                textContains("服务器")).legacySetText("http://10.7.90.92:11443");
        Thread.sleep(3000);
        mDevice.findObject(new UiSelector().className("android.widget.EditText")
                .textContains("账号")).legacySetText("admin");
        Thread.sleep(3000);
        mDevice.findObject(new UiSelector().className("android.widget.EditText")
                .textContains("密码")).legacySetText("123456");
        Thread.sleep(3000);
        mDevice.click(528,634);
    }
}