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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.openBrowser('')

WebUI.navigateToUrl('https://staging-app.dispatcher.com/login?redirectTo=%2F')

WebUI.setText(findTestObject('Object Repository/WasteDynamics/Page_Dispatcher/input_Log in to use Dispatcher_email'), 'dispatcher_auto@wastedynamics.com')

WebUI.setEncryptedText(findTestObject('Object Repository/WasteDynamics/Page_Dispatcher/input_Log in to use Dispatcher_password'), 
    'bTtAhHCN8a/02r0aiZyIhA==')

WebUI.click(findTestObject('Object Repository/WasteDynamics/Page_Dispatcher/button_Enter'))

WebUI.click(findTestObject('Object Repository/WasteDynamics/Page_Dispatcher/i_settings'))

WebUI.click(findTestObject('Object Repository/WasteDynamics/Page_Dispatcher/a_Site Types'))

WebUI.click(findTestObject('Object Repository/WasteDynamics/Page_Dispatcher/i_mode_edit'))

WebUI.click(findTestObject('Object Repository/WasteDynamics/Page_Dispatcher/input_Site Type Name_name'))

WebUI.click(findTestObject('Object Repository/WasteDynamics/Page_Dispatcher/div_Edit Existing Site TypeCancelChange Sta_ec6c08'))

WebUI.sendKeys(findTestObject('WasteDynamics/Page_Dispatcher/input_Site Type Name_name'), Keys.chord(Keys.COMMAND, 'a'))

WebUI.sendKeys(findTestObject('WasteDynamics/Page_Dispatcher/input_Site Type Name_name'), Keys.chord(Keys.DELETE))

String charset = (('A'..'Z') + ('0'..'9')).join()

Integer length = 9

String randomString = RandomStringUtils.random(length, charset.toCharArray())

WebUI.sendKeys(findTestObject('WasteDynamics/Page_Dispatcher/input_Site Type Name_name'), Keys.chord(randomString), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/WasteDynamics/Page_Dispatcher/span_Save Changes'))

CustomKeywords.'com.example.ApplicationFunction.enhanced_ClickOnDropDown'(findTestObject('WasteDynamics/All_value'), randomString)

WebUI.delay(20)

