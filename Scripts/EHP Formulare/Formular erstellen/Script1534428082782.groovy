import org.openqa.selenium.Cookie
import org.openqa.selenium.WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

Cookie ck = new Cookie("eIAMpropEHP", "")

WebDriver driver = DriverFactory.getWebDriver()

driver.manage().addCookie(ck)
driver.get("http://finma-ehp-ci/gesamtumfrage")

