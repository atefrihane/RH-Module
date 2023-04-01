package com.rh;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RhApplicationTest {

  private WebDriver driver;
  private String baseUrl;

  @Test
  public void testCreateCandidate() {
    baseUrl = "http://localhost:8080";
    driver = new ChromeDriver();
    driver.get(baseUrl + "/candidates/new");
    WebElement name = driver.findElement(By.id("name"));
    WebElement number = driver.findElement(By.id("bi"));
    WebElement address = driver.findElement(By.id("address"));
    WebElement birth = driver.findElement(By.id("birth"));
    WebElement email = driver.findElement(By.id("email"));
    WebElement phone = driver.findElement(By.id("phone"));
    WebElement technicalArea = driver.findElement(By.id("technicalArea"));
    WebElement rating = driver.findElement(By.id("rating"));
    WebElement jobInterviewDate = driver.findElement(By.id("jobInterviewDate"));

    WebElement save = driver.findElement(By.id("save"));

    name.sendKeys("atefd");
    number.sendKeys("123456789");
    address.sendKeys("address");
    birth.sendKeys("10/02/1995");
    email.sendKeys("atef@ttest.com");
    phone.sendKeys("123456789");
    technicalArea.sendKeys("IT");
    rating.sendKeys("1");
    jobInterviewDate.sendKeys("04/01/2023");

    save.click();

    assertEquals(baseUrl + "/candidates/all", driver.getCurrentUrl());
  }
}
