package com.example.xuanxuantest;

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


public class UItest {
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
    //创建多人讨论组
    public void testAdd() throws InterruptedException, UiObjectNotFoundException {
        mDevice.findObject(By.desc("创建聊天")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.desc("Aadmin")).click();
        mDevice.findObject(By.desc("22")).click();
        mDevice.findObject(By.desc("33")).click();
        mDevice.click(648,38);      //点击√按钮
        mDevice.click(150,503);     //输入讨论组名称
        mDevice.findObject(new UiSelector().className("android.widget.EditText").textContains("输入讨论组名称"))
                .legacySetText("Test");     //尽量不用输入汉字
        Thread.sleep(2000);
        mDevice.click(462,730);     //点击创建按钮
    }

    @Test
    //选择图片发送
    public void testPho() throws InterruptedException {
        mDevice.click(0,1208);
        Thread.sleep(1000);
        mDevice.click(0,1112);
        Thread.sleep(1000);
        mDevice.click(0,376);   //点击文件管理器发送其他
        Thread.sleep(1000);
        mDevice.click(0,206);   //点击下载发送照片
        Thread.sleep(1000);
        mDevice.click(6,128);
    }

    @Test
    //选择拍照发送
    public void testPho2() throws InterruptedException {
        mDevice.click(0,1196);
        Thread.sleep(1000);
        mDevice.click(0,160);
        Thread.sleep(1000);
        mDevice.click(648,1026);    //点击发送其他
        Thread.sleep(1000);
        mDevice.click(0,1100);  //点击拍照
        Thread.sleep(1000);
    }

    @Test
    //转发消息
    public void testTransmit() throws InterruptedException {
        mDevice.click(400,782);
        Thread.sleep(1000);
        mDevice.click(0,160);
        mDevice.drag(1366,702,1488,772,1500);   //长按待转发消息
        mDevice.click(0,788);   //点击转发
        Thread.sleep(1000);
        mDevice.click(710,176);    //选择转发对象
        Thread.sleep(1000);
        mDevice.click(0,550);
        Thread.sleep(1000);
    }

    @Test
    //收藏或者取消讨论组
    public void testseletcollect() throws InterruptedException {
        mDevice.click(180,1196);
        Thread.sleep(1000);
        mDevice.click(0,122);
        mDevice.findObject(By.desc("显示菜单")).click();
        mDevice.click(540,50);    //收藏或取消收藏
        Thread.sleep(1000);
        mDevice.click(540,50);
        Thread.sleep(8000);
        mDevice.findObject(By.desc("显示菜单")).click();
        mDevice.click(1360,64);    //返回点击之前
        Thread.sleep(3000);
        mDevice.click(1360,64);
    }

    @Test
    //点击成员列表
    public void testMemberlist() throws InterruptedException {
        mDevice.click(180,1196);
        mDevice.click(0,122);
        mDevice.click(648,38);
        mDevice.click(540,122);
        Thread.sleep(2000);
    }

    @Test
    //进入成员列表点击成员信息
    public void testMember() throws InterruptedException {
        mDevice.click(180,1196);
        Thread.sleep(1000);
        mDevice.click(0,122);
        Thread.sleep(1000);
        mDevice.click(648,38);    //点击选项菜单
        mDevice.click(540,122);
        Thread.sleep(3000);
        mDevice.click(540,122);
        Thread.sleep(3000);
        mDevice.click(0,341);
    }


    @Test
    //讨论组重命名
    public void testRname() throws InterruptedException {
        mDevice.click(180,1196);
        mDevice.click(0,122);
        mDevice.click(648,38);
        mDevice.click(540,194);
        Thread.sleep(3000);
        mDevice.click(540,194);
        Thread.sleep(3000);
        //mDevice.click(354,730);   //点击取消
        mDevice.click(462,730);    //直接点击重命名
    }

    @Test
    //随机点击一个下载按钮
    public void testDownload() throws InterruptedException {
        mDevice.click(180,1196);
        Thread.sleep(3000);
        mDevice.click(0,232);
        Thread.sleep(3000);
        mDevice.click(564,240);    //点击下载按钮
    }

    @Test
    //选择联系人进行星标
    public void testMembercollert() throws InterruptedException {
        //进入联系人界面
        mDevice.click(360,1196);
        Thread.sleep(1000);
        //选择一个联系人
        mDevice.click(0,341);
        Thread.sleep(1000);
        //点击星号
        mDevice.click(648,38);
        Thread.sleep(1000);
    }

    @Test
    //（系统）给所有人发送消息
    public void testEnter() throws UiObjectNotFoundException, InterruptedException {
        mDevice.click(400,782);
        Thread.sleep(3000);
        mDevice.click(0,160);
        mDevice.findObject(new UiSelector().className("android.widget.EditText").textContains("发送消息")).legacySetText("222");
        Thread.sleep(3000);
        mDevice.click(1504,804);
    }

    @Test
    //退出聊天界面
    public void testQuit() throws InterruptedException {
        mDevice.click(400,782);
        Thread.sleep(1000);
        mDevice.click(0,160);
        Thread.sleep(1000);
        mDevice.click(0,48);
    }

    @Test
    //注销
    public void testCancel() throws InterruptedException {
        //点击我的
        mDevice.click(1200,782);
        //点击注销
        mDevice.click(32,400);
        Thread.sleep(1000);
        //不清除相关数据
        mDevice.click(1112,598);
    }

    @Test
    public void testlog(){
        //没有清除相关数据的登录
        mDevice.click(528,634);
    }

    @Test
    public void testCancel2() throws InterruptedException {
        //点击我的
        mDevice.click(1200,782);
        //点击注销
        mDevice.click(32,400);
        Thread.sleep(1000);
        //清除相关数据
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
    //安装好的第一次登录（清除相关数据后的登录）
    public void testLogin() throws UiObjectNotFoundException, InterruptedException {
        mDevice.findObject(new UiSelector().className("android.widget.EditText").
                textContains("服务器")).legacySetText("http://10.7.90.173:11443");
        Thread.sleep(3000);
        mDevice.findObject(new UiSelector().className("android.widget.EditText")
                .textContains("账号")).legacySetText("user1");
        Thread.sleep(3000);
        mDevice.findObject(new UiSelector().className("android.widget.EditText")
                .textContains("密码")).legacySetText("111111");
        Thread.sleep(3000);
        mDevice.click(528,634);
    }
}