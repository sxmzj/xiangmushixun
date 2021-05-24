package demo_test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UseBrowser {
    public WebDriver Driver;
    //case,suit单元用例里面，存在多个case可以成为一个簇
    //每个class执行之前调用
    @BeforeClass
    public void Bclass(){
        ///浏览器初始化
        Driver = new FirefoxDriver();
        Driver.manage().window().maximize();
    }
    //每个用例执行之前调用
    @BeforeMethod
    public void setup(){
        Driver.navigate().to("http://www.baidu.com");
    }
    //每个用例执行完毕之后调用
    @AfterMethod
    public void teardown(){
    }
    //每个class执行之后调用
    @AfterClass
    public void Aclass(){
        ///浏览器关闭
        Driver.close();
        Driver.quit();
    }
    //测试用例数据
    @DataProvider(name="logOutDataPro")
    public Object[][]loginOutData(){
        return new Object[][]{{"1"},{"很长很长的观坚持"},{"特殊字符+！@￥"}};
    }
    //执行测试用例
    @Test(dataProvider="logOutDataPro")
    public void baidu(String info){
        Driver.findElement(By.xpath("//*[@id='kw']")).sendKeys(info);
    }
}