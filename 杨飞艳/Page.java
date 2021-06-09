package com.edu.www;


import org.omg.CORBA.PUBLIC_MEMBER;

import edu.util.Action;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Page {
	private AndroidDriver<AndroidElement> driver;
	Action action;
	
		public Page(AndroidDriver<AndroidElement> driver) {
			this.driver = driver;
			this.action = new Action(null);
			}
	
		//选择聊天模块
		public AndroidElement chat() {
			return driver.findElementByXPath("//android.view.View[@content-desc='聊天\r\n" + "聊天\r\n" + "第 1 个标签，共 4 个']");
		}
		
		//选择聊天好友
		public AndroidElement add() {
			return driver.findElementByXPath("//android.widget.Button[@content-desc='创建聊天']");
		}
		
		//选择第一个好友
		public AndroidElement select1() {
			return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[3]/android.view.View[1]/android.view.View[1]");
		}
	   
		//选择第二个好友
		public AndroidElement select2() {
			return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[3]/android.view.View[1]/android.view.View[3]");
		}
		
	    //选择第三个好友
		public AndroidElement select3() {
			return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[3]/android.view.View[1]/android.view.View[5]");
		}
	      
		//信息输入框
	    public AndroidElement text() {
			return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.EditText[1]");
		}
	  
	    //点击确定
	    public AndroidElement determine() {
		    return driver.findElementByXPath("//android.view.View/android.widget.Button[2]");
	    }
	
	    //选择联系人模块
	    public AndroidElement phone() {
			return driver.findElementByXPath("//android.view.View[@content-desc='联系人\r\n" + "联系人\r\n" + "第 3 个标签，共 4 个']");
	    }
	   
	    //收藏联系人
	    public AndroidElement opt() {
		    return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[3]");
	    }
	   
	    public AndroidElement collection1() {
		    return driver.findElementByXPath("//android.widget.Button[@content-desc='收藏']");
	    }
	   
	    //取消收藏  
	    public AndroidElement opt1() {
		    return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]");
	    }
	     
	    public AndroidElement opt2() {
		    return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]");
	    }
	   
	    public AndroidElement cancel() {
		    return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.Button[1]");
	    }
	   
        //查看收藏联系人的资料
	    public AndroidElement find() {
		    return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.Button[2]");
	    }
	   
	    //发送信息
	    public AndroidElement chat1() {
		    return driver.findElementByXPath("//android.widget.Button[@content-desc='开聊']");
	    }
	   
	    public AndroidElement send1() {
		    return driver.findElementByXPath("//android.widget.Button[@content-desc='发送']");
	    }
	   
	    //发送图片
	    public AndroidElement photo() {
		    return driver.findElementByXPath("//android.widget.Button[@content-desc='发送其他内容']");
	    }
	   
	    public AndroidElement picture() {
		    return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]");
	    }
	   
	    public AndroidElement opt3() {
		    return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.GridView[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[1]");
	    }
	    
	    //选择讨论组模块
	    public AndroidElement group() {
		    return driver.findElementByXPath("//android.view.View[@content-desc='讨论组\r\n" + "讨论组\r\n" + "第 2 个标签，共 4 个']");
	    }
	  
	    //收藏讨论组 
	    public AndroidElement opt4() {
		    return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[5]");
	    }
	    public AndroidElement opt5() {
		    return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.Button[2]");
	    } 
	    public AndroidElement collection2() {
		    return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.Button[1]");
	    }
	   
	    //查看成员列表  
	    public AndroidElement see() {
		    return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.Button[2]");
	    }
	   
	    //重命名讨论组
	    public AndroidElement rename() {
		    return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.Button[3]");
	    }
	    
	    //确认
	    public AndroidElement rename1() {
		    return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[3]/android.view.View[1]/android.widget.EditText[1]/android.widget.Button[2]");
	    }
	   
	    //取消
	    public AndroidElement cancel1() {
		    return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[3]/android.view.View[1]/android.widget.EditText[1]/android.widget.Button[1]");
	    }
	    
	    //退出讨论组
	    public AndroidElement select4() {
		    return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[5]");
	    }
	   
	    public AndroidElement sign() {
		    return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.Button[2]");
	    }
	   
	    public AndroidElement quit() {
		   return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.Button[4]");
	    }
	   
	    //确认
	    public AndroidElement confirm() {
		    return driver.findElementByXPath("//android.widget.Button[@content-desc='确认']");
	    }
	   
	    //取消
	    public AndroidElement cancel2() {
		    return driver.findElementByXPath("//android.widget.Button[@content-desc='取消']");
	    }
	   
	   
	    //选择我的模块
	    public AndroidElement mine() {
		    return driver.findElementByXPath("//android.view.View[@content-desc='我的\r\n" + "我的\r\n" + "第 4 个标签，共 4 个']");
	   }
	   
	    //注销
	    public AndroidElement opt6() {
		    return driver.findElementByXPath("//android.widget.Button[@content-desc='注销']");
	   }
	   
	    //查看成员信息
	    public AndroidElement see1() {
		    return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[1]");
	   }
	    
	    //点击成员头像
	    public AndroidElement photo1() {
		    return driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[4]/android.view.View[1]");
	   }
	   
}
   
   
   