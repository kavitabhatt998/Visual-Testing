import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://staging-web-app.ratio.city/login')

WebUI.click(findTestObject('Object Repository/ratiocity/Page_Ratio.City Platform/button_Login'))

WebUI.delay(30)

WebUI.setText(findTestObject('Object Repository/ratiocity/Page_Sign In with Auth0/input_Ratio.City_email'), 'barty@example.com')

WebUI.setEncryptedText(findTestObject('Object Repository/ratiocity/Page_Sign In with Auth0/input_Ratio.City_password'), 
    'wk79G5UFYJYwfJuHF1SqsetS8PD2KDH+')

WebUI.click(findTestObject('Object Repository/ratiocity/Page_Sign In with Auth0/span_Log In'))

WebUI.delay(20)

WebUI.click(findTestObject('Object Repository/ratiocity/Page_Ratio.City Explore/span_No, thanks'))

WebUI.waitForElementPresent(findTestObject('Object Repository/ratiocity/Page_Ratio.City Explore/span_Mississauga'), 10)

WebUI.maximizeWindow()

WebUI.delay(20)

WebUI.waitForElementPresent(findTestObject('Object Repository/ratiocity/Page_Ratio.City Explore/span_Toronto'), 10)

WebUI.click(findTestObject('Object Repository/ratiocity/Page_Ratio.City Explore/span_Toronto'))

WebUI.waitForElementPresent(findTestObject('Object Repository/ratiocity/Page_Ratio.City Explore/mat-icon_search'), 10)

WebUI.click(findTestObject('Object Repository/ratiocity/Page_Ratio.City Explore/mat-icon_search'))

