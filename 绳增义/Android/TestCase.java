package com.example.xuanxuantest;

import android.os.RemoteException;

import androidx.test.uiautomator.UiDevice;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class TestCase {
    static  UiDevice mDevice;

    @SuppressWarnings("unused")
    public static void initDevice() throws RemoteException, InterruptedException {
        //获取设备，连接模拟器
        private static final AndroidDriver<AndroidElement> driver = null;
        GroupPage pages=new GroupPage(driver);

        //创建多人讨论组
        public void testAdd(){
            pages.addGroup().click();
            pages.thirdPeople().click();
            pages.fivePeople().click();
            pages.text();
            pages.build().click()
        }
        //选择图片发送
        public void testPho(){
            pages.thirdGroup().click();
            pages.sendPhotoByChoose();
            pages.send().click();
        }
        //选择拍照发送
        public void testPho2(){
            pages.thirdGroup().click();
            pages.sendPhotoByTake();
            pages.send().click();
        }
        //收藏或者取消讨论组
        public void testseletcollect(){
            pages.thirdGroup().click();
            pages.more().click();
            pages.collectGroup().click();
        }
        //点击成员列表
        public void testMemberlist(){
            pages.thirdGroup().click();
            pages.more().click();
        }
        //进入成员列表点击成员信息
        public void testMember(){
            pages.thirdGroup().click();
            pages.more().click();
            pages.memberlist().click();
        }
        //讨论组重命名
        public void testRname(){
            pages.thirdGroup().click();
            pages.more().click();
            pages.rename().click();
        }
        //随机点击一个下载按钮
        public void testDownload(){
            pages.thirdGroup().click();
            pages.download3().click();
        }
        //选择联系人进行星标
        public void testMembercollert(){
            pages.fourPeople().click;
            pages.continus();
        }
        //给所有人发送消息
        public void testEnter(){
            pages.thirdGroup().click();
            pages.text();
            pages.send().click();
        }
        //退出聊天界面
        public void testQuit(){
            pages.thirdGroup().click();
            pages.exit().click();
        }
    }
}