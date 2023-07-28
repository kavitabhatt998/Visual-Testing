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
import org.openqa.selenium.interactions.Actions as Actions

//WebDriverManager.chromedriver().setup();
WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/New Folder/Page_OrangeHRM/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/New Folder/Page_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/New Folder/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_OrangeHRM/a_Leave'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_OrangeHRM/i_Select_oxd-icon bi-caret-up-fill oxd-sele_393c36'))

WebUI.scrollToElement(findTestObject('New Folder drop down/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec'), 
    10)

//Actions action= new Actions(driver);
//action.click('Object Repository/New Folder/Page_OrangeHRM/i_Select_oxd-icon bi-caret-up-fill oxd-sele_393c36');
//action.scrollToElement('Object Repository/New Folder/Page_OrangeHRM/i_Select_oxd-icon bi-caret-up-fill oxd-sele_393c36').perform();
WebUI.click(findTestObject('New Folder/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_OrangeHRM/button_Search'))

