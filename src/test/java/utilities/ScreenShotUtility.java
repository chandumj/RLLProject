package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import steps.SharedSteps;

public class ScreenShotUtility extends SharedSteps {

	public static String captureScreenshot(String ScreenshotName) {
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		String path = "Screenshots/" + ScreenshotName + ".png";
		File destFile = new File(path);

		try {
			FileUtils.copyFile(screenshotFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return path;
	}
}
