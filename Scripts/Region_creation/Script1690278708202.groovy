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

WebUI.navigateToUrl('https://hcm-qa.azurewebsites.net/login/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/new region/Page_Login - Contract Management/input_Email_inputEmailAddress'), 
    'hallmarkappr1@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/new region/Page_Login - Contract Management/input_Password_inputPassword'), 
    'p4y+y39Ir5OTdtOb306gDg==')

WebUI.click(findTestObject('Object Repository/new region/Page_Login - Contract Management/button_Login with Password'))

WebUI.click(findTestObject('Object Repository/new region/Page_Login - Contract Management/span_Trinidad Health_ng-arrow-wrapper'))

WebUI.waitForElementPresent(findTestObject('Object Repository/new region/Page_Login - Contract Management/div_Automation'), 
    0)

WebUI.click(findTestObject('Object Repository/new region/Page_Login - Contract Management/span_Automation'))

WebUI.click(findTestObject('Object Repository/new region/Page_Login - Contract Management/div_Automation_1'))

WebUI.click(findTestObject('Object Repository/new region/Page_Login - Contract Management/div_Contract Management Please select an Or_fa4c31'))

WebUI.click(findTestObject('Object Repository/new region/Page_Login - Contract Management/span_System Administrator1'))

WebUI.click(findTestObject('Object Repository/new region/Page_Login - Contract Management/button_Login'))

WebUI.click(findTestObject('Object Repository/new region/Page_Dashboard - Contract Management/div_Dashboard'))

WebUI.doubleClick(findTestObject('Object Repository/new region/Page_Dashboard - Contract Management/span_Dashboard'))

WebUI.doubleClick(findTestObject('Object Repository/new region/Page_Dashboard - Contract Management/span_Dashboard'))

WebUI.waitForElementPresent(findTestObject('Object Repository/new region/Page_Dashboard - Contract Management/span_Dashboard'), 
    0)

WebUI.waitForElementPresent(findTestObject('Object Repository/new region/Page_Dashboard - Contract Management/a_Region'), 
    0)

WebUI.click(findTestObject('Object Repository/new region/Page_Dashboard - Contract Management/a_Region'))

WebUI.click(findTestObject('Object Repository/new region/Page_Region - Contract Management/button_Add Region'))

WebUI.setText(findTestObject('Object Repository/new region/Page_Region - Contract Management/input_grid_474636511_0_header_table_Name'), 
    'Reg_12345')

WebUI.setText(findTestObject('Object Repository/new region/Page_Region - Contract Management/input_Change Order_form-control ng-untouche_967a65'), 
    'RID_12345')

WebUI.click(findTestObject('Object Repository/new region/Page_Region - Contract Management/div_SavedRegion saved'))

WebUI.click(findTestObject('Object Repository/new region/Page_Region - Contract Management/div_Region saved'))

WebUI.verifyElementText(findTestObject('Object Repository/new region/Page_Region - Contract Management/div_Region saved'), 
    'Region saved')

WebUI.setText(findTestObject('Object Repository/new region/Page_Region - Contract Management/input_Change Order_form-control ng-untouche_967a65'), 
    'Reg_12345')

WebUI.click(findTestObject('Object Repository/new region/Page_Region - Contract Management/td_Reg_12345'))

WebUI.verifyElementText(findTestObject('Object Repository/new region/Page_Region - Contract Management/td_Reg_12345'), 'Reg_12345')

WebUI.click(findTestObject('Object Repository/new region/Page_Region - Contract Management/button_RID_12345_grid_474636511_0Delete_0_g_94d48b'))

WebUI.click(findTestObject('Object Repository/new region/Page_Region - Contract Management/button_Ok'))

WebUI.click(findTestObject('Object Repository/new region/Page_Region - Contract Management/div_DeletedRegion deleted'))

WebUI.verifyElementText(findTestObject('Object Repository/new region/Page_Region - Contract Management/div_Region deleted'), 
    'Region deleted')

