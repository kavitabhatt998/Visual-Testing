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

WebUI.navigateToUrl('http://prod.optick.io/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/alejo/Page_Optick - Making Data Smarter/a_Login'))

WebUI.setText(findTestObject('Object Repository/alejo/Page_Optick - Login/input_Login_username'), 'kkpante@hotmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/alejo/Page_Optick - Login/input_Login_password'), '8SQVv/p9jVTHLrggi8kCzw==')

WebUI.click(findTestObject('Object Repository/alejo/Page_Optick - Login/button_Sign in'))

WebUI.click(findTestObject('Object Repository/alejo/Page_Optick - Create An Account/a_add subscription'))

WebUI.navigateToUrl('http://prod.optick.io/subscription/47067494840000')

WebUI.selectOptionByValue(findTestObject('Object Repository/alejo/Page_Optick - Contact Us/select_Select Credit CardVISA_4242'), 
    '109880781146337', true)

WebUI.click(findTestObject('Object Repository/alejo/Page_Optick - Contact Us/button_Continue'))

WebUI.uploadFile(findTestObject('Object Repository/alejo/Page_Optick - Product Detail/button_Upload'), '/Users/kavitabhatt/Downloads/image.png')

WebUI.selectOptionByValue(findTestObject('Object Repository/alejo/Page_Optick - Product Detail/select_Select EngineNeuralStandard'), 
    'standard', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/alejo/Page_Optick - Product Detail/select_Select VoiceAmyEmmaBrian'), 
    'Amy', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/alejo/Page_Optick - Product Detail/select_Select LanguageArabicChinese_Mandari_d78a49'), 
    'en-GB', true)

WebUI.click(findTestObject('alejo/Page_Optick - Product Detail/Page_Optick - Product Detail/Upload'))

WebUI.click(findTestObject('Object Repository/alejo/Page_Optick - Product Detail/a_download_1'))

WebUI.click(findTestObject('Object Repository/alejo/Page_Optick - Product Detail/a_deletefile_1'))

WebUI.click(findTestObject('Object Repository/alejo/Page_Optick - Product Detail/a_Logout'))

