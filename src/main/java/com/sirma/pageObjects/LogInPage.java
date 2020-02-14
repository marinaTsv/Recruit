package com.sirma.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {

	public WebDriver driver;

	public LogInPage(WebDriver driver) {
		this.driver = driver;
	}

	By loginLabel = By.xpath("//*[@id=\"root\"]/div/main/div/div/div[1]/div/div/div[2]/span");
	By emailLabel = By.xpath("//*[@id=\"root\"]/div/main/div/div/div[1]/div/div/form/div[1]/label[1]/span");
	By emailTextField = By.xpath("//*[@id=\"email\"]");
	By passwordLabel = By.xpath("//*[@id=\"root\"]/div/main/div/div/div[1]/div/div/form/div[2]/label[1]/span");
	By passwordTextField = By.xpath("//*[@id=\"password\"]");
	By forgotPassword = By.xpath("//*[@id=\"root\"]/div/main/div/div/div[1]/div/div/form/div[3]/a/span");
	By loginButton = By.xpath("//*[@id=\"loginBtn\"]/span/span");

	
	public WebElement getLoginLabel() {
		return driver.findElement(loginLabel);
	}

	public WebElement getEmailLabel() {
		return driver.findElement(emailLabel);
	}

	public WebElement getEmailTextField() {
		return driver.findElement(emailTextField);
	}
	
	public WebElement getPasswordLabel() {
		return driver.findElement(passwordLabel);
	}

	public WebElement getPasswordTextField() {
		return driver.findElement(passwordTextField);
	}

	public WebElement getForgotPassword() {
		return driver.findElement(forgotPassword);
	}
	
	public WebElement getLoginButton() {
		return driver.findElement(loginButton);
	}

}
