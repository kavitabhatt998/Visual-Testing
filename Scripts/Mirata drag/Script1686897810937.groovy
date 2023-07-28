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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa.mirataforms.com/qa-may2023/designer/index.html')

WebUI.click(findTestObject('Object Repository/Mirata drag/Page_Mirata Form Designer/span_Click to Sign In'))

WebUI.setText(findTestObject('Object Repository/Mirata drag/Page_Signin/input_Email_username'), 'kavita.bhatt@katalon.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Mirata drag/Page_Signin/input_Password_password'), '2PaIYkut6+PP7lc1iOrB7Q==')

WebUI.click(findTestObject('Object Repository/Mirata drag/Page_Signin/input_Forgot your password_signInSubmitButton'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Mirata drag/Page_Mirata Form Designer/path'))

WebUI.click(findTestObject('Object Repository/Mirata drag/Page_Mirata Form Designer/li_Form'))

WebUI.click(findTestObject('Mirata drag/Page_Mirata Form Designer/Type'))

WebUI.click(findTestObject('Object Repository/Mirata drag/Page_Mirata Form Designer/li_acme-id.form-type.drains'))

def min = 8

def max = 100000

int randomDigits = min + Math.floor(Math.random() * (max - min))

println(randomDigits)

WebUI.setText(findTestObject('Object Repository/Mirata drag/Page_Mirata Form Designer/input_Name_name'), 'demo' + randomDigits)

WebUI.click(findTestObject('Object Repository/Mirata drag/Page_Mirata Form Designer/span_OK'))

WebUI.click(findTestObject('Object Repository/Mirata drag/Page_Mirata Form Designer/path_1'))

//WebUI.click(findTestObject('Object Repository/Mirata drag/Page_Mirata Form Designer/div_image'), FailureHandling.OPTIONAL)
WebUI.click(findTestObject('Mirata drag/Page_Mirata Form Designer/image'))

CustomKeywords.'com.example.WebUICustomKeywords.keyword_moveMouse'(800, 280)

WebUI.dragAndDropByOffset(findTestObject('Mirata drag/Page_Mirata Form Designer/image'), 50, 10)

WebUI.click(findTestObject('Mirata drag/Page_Mirata Form Designer/Drop'))

WebUI.getText(findTestObject('mirata1/Page_Mirata Form Designer/input_Name_name'))

