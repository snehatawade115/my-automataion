package automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Popups {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=Demo12.callBrowser("https://www.naukri.com/");//facebook opn hotoy ya mule
		
		
		Set<String> Handles=driver.getWindowHandles();//eka peksha jast window ale ki use krto
		Iterator<String> itr=Handles.iterator();//one bye one url deto
		
		while(itr.hasNext()==true){//while loop condition true hot prynt execute hoto
			String handle=itr.next();
			driver.switchTo().window(handle);
			String Url=driver.getCurrentUrl();
			String Expected="https://company.naukri.com/popups/techmahindra/9dec2021/index.html";
			if(Expected.equals(Url)) {//apn taklela url yenr
				driver.findElement(By.xpath("//img[@alt=\"Tech Mahindra\"]")).click();
				
			}
			else {
				driver.close();
			}
		}
		
	}

}
