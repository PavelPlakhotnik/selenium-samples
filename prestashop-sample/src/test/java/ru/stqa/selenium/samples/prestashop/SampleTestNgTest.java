package ru.stqa.selenium.samples.prestashop;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.stqa.selenium.samples.prestashop.pages.HomePage;


public class SampleTestNgTest extends TestNgTestBase {

  private HomePage homepage;

  @BeforeClass
  public void initPageObjects() {
    homepage = PageFactory.initElements(driver, HomePage.class);
  }

  @Test
  public void testHomePageHasAHeader() {
    driver.get(baseUrl);
    Assert.assertFalse("".equals(homepage.header.getText()));
  }
}
