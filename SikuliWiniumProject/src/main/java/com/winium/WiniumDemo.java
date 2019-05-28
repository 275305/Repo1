package com.winium;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class WiniumDemo {
	
	public static void main(String[] args) throws MalformedURLException, Exception {
		
		
		DesktopOptions desktopOptions=new DesktopOptions();
		
		desktopOptions.setApplicationPath("C:\\Windows\\System32\\calc.exe");
		
		WiniumDriver driver=new WiniumDriver(new URL("http://localhost:9999"),desktopOptions);
		Thread.sleep(7000);
		
		driver.findElement(By.id("137")).click();
		driver.findElement(By.id("93")).click();
		driver.findElement(By.id("135")).click();
		driver.findElement(By.id("121")).click();
		
		//get the sum value using getattribute method
		
		Thread.sleep(3000);
		String output=driver.findElement(By.id("150")).getAttribute("Name");
		
		System.out.println("result is"+output);
	}

}
