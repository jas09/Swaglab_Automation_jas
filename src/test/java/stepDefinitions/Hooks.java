package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import testComponents.TestSetUp;

public class Hooks {
	TestSetUp testSetUp;
	public Hooks(TestSetUp testSetUp) {
		this.testSetUp = testSetUp;
	}
	
	@After
	public void AfterScenario() {
		testSetUp.driver.quit();
		
	}
	
	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException {
		if (scenario.isFailed()) {
			File filePath = ((TakesScreenshot)testSetUp.driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent = FileUtils.readFileToByteArray(filePath);
			scenario.attach(fileContent, "image/png", "image");
		}
		
	}

}
