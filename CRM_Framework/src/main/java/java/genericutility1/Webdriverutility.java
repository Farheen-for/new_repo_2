package java.genericutility1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriverutility {
	public WebDriver driver= null;
 
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
