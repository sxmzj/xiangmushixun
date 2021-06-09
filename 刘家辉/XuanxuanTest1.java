package com.example.myxuanxuan.xuanxuan;

import android.os.RemoteException;
import android.util.Log;
import android.view.KeyEvent;

import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;
import androidx.test.platform.app.InstrumentationRegistry;

import androidx.test.uiautomator.UiObject2;
import androidx.test.uiautomator.UiObjectNotFoundException;
import androidx.test.uiautomator.UiSelector;

import org.junit.BeforeClass;
import org.junit.Test;


public class MoyiTest1 {
    static  UiDevice mDevice;

    @BeforeClass
    public static void initDevice() throws RemoteException, InterruptedException {
        mDevice=UiDevice.getInstance
                (InstrumentationRegistry.
                        getInstrumentation());
        if(mDevice.isScreenOn()){
            mDevice.wakeUp();

        }
        mDevice.pressHome();

        int height=mDevice.getDisplayHeight();
        int width=mDevice.getDisplayWidth();

        Log.w("Height:", height+"");
        Log.w("Width:", String.valueOf(width));
        //获取长宽
        mDevice.pressKeyCode(KeyEvent.KEYCODE_0);

        Thread.sleep(8000);

        UiObject2 moyi1=mDevice.findObject(By.text("默艺"));
        moyi1.click();
        Thread.sleep(3000);
    }
    @Test
    //创建四人讨论组
    public void testAdd() throws InterruptedException, UiObjectNotFoundException {
        mDevice.findObject(By.desc("创建聊天")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.desc("刘\n" +
                "默艺")).click();
        mDevice.findObject(By.desc("用\n" +
                "用户")).click();
        mDevice.click(1504,48);
        //输入一个四人讨论组的名称
        mDevice.findObject(new UiSelector().className("android.widget.EditText").textContains("输入讨论组名称"))
                .legacySetText("cs");//尽量输入英文字符
        Thread.sleep(3000);
        mDevice.click(936,574);
    }
   @Test
    //复制粘贴消息
    public void testCopy() throws InterruptedException, RemoteException {
        mDevice.click(400,782);
        //随便选择一个讨论组
        mDevice.click(0,420);
        //长按消息
        mDevice.drag(112,702,234,772,1500);
        //点击复制
        mDevice.click(0,564);
       // mDevice.click(104,826);
        UiDevice.getInstance().swipe(104,826,1496,876,1500);
        //点击粘贴
        //mDevice.click(45,730);
    }
    @Test
    //转发一条消息
    public void testTransmit() throws InterruptedException {
        mDevice.click(400,782);
        Thread.sleep(1000);
        mDevice.click(0,420);
        mDevice.drag(112,702,234,772,1500);
        //点击转发
        mDevice.click(0,788);
        Thread.sleep(1000);
        //选择转发对象
        mDevice.click(710,176);
        Thread.sleep(1000);
        mDevice.click(0,550);
        Thread.sleep(1000);
    }
    @Test
    //收藏或者取消讨论组
    public void testseletcollect() throws InterruptedException {
        mDevice.click(400,782);
        Thread.sleep(1000);
        mDevice.click(0,420);
        mDevice.findObject(By.desc("显示菜单")).click();
        //取消收藏或者点击收藏
        mDevice.click(1360,64);
        Thread.sleep(3000);
        mDevice.click(1360,64);
        Thread.sleep(8000);
        mDevice.findObject(By.desc("显示菜单")).click();
        //返回点击之前
        mDevice.click(1360,64);
        Thread.sleep(3000);
        mDevice.click(1360,64);
    }
    @Test
    //点击成员列表
    public void testMemberlist() throws InterruptedException {
        mDevice.click(400,782);
        mDevice.click(0,160);
        mDevice.click(1504,48);
        mDevice.click(1360,160);
        Thread.sleep(3000);
        mDevice.click(1360,160);
    }
    @Test
    //讨论组重命名
    public void testRname() throws InterruptedException {
        mDevice.click(400,782);
        mDevice.click(0,160);
        mDevice.click(1504,48);
        mDevice.click(1360,256);
        Thread.sleep(3000);
        mDevice.click(1360,256);
        Thread.sleep(3000);
        //点击取消
        //mDevice.click(792,574);
        //不修改直接点击重命名
        mDevice.click(936,574);
    }
    //进入成员列表点击查看成员信息
    @Test
    public void testMember() throws InterruptedException {
        mDevice.click(400,782);
        Thread.sleep(3000);
        mDevice.click(0,160);
        Thread.sleep(3000);
        //点击选项列表
        mDevice.click(1504,48);
        mDevice.click(1360,160);
        Thread.sleep(3000);
        mDevice.click(1360,160);
        Thread.sleep(3000);
        mDevice.click(0,306);
    }
    @Test
    //随机点击一个下载按钮
    public void testDownload() throws InterruptedException {
        mDevice.click(400,782);
        Thread.sleep(3000);
        mDevice.click(0,420);
        Thread.sleep(3000);
        //点击按钮
        mDevice.click(1392,278);
    }
    @Test
    public void testMembercollert() throws InterruptedException {
        mDevice.click(800,782);
        Thread.sleep(3000);
        mDevice.click(0,598);
        Thread.sleep(3000);
        mDevice.click(1504,48);
        Thread.sleep(3000);
    }
    @Test
    //系统自动给所有人发送消息
    public void testEnter() throws UiObjectNotFoundException, InterruptedException {
        mDevice.click(400,782);
        Thread.sleep(3000);
        mDevice.click(0,160);
        mDevice.findObject(new UiSelector().className("android.widget.EditText").textContains("发送消息")).legacySetText("123");
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
    public void testLogin() throws UiObjectNotFoundException, InterruptedException {
        mDevice.findObject(new UiSelector().className("android.widget.EditText").
                textContains("服务器")).legacySetText("http://10.7.90.195:11443");
        Thread.sleep(3000);
        mDevice.findObject(new UiSelector().className("android.widget.EditText")
                .textContains("账号")).legacySetText("admin");
        Thread.sleep(3000);
        mDevice.findObject(new UiSelector().className("android.widget.EditText")
                .textContains("密码")).legacySetText("66666666");
        Thread.sleep(3000);
        mDevice.click(528,634);
    }
}
