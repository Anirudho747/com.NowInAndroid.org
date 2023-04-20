package bs;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Base {

	protected static AppiumDriverLocalService server;
    protected static ThreadLocal <AppiumDriver> driver = new ThreadLocal<AppiumDriver>();
    
    public Base()
    {
    	
    }
    
    public void setDriver(AppiumDriver driver2)
    {
        driver.set(driver2);
    }

    public AppiumDriver getDriver()
    {
        return driver.get();
    }

    public static AppiumDriverLocalService startServer()
    {
        boolean flag=checkIfServerIsRunnning(4723);
        if(!flag)
        {

            server = AppiumDriverLocalService.buildDefaultService();
            server.start();
        }
        return server;
    }

    public static boolean checkIfServerIsRunnning(int port) {

        boolean isServerRunning = false;
        ServerSocket serverSocket;
        try {
            serverSocket = new ServerSocket(port);
            serverSocket.close();
        } catch (IOException e) {
            //If control comes here, then it means that the port is in use
            isServerRunning = true;
        } finally {
            serverSocket = null;
        }
        return isServerRunning;
    }


    public void setCapabilities() throws IOException {

//        boolean flag= false;
//      try {
//          flag = checkIfServerIsRunnning(4727);
//      } catch (Exception e) {
//          e.printStackTrace();
//      }
//      if(!flag)
//      {
//          server = AppiumDriverLocalService.buildDefaultService();
//          server.start();
//      }
    	
    	
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS,true);
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "PXL API 33");
        dc.setCapability(MobileCapabilityType.APP,"/Users/Aubergine/Downloads/now_in_android.apk");
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(url,dc);
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        setDriver(driver);
    }
    
    public void quitDriver()
    {
        getDriver().quit();
    }


}
