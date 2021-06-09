package com.example.myapplication1;

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

public class xuanxuanTest {
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
    //创建三人讨论组
    public void chatAdd() throws InterruptedException, UiObjectNotFoundException {
        mDevice.findObject(By.desc("创建聊天")).click();
        Thread.sleep(4000);
        mDevice.findObject(By.desc("A\n" +
                "admin1")).click();
        mDevice.findObject(By.desc("A\n" +0
                "admin3")).click();
        mDevice.click(1504,50);
        //输入讨论组名称
        mDevice.findObject(new UiSelector().className("android.widget.EditText").textContains("输入讨论组名称"))
                .legacySetText("111");
        Thread.sleep(4000);
        mDevice.click(936,570);
    }

    @Test
    //创建四人讨论组
    public void chatAdd1() throws InterruptedException, UiObjectNotFoundException {
        mDevice.findObject(By.desc("创建聊天")).click();
        Thread.sleep(4000);
        mDevice.findObject(By.desc("A\n" +
                "admin1")).click();
        mDevice.findObject(By.desc("A\n" +0
                "admin3")).click();
        mDevice.findObject(By.desc("A\n" +0
                "admin4")).click();
        mDevice.click(1504,50);
        //输入讨论组名称
        mDevice.findObject(new UiSelector().className("android.widget.EditText").textContains("输入讨论组名称"))
                .legacySetText("11111");
        Thread.sleep(4000);
        mDevice.click(936,570);
        Thread.sleep(4000);
    }

    @Test
    //复制一条信息
    public void copy() throws InterruptedException {
        mDevice.click(400,788);
        mDevice.click(0,162);
        Thread.sleep(4000);
        mDevice.drag(1186,702,488,772,2000);
        //点击复制
        mDevice.click(0,564);
        Thread.sleep(4000);
    }

    @Test
    //转发一条信息
    public void forward() throws InterruptedException {
        mDevice.click(400,788);
        mDevice.click(0,162);
        Thread.sleep(4000);
        mDevice.drag(1186,702,488,772,2000);
        //点击转发
        mDevice.click(710,178);
        Thread.sleep(4000);
        mDevice.click(0,292);
        Thread.sleep(4000);
    }

    @Test
    //撤回一条信息
    public void withdraw() throws InterruptedException {
        mDevice.click(400,788);
        mDevice.click(0,162);
        Thread.sleep(4000);
        mDevice.drag(16,633,1584,785,3000);
        //点击撤回
        mDevice.click(0,676);
        Thread.sleep(4000);
    }

    @Test
    //在讨论组发信息
    public void sendmessage() throws UiObjectNotFoundException, InterruptedException {
        mDevice.click(400,788);
        Thread.sleep(4000);
        mDevice.click(0,308);
        Thread.sleep(4000);
        mDevice.findObject(new UiSelector().className("android.widget.EditText").textContains("发送消息")).legacySetText("1111111111");
        Thread.sleep(4000);
        mDevice.click(1504,803);
        Thread.sleep(4000);
    }

    @Test
    //收藏讨论组
    public void collection() throws InterruptedException {
        mDevice.click(400,788);
        mDevice.click(0,162);
        Thread.sleep(4000);
        mDevice.click(1504,50);
        //点击收藏
        mDevice.click(1360,66);
        Thread.sleep(4000);

    }

    @Test
    //取消收藏
    public void cancel() throws InterruptedException {
        mDevice.click(400,788);
        mDevice.click(0,162);
        Thread.sleep(4000);
        mDevice.click(1504,50);
        //点击取消收藏
        mDevice.click(1360,66);
        Thread.sleep(4000);
    }

    @Test
    //查看讨论组成员列表
    public void find() throws InterruptedException {
        mDevice.click(400,788);
        mDevice.click(0,162);
        Thread.sleep(4000);
        mDevice.click(1504,50);
        //点击成员列表
        mDevice.click(1360,162);
        Thread.sleep(4000);

    }

    @Test
    //重命名讨论组
    public void rename() throws InterruptedException {
        mDevice.click(400,788);
        mDevice.click(0,162);
        mDevice.click(1504,50);
        mDevice.click(1360,258);
        Thread.sleep(4000);
        mDevice.click(936,570);
        Thread.sleep(4000);
    }

    @Test
    //取消重命名
    public void rename1() throws InterruptedException {
        mDevice.click(400,788);
        mDevice.click(0,162);
        mDevice.click(1504,50);
        mDevice.click(1360,258);
        Thread.sleep(4000);
        mDevice.click(792,570);
        Thread.sleep(4000);
    }

    @Test
    //在讨论组发图片
    public void sendphoto() throws InterruptedException {
        mDevice.click(400,788);
        Thread.sleep(4000);
        mDevice.click(0,162);
        Thread.sleep(4000);
        mDevice.click(0,840);
        //点击照片
        mDevice.click(0,676);
        mDevice.click(8,154);
        Thread.sleep(4000);
    }



    @Test
    //退出讨论组
    public void exit() throws InterruptedException {
        mDevice.click(400,788);
        mDevice.click(0,390);
        Thread.sleep(4000);
        mDevice.click(1504,50);
        //点击退出讨论组
        mDevice.click(1248,354);
        //确认
        mDevice.click(941,498);
        Thread.sleep(4000);
    }


    @Test
    //取消退出讨论组
    public void exit1() throws InterruptedException {
        mDevice.click(400,788);
        mDevice.click(0,390);
        Thread.sleep(4000);
        mDevice.click(1504,50);
        //点击退出讨论组
        mDevice.click(1248,354);
        //取消
        mDevice.click(797,498);
        Thread.sleep(4000);
    }


    @Test
    //收藏联系人
    public void collection1() throws InterruptedException {
        mDevice.click(800,788);
        mDevice.click(0,308);
        mDevice.click(1504,50);
        Thread.sleep(4000);
    }

    @Test
    //取消收藏联系人
    public void cancel1() throws InterruptedException {
        mDevice.click(0,788);
        mDevice.click(0,276);
        mDevice.click(1504,50);
        //点击取消收藏
        mDevice.click(1360,66);
        Thread.sleep(4000);
    }

    @Test
    //查看联系人资料
    public void find1() throws InterruptedException {
        mDevice.click(0,788);
        mDevice.click(0,276);
        mDevice.click(1504,50);
        //点击资料
        mDevice.click(1360,162);
        Thread.sleep(4000);
    }

    @Test
    //给联系人发信息
    public void sendmessage1() throws UiObjectNotFoundException, InterruptedException {
        mDevice.click(800,788);
        mDevice.click(0,308);
        Thread.sleep(4000);
        mDevice.click(1456,756);
        Thread.sleep(4000);
        mDevice.findObject(new UiSelector().className("android.widget.EditText").textContains("发送消息")).legacySetText("111111111111");
        Thread.sleep(4000);
        mDevice.click(1504,804);
        Thread.sleep(4000);
    }

    @Test
    //给联系人发图片
    public void sendphoto1() throws InterruptedException {
        mDevice.click(800,788);
        mDevice.click(0,308);
        Thread.sleep(4000);
        mDevice.click(1456,756);
        mDevice.click(0,804);
        //点击照片
        mDevice.click(0,676);
        Thread.sleep(4000);
        mDevice.click(8,154);
        Thread.sleep(4000);
    }

    @Test
    //点击成员头像
    public void photo() throws InterruptedException {
        mDevice.click(400,788);
        mDevice.click(0,162);
        mDevice.click(1504,698);
        Thread.sleep(3000);
    }


}
