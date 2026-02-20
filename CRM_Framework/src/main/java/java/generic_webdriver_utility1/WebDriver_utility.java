package java.generic_webdriver_utility1;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriver_utility {
	public WebDriver driver = null;
  public void waitforpagetoload(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  }
  public void waitForElementPresent(WebDriver driver,WebElement element) {
	  WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));
	  wait.until(ExpectedConditions.visibilityOf(element));
  }
  
  public void switchToTabUrl(WebDriver driver, String partialurl) {
	  Set<String> set = driver.getWindowHandles();
	        Iterator<String> it = set.iterator();
	        while(it.hasNext()){
	        	 String windowId = it.next();
	        	 driver.switchTo().window(windowId);
	        
				String acturl = driver.getCurrentUrl();
				if(acturl.contains(partialurl)) {
					break;
					
				}
	        }  
        }
  public void switchToTabTitle(WebDriver driver, String partialTitle) {
	  Set<String> set = driver.getWindowHandles();
	        Iterator<String> it = set.iterator();
	        while(it.hasNext()){
	        	 String windowId = it.next();
	        	 driver.switchTo().window(windowId);
	        
				String acturl = driver.getCurrentUrl();
				if(acturl.contains(partialTitle)) {
					break;
					
				}
	        }  
        }
  public  void switchToFrame(WebDriver driver, int index) {
	  driver.switchTo().frame(index);
  }
  public void swithToFrame(WebDriver driver, WebElement element) {
	  driver.switchTo().frame(element);
  }
  public void switchToFrame(WebDriver driver, String nameid) {
	  driver.switchTo().frame(nameid); 
  }
  public void switchToAlertandAccept(WebDriver driver) {
	  driver.switchTo().alert().accept();
  }
  public void switchToAlertandCancel(WebDriver driver) {
	  driver.switchTo().alert().dismiss();
  }
  //select class
  public void select(WebElement element, String text) {
	  Select sel = new Select(element);
	  sel.selectByVisibleText(text);
  }
  public void select(WebElement element, int index) {
	  Select sel = new Select(element);
	  sel.selectByIndex(index);
  }
  //Action class
  public void mouseMoveonElement(WebDriver driver, WebElement element) {
	  Actions act = new Actions(driver);
	  act.moveToElement(element).perform();
  }
  public void doubleclick(WebDriver driver, WebElement element) {
	  Actions act = new Actions(driver);
	  act.doubleClick(element).perform();
  }
  public void launchthebrowser() {
		driver= new ChromeDriver();
	}
	public void maximizeTheWindow() {
		driver.manage().window().maximize();
	}
	public void navigateToapp (String url)
	{
		driver.get(url);
	}
	public String fetchTheTitle() {
		String title =driver.getTitle();
		return title;
	}
	public String fetchTheCurrentUrl() {
		String url=driver.getCurrentUrl();
		return url;
	}
	public String fetchThesourcecode() {
		String src=driver.getPageSource();
		return src;
	}
	public String getwindowHandle() {
		String handle=driver.getWindowHandle();
		return handle;
	}
	public void minimizeTheWindow() {
		driver.manage().window().minimize();
	}
	public void windowfullscreen() {
		driver.manage().window().fullscreen();
  }
	public Dimension fetchThesizeofwindow() {
		Dimension dim=driver.manage().window().getSize();
		return dim;
	}
	public Point fetchThepositionofwindow() {
		Point p=driver.manage().window().getPosition();
		return p;
	}
	public void setThesizeofwindow(int width, int hieght) {
		Dimension d =  new Dimension(width,hieght);
		driver.manage().window().setSize(d);
	}
	public void setThepositionofwindow(int x, int y) {
		Point p =  new Point(x,y);
		driver.manage().window().setPosition(p);
	}
	public void navigateBack() {
		driver.navigate().back();
	}
	public void navigateTonextpage() {
		driver.navigate().forward();
	}
	public void refreshThepage() {
		driver.navigate().refresh();
	}
	public void navigateToappUsingTo(String url) {
		driver.navigate().to(url);
	}
	public void navigateToappUsingToUrl(String url) throws MalformedURLException {
		driver.navigate().to(new URL(url));
	}
	public void closeTheBrowser() {
		driver.close();
	}
	public void quitTheBrowser() {
		driver.quit();
	}
	public Set<String> fetchAllwindowIds() {
		Set<String> wIds= driver.getWindowHandles();
		return wIds;
	}
	public void switchhTowindow(String id) {
		driver.switchTo().window(id);
	}
	
}
