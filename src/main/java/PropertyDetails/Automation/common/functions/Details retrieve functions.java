package Property Details. Automation.common.functions;

import java.util.ArrayList; import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver,

Import Property Details. Automation.responses. ProjectDetail;

public class Details Retrieve Functions {

private ChromeDriver driver,

public void openWebsite(String url) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");

ChromeDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.get(url); this.driver-driver,

Thread.sleep(20000);

}

public List<ProjectDetail> getDetails(String titleXpath, String addL1Xpath, String addL2Xpath){

List<ProjectDetail> details= new ArrayList<ProjectDetail if(titleXpath.contains("~")) {

String listOfXpath=titleXpath.split("~");

for(String path: listOfXpath) {

ProjectDetail projectDetail= new ProjectDetail(); String title= this.driver.findElement(By.xpath(path)).getText();

projectDetail.setProjectName(title);

details.add(projectDetail);

}

}else {

int countOfTitle=driver.findElements(By.xpath(titleXpath)).size();

int j=0;

for(int i=1;i<=countOfTitle;i++) {

ProjectDetail projectDetail= new ProjectDetail();

String title= this.driver.findElement(By.xpath(titleXpath+"["+i+"]")).getText();

projectDetail.setProjectName(title);

j++;

String addLine1=driver.findElement(By.xpath(addL1Xpath+"["+j+"]")).getText();

projectDetail.setAddressLine1 (addLine1);

j++;

String addLine2=driver.findElement(By.xpath(addL2Xpath+"["+j+"]")).getText();

projectDetail.setAddressLine2(addLine2);

details.add(projectDetail);

}

driver.close();

return details;
}
}
