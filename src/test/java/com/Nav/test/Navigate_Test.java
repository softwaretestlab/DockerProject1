package com.Nav.test;

import static org.junit.Assert.assertTrue;

import java.net.URL;
import java.net.MalformedURLException;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Navigate_Test 
{

    @Test
    public void Nav() throws MalformedURLException    {
      DesiredCapabilities dc = DesiredCapabilities.chrome();
      //Selenium hub url
      URL url =new URL("http://localhost:4444/wd/hub");
      RemoteWebDriver driver = new RemoteWebDriver(url,dc);
      driver.get("https://www.tab.com.au/");
      System.out.println(driver.getTitle());
    }
}
