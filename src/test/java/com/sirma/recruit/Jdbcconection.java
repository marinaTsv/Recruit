package com.sirma.recruit;

import java.sql.ResultSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Jdbcconection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		// TODO Auto-generated method stub

		String host = "evalrecruit-qa.devzone.sirma.bg";
		String port = "5432";
		Connection con = DriverManager.getConnection("jdbc:postgresql://" + host + ":" + port + "/recruit_db_qa",
				"recruit_qa", "9d7vzme&FQq!");
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from company;");
		while (rs.next())

		{
			WebDriver driver = new FirefoxDriver();
			driver.get("https://login.salesforce.com");
			driver.findElement(By.xpath(".//*[@id='username']")).sendKeys(rs.getString("username"));
			driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(rs.getString("password"));
		}
	}
}
