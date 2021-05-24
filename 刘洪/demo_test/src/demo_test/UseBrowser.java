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
    //case,suit��Ԫ�������棬���ڶ��case���Գ�Ϊһ����
    //ÿ��classִ��֮ǰ����
    @BeforeClass
    public void Bclass(){
        ///�������ʼ��
        Driver = new FirefoxDriver();
        Driver.manage().window().maximize();
    }
    //ÿ������ִ��֮ǰ����
    @BeforeMethod
    public void setup(){
        Driver.navigate().to("http://www.baidu.com");
    }
    //ÿ������ִ�����֮�����
    @AfterMethod
    public void teardown(){
    }
    //ÿ��classִ��֮�����
    @AfterClass
    public void Aclass(){
        ///������ر�
        Driver.close();
        Driver.quit();
    }
    //������������
    @DataProvider(name="logOutDataPro")
    public Object[][]loginOutData(){
        return new Object[][]{{"1"},{"�ܳ��ܳ��Ĺۼ��"},{"�����ַ�+��@��"}};
    }
    //ִ�в�������
    @Test(dataProvider="logOutDataPro")
    public void baidu(String info){
        Driver.findElement(By.xpath("//*[@id='kw']")).sendKeys(info);
    }
}