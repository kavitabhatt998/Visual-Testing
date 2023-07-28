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
import org.apache.commons.lang.RandomStringUtils as RandStr
import org.apache.commons.lang.RandomStringUtils

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa.mirataforms.com/qa-feb2023/designer/index.html')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://qa.mirataforms.com/qa-feb2023/designer/index.html')

WebUI.click(findTestObject('Object Repository/Mirata/Page_Mirata Form Designer/span_Click to Sign In'))

WebUI.setText(findTestObject('Object Repository/Mirata/Page_Signin/input_Email_username'), 'kavita.bhatt@katalon.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Mirata/Page_Signin/input_Password_password'), '2PaIYkut6+PP7lc1iOrB7Q==')

WebUI.click(findTestObject('Object Repository/Mirata/Page_Signin/input_Forgot your password_signInSubmitButton'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Mirata/Page_Mirata Form Designer/svg_Create_renderer-MuiSvgIcon-root'), 
    0)

WebUI.click(findTestObject('Object Repository/Mirata/Page_Mirata Form Designer/svg_Create_renderer-MuiSvgIcon-root'))

WebUI.click(findTestObject('Object Repository/Mirata/Page_Mirata Form Designer/li_Form'))

WebUI.click(findTestObject('Object Repository/Mirata/Page_Mirata Form Designer/body_You need to enable JavaScript to run t_2eff08'))

WebUI.click(findTestObject('Object Repository/Mirata/Page_Mirata Form Designer/li_acme-id.form-type.terri-ype'))

//int randomDigits
//randomDigits = (Math.random())
//def x =  RandStr.randomNumeric(9, 100)
//WebUI.setText(findTestObject('Object Repository/Mirata/Page_Mirata Form Designer/input_Name_name'), 'demo' + x  )
//WebUI.setText(findTestObject('Object Repository/Mirata/Page_Mirata Form Designer/input_Name_name'), 'demo' + randomDigits.toString() )
// this will give you current timestamp in seconds
//long ts = System.currentTimeMillis() / 1000L
// you need string, so simply convert long to String
//String tsAsString = ts.toString()
// and finally, use your unique number in setText method
//WebUI.setText(findTestObject('Object Repository/Mirata/Page_Mirata Form Designer/input_Name_name'), 'demo' + tsAsString)
//def min = 8
//
//def max = 100000
//
//int randomDigits = min + Math.floor(Math.random() * (max - min))
//
//println(randomDigits)
String charset = (('A'..'Z') + ('0'..'9')).join()
Integer length = 9
String randomString = RandomStringUtils.random(length, charset.toCharArray())

WebUI.setText(findTestObject('Object Repository/Mirata/Page_Mirata Form Designer/input_Name_name'), 'demo' + randomString)

WebUI.click(findTestObject('Object Repository/Mirata/Page_Mirata Form Designer/span_OK'))

WebUI.click(findTestObject('Mirata/image'))

CustomKeywords.'com.example.WebUICustomKeywords.keyword_moveMouse'(700, 280)

WebUI.dragAndDropByOffset(findTestObject('Mirata/image'), 50, 10)

WebUI.click(findTestObject('Object Repository/Mirata/Page_Mirata Form Designer/div_qa  2.0.27 (9837)  23-May-2023_inbox-tr_6f51c7'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Mirata/Page_Mirata Form Designer/div_image-1'), 0)

