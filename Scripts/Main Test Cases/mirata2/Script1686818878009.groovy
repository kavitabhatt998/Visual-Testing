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

WebUI.navigateToUrl('https://qa.mirataforms.com/qa-feb2023/inbox/index.html#/overview')

WebUI.click(findTestObject('Object Repository/mirata2/mirata3/Page_Forms Inbox/span_Click to Sign In'))

WebUI.setText(findTestObject('Object Repository/mirata2/mirata3/Page_Signin/input_Email_username'), 'kavita.bhatt@katalon.com')

WebUI.setEncryptedText(findTestObject('Object Repository/mirata2/mirata3/Page_Signin/input_Password_password'), '2PaIYkut6+PP7lc1iOrB7Q==')

WebUI.click(findTestObject('Object Repository/mirata2/mirata3/Page_Signin/input_Forgot your password_signInSubmitButton'))

WebUI.maximizeWindow()

WebUI.waitForElementPresent(findTestObject('Object Repository/mirata2/mirata3/Page_Forms Inbox/img'), 0)

WebUI.click(findTestObject('Object Repository/mirata2/mirata3/Page_Forms Inbox/img'))

WebUI.setText(findTestObject('Object Repository/mirata2/mirata3/Page_Forms Inbox/input_Starting a New Form_submission-search'), 
    'Copy of aTL_construction water leak report')

WebUI.delay(30)

WebUI.click(findTestObject('Object Repository/mirata2/mirata3/Page_Forms Inbox/div_Create'))

WebUI.click(findTestObject('Object Repository/mirata2/mirata3/Page_Forms Inbox/div'))

WebUI.waitForElementPresent(findTestObject('Object Repository/mirata2/mirata3/Page_Forms Inbox/span_Assign To'), 0)

WebUI.click(findTestObject('Object Repository/mirata2/mirata3/Page_Forms Inbox/body_You need to enable JavaScript to run t_94389e'))

WebUI.click(findTestObject('Object Repository/mirata2/mirata3/Page_Forms Inbox/li_Ann Demo'))

WebUI.click(findTestObject('Object Repository/mirata2/mirata3/Page_Forms Inbox/span_OK'))

WebUI.click(findTestObject('Object Repository/mirata2/mirata3/Page_Forms Inbox/ul_Copy of aTL_construction water leak repo_8e1206'))

