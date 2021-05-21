package com.example.xuanxuantest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;

public class GroupPage {
    private AndroidDriver<AndroidElement> driver;

    public GroupPage(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
    }

    public AndroidElement chatGroup() { //讨论组模块
        return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/" +
                "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/" +
                "android.view.View[1]/android.view.View[1]/android.view.View[3]/android.view.View[2]");
    }

    public AndroidElement addGroup() {  //新建讨论组'+'
        return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/" +
                "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/" +
                "android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.Button[1]");
    }

    public AndroidElement admire() {    //确认创建讨论组'√'
        return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/" +
                "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/" +
                "android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.Button[2]");
    }

    public AndroidElement firstGroup() {    //位于首位的讨论组
        return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/" +
                "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/" +
                "android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]");
    }

    public AndroidElement secondGroup() {
        return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/" +
                "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/" +
                "android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[3]");
    }

    public AndroidElement thirdGroup() {    //二位
        return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/" +
                "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/" +
                "android.view.View[1]/android.view.View[1]/android.view.View[3]/android.view.View[1]/android.view.View[5]");
    }

    public AndroidElement fiveGroup() {     //三
        return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/" +
                "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/" +
                "android.view.View[1]/android.view.View[1]/android.view.View[3]/android.view.View[1]/android.view.View[7]");
    }

    public AndroidElement sevenGroup() {
        return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[7]");
    }

    public AndroidElement firstPeople() {   //创建讨论组页面的首位用户
        return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/" +
                "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/" +
                "android.view.View[1]/android.view.View[1]/android.view.View[3]/android.view.View[1]/android.view.View[1]");
    }

    public AndroidElement thirdPeople() {   //二位
        return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/" +
                "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/" +
                "android.view.View[1]/android.view.View[1]/android.view.View[3]/android.view.View[1]/android.view.View[3]");
    }

    public AndroidElement fivePeople() {    //三
        return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/" +
                "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/" +
                "android.view.View[1]/android.view.View[1]/android.view.View[3]/android.view.View[1]/android.view.View[5]");
    }

    public AndroidElement text() {  //创建讨论组名称输入栏
        return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/" +
                "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/" +
                "android.view.View[1]/android.view.View[1]/android.widget.EditText[1]");
    }

    public AndroidElement message() {
        return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/" +
                "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/" +
                "android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[3]/android.view.View[2]");
    }

    public AndroidElement photo() {
        return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/" +
                "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/" +
                "android.view.View[1]/android.view.View[1]/android.widget.Button[1]");
    }

    public AndroidElement send() {  //讨论组内发送按钮
        return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/" +
                "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/" +
                "android.view.View[1]/android.view.View[1]/android.widget.Button[2]");
}

    public AndroidElement more() {  //讨论组右上更多操作按钮
        return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/" +
                "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/" +
                "android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.Button[2]");
    }

    public AndroidElement collectGroup() {  //讨论组右上更多收藏按钮
        return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/" +
                "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/" +
                "android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.Button[1]");
    }

    public AndroidElement cancelcollectGroup() {    //已收藏时变为取消收藏
        return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/" +
                "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/" +
                "android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.Button[1]");
    }

    public AndroidElement memberlist(){     //讨论组右上更多成员列表按钮
        return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/" +
                "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/" +
                "android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.Button[2]");
    }

    public AndroidElement rename() {    //讨论组右上更多重命名按钮
        return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/" +
                "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/" +
                "android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.Button[3]");
    }

    public AndroidElement exit() {      //讨论组内聊天页面返回按钮
        return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/" +
                "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/" +
                "android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.Button[1]");
    }

    public AndroidElement build() {     //创建讨论组页面创建按钮
        return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/" +
                "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/" +
                "android.view.View[1]/android.view.View[1]/android.widget.EditText[1]/android.widget.Button[2]");
    }

    public AndroidElement picture() {   //讨论组内左下图片按钮
        return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/" +
                "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/" +
                "android.view.View[1]/android.view.View[1]/android.widget.Button[1]");
    }

    public AndroidElement choosePicture() {     //从照片中选取图片发送
        return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/" +
                "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/" +
                "android.view.View[1]/android.view.View[1]/android.view.View[1]");
    }

    public AndroidElement takephoto() {     //拍照获得图片发送
        return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/" +
                "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/" +
                "android.view.View[1]/android.view.View[1]/android.view.View[2]");
    }

    public AndroidElement openPicture() {   //从照片中选取操作选择图库
        return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/" +
                "android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[2]/" +
                "android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[3]");

    }

    public AndroidElement pictures() {
        return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView");
    }

    public AndroidElement oneself() {
        return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]");
    }

    public AndroidElement another() {   //点击组内其他成员头像
        return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/" +
                "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/" +
                "android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[1]");
    }

    public AndroidElement download1() { //PDF下载键
        return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/" +
                "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/" +
                "android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[5]/android.widget.Button[1]");
    }

    public AndroidElement download2() { //docx下载键
        return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/" +
                "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/" +
                "android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[6]/android.widget.Button[1]");
    }

    public AndroidElement download3() { //zip下载键
        return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/" +
                "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/" +
                "android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[7]/android.widget.Button[1]");
    }

    public AndroidElement download4() { //jpg下载
        return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/" +
                "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/" +
                "android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[7]/android.widget.Button[1]");
    }

    public PointOption continus() { //长按四人讨论组消息“1”
        return PointOption.point(84,311);
    }

    public PointOption continus1() {
        return PointOption.point(78,1227);
    }

    public AndroidElement copy() {  //长按信息后复制键
        return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/" +
                "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/" +
                "android.view.View[1]/android.view.View[1]/android.view.View[1]");
    }

    public AndroidElement share() { //长按信息后分享键
        return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/" +
                "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/" +
                "android.view.View[1]/android.view.View[1]/android.view.View[2]");
    }

    public AndroidElement forward() {   //长按信息后转发键
        return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/" +
                "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/" +
                "android.view.View[1]/android.view.View[1]/android.view.View[3]");
    }

    public AndroidElement stickup() {   //长按文本框弹出的粘贴按钮
        return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/" +
                "android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/" +
                "android.view.View[2]/android.widget.Button[1]");
    }

    public void sendPhotoByChoose() throws InterruptedException {
        action.click(picture());
        Thread.sleep(1000);
        action.click(choosePicture());
        Thread.sleep(1000);
        action.click(openPicture());
        Thread.sleep(1000);
    }

    public void sendPhotoByTake() throws InterruptedException {
        action.click(picture());
        Thread.sleep(1000);
        action.click(takephoto());
        Thread.sleep(1000);
        action.click(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]"));
        Thread.sleep(10000);
        action.click(driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"确定\"]"));
        Thread.sleep(1000);
    }

}
