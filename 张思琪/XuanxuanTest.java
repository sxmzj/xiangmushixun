
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
    //创建二人聊天
    public void testAdd() throws InterruptedException, UiObjectNotFoundException {
        mDevice.findObject(By.desc("创建聊天")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.desc("张\n" +
                "张三")).click();
        mDevice.click(1504,50);
    }
    @Test
    //创建三人讨论组
    public void testAdd1() throws InterruptedException, UiObjectNotFoundException {
        mDevice.findObject(By.desc("创建聊天")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.desc("张\n" +
                "张三")).click();
        mDevice.findObject(By.desc("李\n" +
                "李四")).click();
        mDevice.click(1504,50);
        //输入讨论组名称
        mDevice.findObject(new UiSelector().className("android.widget.EditText").textContains("输入讨论组名称"))
                .legacySetText("cs1");//尽量不用输入汉字
        Thread.sleep(3000);
        mDevice.click(936,570);
    }
    @Test
    //讨论组重命名
    public void testRname() throws InterruptedException {
        mDevice.click(400,788);
        mDevice.findObject(By.desc("群\n" +
                "cs1")).click();
        mDevice.findObject(By.desc("显示菜单")).click();
        mDevice.findObject(By.desc("重命名")).click();
        Thread.sleep(1000);
        //点击取消
        //mDevice.click(792,570);
        //不修改直接点击重命名
        mDevice.click(936,570);
    }
    @Test
    //转发一条消息
    public void testTransmit() throws InterruptedException {
        mDevice.click(400,788);
        Thread.sleep(1000);
        mDevice.findObject(By.desc("群\n" +
                "cs1")).click();
        mDevice.drag(1348,701,1488,771,1500);
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
    //选择图片发送
    public void testPho() throws InterruptedException {
        mDevice.click(400,788);
        Thread.sleep(1000);
        mDevice.findObject(By.desc("群\n" +
                "cs1")).click();
        Thread.sleep(1000);
        //点击发送其他
        mDevice.findObject(By.desc("发送其他内容")).click();
        Thread.sleep(1000);
        //点击照片
        mDevice.findObject(By.desc("照片")).click();
        Thread.sleep(1000);
        mDevice.click(8,154);
    }
    @Test
    public void testPho2() throws InterruptedException {
        mDevice.click(400,788);
        Thread.sleep(1000);
        mDevice.findObject(By.desc("群\n" +
                "cs1")).click();
        Thread.sleep(1000);
        //点击发送其他
        mDevice.findObject(By.desc("发送其他内容")).click();
        Thread.sleep(1000);
        //点击拍照
        mDevice.findObject(By.desc("拍照")).click();
        Thread.sleep(3000);
    }
    @Test
    //收藏或者取消
    public void testseletcollect() throws InterruptedException {
        mDevice.click(400,788);
        Thread.sleep(1000);
        //取消收藏或者点击收藏
        mDevice.findObject(By.desc("群\n" +
                "cs1")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.desc("显示菜单")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.desc("收藏")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.desc("显示菜单")).click();
        mDevice.findObject(By.desc("取消收藏")).click();
        Thread.sleep(3000);
    }
    @Test
    //点击成员列表点击成员信息
    public void testMemberlist() throws InterruptedException {
        mDevice.click(400,788);
        Thread.sleep(1000);
        mDevice.findObject(By.desc("群\n" +
                "cs1")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.desc("显示菜单")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.desc("成员列表")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.desc("张\n" +
                "张三\n" +
                "[离线]")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.desc("返回")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.desc("A\n" +
                "admin\n" +
                "[在线]")).click();
        Thread.sleep(3000);
    }
    @Test
    //随机点击一个下载按钮
    public void testDownload() throws InterruptedException {
        mDevice.click(400,788);
        Thread.sleep(3000);
        mDevice.click(0,420);
        Thread.sleep(3000);
        //点击按钮
        mDevice.click(1392,278);
    }
    @Test
    //选择一个联系人点击收藏
    public void testMembercollert() throws InterruptedException {
        //进入联系人界面
        mDevice.click(800,788);
        Thread.sleep(3000);
        //选择一个联系人
        mDevice.click(0,308);
        Thread.sleep(3000);
        //点击收藏
        mDevice.click(1504,50);
        Thread.sleep(3000);
        //取消收藏
        mDevice.click(1504,50);
        Thread.sleep(3000);
    }
    //选择一个联系人聊天
    public void testChat() throws InterruptedException {
        //进入联系人界面
        mDevice.click(800,788);
        Thread.sleep(3000);
        //选择一个联系人
        mDevice.click(0,308);
        Thread.sleep(3000);
        mDevice.findObject(By.desc("开聊")).click();
    }
    @Test
    //（系统）给所有人发送消息
    public void testEnter() throws UiObjectNotFoundException, InterruptedException {
        mDevice.click(400,788);
        Thread.sleep(3000);
        mDevice.findObject(By.desc("系统\n" +
                "所有人")).click();
        Thread.sleep(2000);
        mDevice.findObject(new UiSelector().className("android.widget.EditText").textContains("发送消息")).legacySetText("11111");
        Thread.sleep(3000);
        mDevice.findObject(By.desc("发送")).click();
    }
    @Test
    //点击个人信息
    public void testMessage() throws InterruptedException {
        mDevice.click(400,788);
        Thread.sleep(3000);
        mDevice.click(32,194);
        Thread.sleep(3000);
        //点击按钮
        mDevice.click(0,50);
        Thread.sleep(3000);
    }
    @Test
    //点击我的页面关于
    public void testAbout() throws InterruptedException {
        mDevice.click(400,788);
        Thread.sleep(3000);
        mDevice.findObject(By.desc("显示菜单")).click();
        Thread.sleep(3000);
        //点击关于
        mDevice.click(1360,66);
        Thread.sleep(1000);
        mDevice.findObject(By.desc("隐私条款")).click();
        //mDevice.click(593,538);  点击网址
        Thread.sleep(2000);
        mDevice.click(320,548);//点击百度
        Thread.sleep(2000);
        mDevice.click(968,788);//点击仅此一次
        Thread.sleep(2000);
    }
    @Test
    public void testAbout1() throws InterruptedException {
        mDevice.click(400,788);
        Thread.sleep(3000);
        mDevice.findObject(By.desc("显示菜单")).click();
        Thread.sleep(3000);
        //点击关于
        mDevice.click(1360,66);
        Thread.sleep(1000);
        mDevice.click(593,538);  //点击网址
        Thread.sleep(2000);
        mDevice.click(320,660);//点击浏览器
        Thread.sleep(2000);
        mDevice.click(1128,788);//点击始终
        Thread.sleep(2000);
    }
    @Test
    public void testAbout2() throws InterruptedException {
        mDevice.click(400,788);
        Thread.sleep(3000);
        mDevice.findObject(By.desc("显示菜单")).click();
        Thread.sleep(3000);
        //点击关于
        mDevice.click(1360,66);
        Thread.sleep(2000);
        mDevice.findObject(By.desc("关闭")).click();
    }
    @Test
    //注销
    public void testCancel() throws InterruptedException {
        //点击我的
        mDevice.click(1200,788);
        Thread.sleep(1000);
        //点击注销
        mDevice.findObject(By.desc("注销")).click();
        Thread.sleep(1000);
        //点击取消
        mDevice.findObject(By.desc("取消")).click();
        Thread.sleep(2000);
        //不清除相关数据
        mDevice.findObject(By.desc("注销")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.desc("确认")).click();
    }
    @Test
    public void testlog(){
        //没有清除相关数据的登录
        mDevice.findObject(By.desc("登录")).click();
        Thread.sleep(2000);
    }
    @Test
    public void testCancel2() throws InterruptedException {
        //点击我的
        mDevice.click(1200,788);
        //点击注销
        mDevice.findObject(By.desc("注销")).click();
        Thread.sleep(1000);
        //清除相关数据
        mDevice.click(1112,592);
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
                textContains("服务器")).legacySetText("http://10.7.90.188:11443");
        Thread.sleep(3000);
        mDevice.findObject(new UiSelector().className("android.widget.EditText")
                .textContains("账号")).legacySetText("admin");
        Thread.sleep(3000);
        mDevice.findObject(new UiSelector().className("android.widget.EditText")
                .textContains("密码")).legacySetText("123456");
        Thread.sleep(3000);
        mDevice.click(528,586);
    }
}
